package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.*;
import com.qilinxx.kuding.domain.model.*;
import com.qilinxx.kuding.domain.model.vo.GrantVo;
import com.qilinxx.kuding.service.GrantService;
import com.qilinxx.kuding.service.TalkService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GrantServiceImpl implements GrantService {

    @Value("${meeting_capacity}")
    private int meeting_capacity;

    @Value("${time_long}")
    private int time_long;

    @Autowired
    TalkService talkService;

    @Autowired
    private GrantMapper grantMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private DetailMapper detailMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Teacher selectShowTeacher(String id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GrantVo> selectAllGrant() {
        List<Grant> grants = grantMapper.selectAll();
        System.out.println(grants.get(0).toString());
        List<GrantVo> newList = new ArrayList<>();
        for (Grant g : grants) {
            newList.add(improve(g));
        }
        return newList;
    }

    @Override
    public List<Course> getCourseList() {
        return courseMapper.selectOnUseCourse();
    }

    @Override
    public String updateGrantTimeById(String gid, String time) {
        if (time == null || "".equals(time)) return "时间未选择";
        Grant grant = grantMapper.selectByPrimaryKey(gid);
        Date date = DateKit.dateFormat(time);
        Long unixDate = DateKit.getUnixTimeLong(date);
        int unix = DateKit.getUnixTimeByDate(date);
        String json = talkService.createMeetingOn(meeting_capacity, time_long, unix);
        grant.setgUrl(json);
        grant.setgTime(unixDate);
        if ("2".equals(grant.getgRecord())) grant.setgRecord("0");//重新安排已取消的课程
        grantMapper.updateByPrimaryKey(grant);
        Detail detail=detailMapper.selectByPrimaryKey(grant.getgDidId());
        return "修改"+detail.getdName()+"的上课时间为"+time+"&&"+grant.getgSidId()+"&&"+grant.getgTidId();
    }

    @Override
    public String updateStatusById(String gid) {
        Grant grant = grantMapper.selectByPrimaryKey(gid);
        grant.setgRecord("2");
        grantMapper.updateByPrimaryKey(grant);
        Detail detail=detailMapper.selectByPrimaryKey(grant.getgDidId());
        return "取消"+detail.getdName()+"成功&&"+grant.getgSidId()+"&&"+grant.getgTidId();
    }


    @Override
    public String addGrant(String sName, String sPhone, String tName, String cName) {
        Student student = studentMapper.selectByPhone(sPhone);
        Teacher teacher = teacherMapper.selectByName(tName);
        if (null == student) return "手机号未注册";

        if (!sName.equals(student.getsName())) return "学生名不正确";

        if (teacher == null) return "老师姓名不正确";

        String cId = courseMapper.selectIdByName(cName);
        List<Detail> details = detailMapper.selectAllByCid(cId);
        if (details.size() == 0) return "选择课程已失效";

        Integer num = grantMapper.isExist(student.getsId(), details.get(0).getdId());
        if (num != null) return "此课程已购买";
        for (Detail d : details) {
            //选择课程状态已 1 在用的
            if ("1".equals(d.getdRemark())) {
                Grant grant = new Grant();
                grant.setgTidId(teacher.gettId());
                grant.setgDidId(d.getdId());
                grant.setgSidId(student.getsId());
                grant.setgId(UUID.UU32());
                grantMapper.insertSelective(grant);
            }
        }
        return "添加 "+cName+" 成功&&"+student.getsId()+"&&"+teacher.gettId();
    }

    private GrantVo improve(Grant grant) {
        Student s = studentMapper.selectByPrimaryKey(grant.getgSidId());
        Teacher t = teacherMapper.selectByPrimaryKey(grant.getgTidId());
        Detail d = detailMapper.selectByPrimaryKey(grant.getgDidId());
        Course c = courseMapper.selectByPrimaryKey(d.getdCidId());
        GrantVo grantVo = new GrantVo();
        grantVo.setgId(grant.getgId());
        grantVo.setgRecord(grant.getgRecord());
        grantVo.setgRemark(grant.getgRemark());
        grantVo.setgTime(grant.getgTime());
        grantVo.setgUrl(grant.getgUrl());
        grantVo.setgDidId(grant.getgDidId());
        grantVo.setgTidId(grant.getgTidId());
        grantVo.setgSidId(grant.getgSidId());
        grantVo.setCourse(c);
        grantVo.setDetail(d);
        grantVo.setStudent(s);
        grantVo.setTeacher(t);
        return grantVo;
    }
}

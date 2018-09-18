package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.*;
import com.qilinxx.kuding.domain.model.*;
import com.qilinxx.kuding.domain.model.vo.GrantVo;
import com.qilinxx.kuding.service.GrantService;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrantServiceImpl implements GrantService {
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
    public Grant selectGrantById(String id) {
        return grantMapper.selectByPrimaryKey(id);
    }

    @Override
    public String addGrant(String sName, String sPhone, String tName, String cName) {
        Student student = studentMapper.selectByPhone(sPhone);
        Teacher teacher = teacherMapper.selectByName(tName);
        if (null == student) return "手机号未注册";
        if (!sName.equals(student.getsName())) return "学生名不正确";
        if (teacher == null) return "老师姓名不正确";
        String cId = courseMapper.selectIdByName(cName);
        System.out.println("cid"+cId);
        List<Detail> details = detailMapper.selectAllByCid(cId);
        System.out.println("List<Detail>-->"+details.size());
        for (Detail d : details) {
            System.out.println(d);
            Grant grant=new Grant();
            grant.setgTidId(teacher.gettId());
            grant.setgDidId(d.getdId());
            grant.setgSidId(student.getsId());
            grant.setgId(UUID.UU32());
            grantMapper.insertSelective(grant);
        }
        return "成功添加";
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

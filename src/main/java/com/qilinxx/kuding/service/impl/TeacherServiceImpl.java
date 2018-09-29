package com.qilinxx.kuding.service.impl;

import com.qilinxx.kuding.domain.mapper.TeacherMapper;
import com.qilinxx.kuding.domain.model.Teacher;
import com.qilinxx.kuding.service.TeacherService;
import com.qilinxx.kuding.util.DateKit;
import com.qilinxx.kuding.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher selectTeacherById(String uid) {


        return teacherMapper.selectByPrimaryKey(uid);
    }

    @Override
    public Integer changePasswordByTId(String sId, String newpassword) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(sId);
        teacher.settPassword(newpassword);
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        return teacherMapper.selectAll();
    }

    @Override
    public Integer addTeacher(MultipartFile file, HttpServletRequest request, Teacher teacher) {
        teacher.settId(UUID.UU32());
        //获取时间
        Date now = DateKit.getNow();
        System.out.println("当前时间："+now);
        long timeLong = DateKit.getUnixTimeLong(now);
        System.out.println("转换后的："+timeLong);
        teacher.settCreateTime(timeLong);
        //保存头像
        Teacher teacher1 = saveAttach(file, request, teacher);
        return   teacherMapper.insert(teacher1);
    }
    /**
    *@Author: pengxiaoyu
    * @Description: 保存头像的方法
    * @Param: [file, request, teacher]
    * @return: com.qilinxx.kuding.domain.model.Teacher
    * @Date: 2018/9/26
    */
    public Teacher saveAttach(MultipartFile file, HttpServletRequest request, Teacher teacher) {
        System.out.println("开始保存图片");
        String filename = java.util.UUID.randomUUID().toString().replaceAll("-", "");
        String ext = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        //保存文件的绝对路径
        String realPath = request.getServletContext().getRealPath("/");
        String filePath = realPath + "resource" + File.separator+filename+ext;
        System.out.println("绝对路径:"+filePath);
        //在不存在文件夹的情况下，创建文件夹
        File newFile = new File(filePath);
        if(!newFile.exists()){
            newFile.getParentFile().mkdirs();
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //数据库存储的相对路径
        String projectPath = request.getServletContext().getContextPath();

        String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+projectPath;
        String url = contextPath + "/resource/";
        System.out.println("相对路径:"+url+filename+ext);
        teacher.settHeadImage(url+filename+ext);
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    @Override
    public Integer deleteTeacherById(String uid) {
        return teacherMapper.delete(teacherMapper.selectByPrimaryKey(uid));
    }

    @Override
    public Integer stopTeacher(String uid) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(uid);
        teacher.settState(false);
        return teacherMapper.updateByPrimaryKey(teacher);
    }

    @Override
    public Integer startTeacher(String uid) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(uid);
        teacher.settState(true);
        return teacherMapper.updateByPrimaryKey(teacher);

    }

    @Override
    public void editTeacher(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public Integer editTeacherAndFile(MultipartFile file, HttpServletRequest request, Teacher teacher) {
        Teacher teacher1=saveAttach(file,request,teacher);
        return teacherMapper.updateByPrimaryKeySelective(teacher1);
    }

    @Override
    public String selectNameById(String sId) {
        return teacherMapper.selectNameById(sId);
    }


}

package com.qilinxx.kuding.domain.model.vo;

import com.qilinxx.kuding.domain.model.*;

/**
 * @Auther: dqsdc
 * @Date: 2018-09-18 10:03
 * @Description:重构了部分Grant字段，便于授课展示
 */
public class GrantVo extends Grant{
    Student student;
    Teacher teacher;
    Course course;
    Detail detail;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "GrantVo{" +
                "student=" + student +
                ", teacher=" + teacher +
                ", course=" + course +
                ", detail=" + detail +
                '}';
    }
}

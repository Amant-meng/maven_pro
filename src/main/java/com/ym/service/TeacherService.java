package com.ym.service;

import com.ym.entity.Teacher;
import com.ym.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName:
 * @Auther: Meng.yang
 * @Description: 教师业务处理层
 * @Date: 2020/06/04
 */
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public  List<Teacher> getTeacherList(){

        List<Teacher> teacherList = teacherMapper.selectByExample(null);
        return teacherList;

    }

}

package com.ym.controller;

import com.ym.entity.Teacher;
import com.ym.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName:
 * @Auther: Meng.yang
 * @Description: 教师接口
 * @Date: 2020/06/05
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "getTeacherList",method = RequestMethod.GET)
    public String getTeacherList(Map map){

        List<Teacher> teacherList = teacherService.getTeacherList();
        map.put("teacherList",teacherList);
        return null;
    }

}

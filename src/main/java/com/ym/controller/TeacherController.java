package com.ym.controller;

import com.ym.entity.Teacher;
import com.ym.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName:
 * @Auther: Meng.yang
 * @Description: 教师接口
 * @Date: 2020/06/05
 */

//@RequestMapping(value = "teacher")
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 查询学生列表方法
     * @param map
     * @return
     */
    @RequestMapping(value = "/getTeacherList")
    @ResponseBody
    public String getTeacherList(Map map){
        List<Teacher> teacherList = teacherService.getTeacherList();
        System.out.println("..........."+teacherList.toString());
        map.put("teacherList",teacherList);
        return "list";//返回的是jsp页面
    }

    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    public String addTeacher(Map map){
        List<Teacher> teacherList = teacherService.getTeacherList();
        map.put("teacherList",teacherList);
        return "list";//返回的是jsp页面
    }

}

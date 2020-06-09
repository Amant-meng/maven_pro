package com.ym.service;

import com.ym.entity.Dept;
import com.ym.entity.Teacher;
import com.ym.entity.TeacherVo;
import com.ym.mapper.DeptMapper;
import com.ym.mapper.TeacherMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ProjectName:
 * @Auther: Meng.yang
 * @Description: 教师业务处理层
 * @Date: 2020/06/04
 */
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private DeptMapper deptMapper;

    public  List<Teacher> getTeacherList(){
        List<Teacher> teacherList = null;
        try {
            teacherList = teacherMapper.selectByExample(null);
        }catch (Exception e){

        }
        return teacherList;

    }

    public Teacher getTeacherById(int t_id){
        Teacher teacher = teacherMapper.selectByPrimaryKey(t_id);
        return teacher;
    }


    public int delTeacherById(int t_id){
       int result =  teacherMapper.deleteByPrimaryKey(t_id);
       return result;
    }


    public TeacherVo getTeacherVo(int t_id){
        TeacherVo teacherVo = new TeacherVo();
        Teacher teacher = teacherMapper.selectByPrimaryKey(t_id);
        //拷贝文件
        BeanUtils.copyProperties(teacher,teacherVo);
        int deptId = teacher.getDept_id();
        Dept dept = deptMapper.selectByPrimaryKey(deptId);
        teacherVo.setDept_name(dept.getDept_name());
        return teacherVo;
    }

    public List<Teacher> queryTeacherList(){

        List<Teacher> teacherList = teacherMapper.queryTeacherList();
        return teacherList;
    }

}

package com.ym.mapper;

import com.ym.entity.Teacher;
import com.ym.entity.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    /**
     * 查询
     * @return
     */
    List<Teacher> queryTeacherList();

    /**
     * 通过ID查询教师信息
     * @param t_id
     * @return
     */
    Teacher getTeacherById(int t_id);

    /**
     * 添加教师
     * @param teacher
     * @return
     */
    int addTeacher(Teacher teacher);

    /**
     * 删除教师
     * @param t_id
     * @return
     */
    int delTeacherById(int t_id);

    /**
     * 修改教师信息
     * @param teacher
     * @return
     */
    int updateTeacher(Teacher teacher);



    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer t_id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer t_id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}
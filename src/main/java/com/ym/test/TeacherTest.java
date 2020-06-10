package com.ym.test;

import com.ym.entity.Teacher;
import com.ym.mapper.TeacherMapper;
import com.ym.service.TeacherService;
import com.ym.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Date;
import java.util.List;


public class TeacherTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void queryTeacherList() throws IOException {

        //1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sBuilder = new SqlSessionFactoryBuilder();

        //2.创建SqlSessionFactory对象
        String file = "SqlMapConfig.xml";
        Reader reader = Resources.getResourceAsReader(file);
        SqlSessionFactory sqlSessionFactory = sBuilder.build(reader);

        //3.创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        System.out.println("TeacherMapper实现的代理对象" + teacherMapper);
        List<Teacher> teacherList = teacherMapper.queryTeacherList();
        if (teacherList.size() > 0) {
            System.out.println("数据库查询总条数：" + teacherList.size());
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }
        }

    }

    /**
     * 添加教师功能测试
     */
    @Test
    public void addTeacher() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Teacher teacher = new Teacher();
            teacher.setT_name("董得村");
            teacher.setT_sex("男");
            teacher.setT_age("23");
            teacher.setT_phone("16643536627");
            teacher.setT_address("贵州省盘州市");
            teacher.setDept_id(2);
            teacher.setC_time(new Date());
            //获取mapper添加方法
            int row = sqlSession.getMapper(TeacherMapper.class).addTeacher(teacher);
            //提交事务  在增加，修改，删除的时候必须要提交事务 否则不会成功

            int t_id = teacher.getT_id();
            System.out.println("添加主键ID："+t_id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            //关闭事务
            MybatisUtil.closeSqlSession(sqlSession);
        }finally {
            //事务回滚操作
            sqlSession.rollback();
        }
    }

    /**
     * 删除功能测试
     */
    @Test
    public void delTeacher() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            //获取mapper添加方法
            int row = sqlSession.getMapper(TeacherMapper.class).delTeacherById(35);
            //提交事务  在增加，修改，删除的时候必须要提交事务 否则不会成功
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            //关闭事务
            MybatisUtil.closeSqlSession(sqlSession);
        }finally {
            //事务回滚操作
            sqlSession.rollback();
        }
    }

    /**
     * 通过ID获取教师信息
     */
    @Test
    public void getTeacherById(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Teacher teacher = sqlSession.getMapper(TeacherMapper.class).getTeacherById(35);
            System.out.println("获取到的教师信息:"+"\n"+teacher);
        }catch (Exception e){
            e.printStackTrace();
            //关闭事务
            MybatisUtil.closeSqlSession(sqlSession);
        }
    }


    @Test
    public void updateTeacher() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Teacher teacher = new Teacher();
            teacher.setT_id(35);
            teacher.setT_name("董得村");
            teacher.setT_sex("男");
            teacher.setT_age("23");
            teacher.setT_phone("16643536627");
            teacher.setT_address("贵州省盘州市");
            teacher.setDept_id(2);
            teacher.setM_time(new Date());
            //获取mapper添加方法
            int row = sqlSession.getMapper(TeacherMapper.class).updateTeacher(teacher);
            //提交事务  在增加，修改，删除的时候必须要提交事务 否则不会成功

            int t_id = teacher.getT_id();
            System.out.println("添加主键ID："+t_id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            //关闭事务
            MybatisUtil.closeSqlSession(sqlSession);
        }finally {
            //事务回滚操作
            sqlSession.rollback();
        }
    }



}

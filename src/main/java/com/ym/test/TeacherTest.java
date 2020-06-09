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


    @Test
    public void addTeacher() {

        SqlSession sqlSession = MybatisUtil.createSqlSession();
        Teacher teacher = new Teacher();
        teacher.setT_name("袁胜罗");
        teacher.setT_sex("男");
        teacher.setT_age("23");
        teacher.setT_phone("16643536627");
        teacher.setT_address("贵州省盘州市");
        teacher.setDept_id(2);
        //获取mapper添加方法
        sqlSession.getMapper(TeacherMapper.class).addTeacher(teacher);
        //提交事务
        sqlSession.commit();
        //关闭事务
        MybatisUtil.closeSqlSession(sqlSession);

    }

}

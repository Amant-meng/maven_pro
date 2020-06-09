package com.ym.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        //1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sBuilder = new SqlSessionFactoryBuilder();

        try {
            //2.创建SqlSessionFactory对象
            String file = "SqlMapConfig.xml";
            Reader reader = Resources.getResourceAsReader(file);
            sqlSessionFactory = sBuilder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建sqlSession对象
     *
     * @return
     */

    public static SqlSession createSqlSession() {

        /**
         * openSession(boolean)默认是true，自动提交事务
         */
        return sqlSessionFactory.openSession(false);
    }

    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
        }

    }
}

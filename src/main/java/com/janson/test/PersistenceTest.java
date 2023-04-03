package com.janson.test;

import com.janson.io.Resources;
import com.janson.pojo.User;
import com.janson.sqlSession.SqlSession;
import com.janson.sqlSession.SqlSessionFactory;
import com.janson.sqlSession.SqlSessionFactoryBuilder;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: Janson
 * @Date: 2023/4/1 15:42
 **/
public class PersistenceTest {

    public  void test () throws PropertyVetoException {
        InputStream resourceStream = Resources.getResourceStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 调用
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        Object o = sqlSession.selectOne("user.selectOne", user);



    }
}

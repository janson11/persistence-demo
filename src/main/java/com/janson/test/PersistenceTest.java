package com.janson.test;

import com.janson.io.Resources;
import com.janson.pojo.User;
import com.janson.sqlSession.SqlSession;
import com.janson.sqlSession.SqlSessionFactory;
import com.janson.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: Janson
 * @Date: 2023/4/1 15:42
 **/
public class PersistenceTest {

    @Test
    public void test() throws Exception {
        InputStream resourceStream = Resources.getResourceStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 调用
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
//        User user2 = sqlSession.selectOne("user.selectOne", user);
//        System.out.println(user2);

        List<User> users = sqlSession.selectList("user.selectList");
        for (User user1 : users) {
            System.out.println(user1);
        }

    }
}

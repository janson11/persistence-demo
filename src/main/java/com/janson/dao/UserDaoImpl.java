package com.janson.dao;

import com.janson.io.Resources;
import com.janson.pojo.User;
import com.janson.sqlSession.SqlSession;
import com.janson.sqlSession.SqlSessionFactory;
import com.janson.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: Janson
 * @Date: 2023/4/5 22:29
 **/
public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> findAll() throws Exception {
        InputStream resourceStream = Resources.getResourceStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("user.selectList");
        for (User user1 : users) {
            System.out.println(user1);
        }
        return users;
    }

    @Override
    public User findByCondition(User user) throws Exception {
        InputStream resourceStream = Resources.getResourceStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user2 = sqlSession.selectOne("user.selectOne", user);
        return user2;
    }
}

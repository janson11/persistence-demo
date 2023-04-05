package com.janson.dao;

import com.janson.pojo.User;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.util.List;

/**
 * @Description:
 * @Author: Janson
 * @Date: 2023/4/5 22:27
 **/
public interface IUserDao {

    /**
     * 查询所有用户
     */
    public List<User> findAll() throws Exception;

    /**
     * 根据条件进行用户查询
     */
    public User findByCondition(User user) throws Exception;
}

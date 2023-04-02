package com.janson.pojo;

import com.janson.io.Resources;

import java.io.InputStream;

/**
 * @Description:
 * @Author: Janson
 * @Date: 2023/4/1 15:42
 **/
public class PersistenceTest {

    public  void test () {
        InputStream resourceStream = Resources.getResourceStream("sqlMapConfig.xml");


    }
}

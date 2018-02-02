package com;

import com.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chaopeng.lv on 2018/2/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class TestMybaits {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybaits() {
        System.out.println(userMapper.findUser("admin"));
    }


}

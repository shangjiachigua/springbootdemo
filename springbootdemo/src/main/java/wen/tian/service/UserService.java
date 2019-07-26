package wen.tian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wen.tian.mapper.UserMapper;
import wen.tian.pojo.User;

import java.util.List;

/**
 * @author tianwenwen
 * @date 2019/7/25 23:26
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUser(){
        return userMapper.selectAll();
    }
    /*springboot 事务
    * */
    @Transactional
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}

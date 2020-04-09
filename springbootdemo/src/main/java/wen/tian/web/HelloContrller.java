package wen.tian.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wen.tian.pojo.User;
import wen.tian.service.UserService;

import java.util.List;

/**
 * @author tianwenwen
 * @date 2019/7/25 21:16
 **/
@RestController
@RequestMapping("user")
public class HelloContrller {
    @Autowired
    private UserService userService;
    @GetMapping("hello")
    public String hello(){
        return "hello spring boot";
    }
}

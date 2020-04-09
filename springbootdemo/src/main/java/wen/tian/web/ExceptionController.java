package wen.tian.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wen.tian.exception1.ResourceNotFoundException;
import wen.tian.pojo.Person;
import wen.tian.pojo.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tian
 * @version 1.0.0
 * @ClassName ExceptionController.java
 * @createTime 2020年04月09日 10:54
 **/
@RestController
@RequestMapping("api")
public class ExceptionController {
    @GetMapping("/test")
    public void throwException() {
        Person p = new Person(1L, "SnailClimb");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("person id:", p.getId());
        throw new ResourceNotFoundException(hashMap);
    }
}

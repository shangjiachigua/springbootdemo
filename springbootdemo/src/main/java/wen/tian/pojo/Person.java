package wen.tian.pojo;

import lombok.Data;

/**
 * @author tian
 * @version 1.0.0
 * @ClassName User1.java
 * @createTime 2020年04月09日 10:56
 **/
@Data
public class Person {
    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

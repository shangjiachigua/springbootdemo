package wen.tian.pojo;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @author tianwenwen
 * @date 2019/7/25 22:54
 **/
@Data
@Table(name = "users")
public class User {
    private String id;
    private String userAccount;
    private String userPassword;
    private String telephone;
    private String userPic;
    private Date createAt;
//    省略get和set
}

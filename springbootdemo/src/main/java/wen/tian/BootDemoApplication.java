package wen.tian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author tianwenwen
 * @date 2019/7/25 21:13
 **/
@SpringBootApplication
@MapperScan("wen.tian.mapper")
@RestController
public class BootDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(BootDemoApplication.class);
    }
    @RequestMapping
    public String testDemo(){
        return "HELLO SPRING BOOT";
    }

}

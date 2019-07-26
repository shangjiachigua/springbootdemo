package wen.tian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author tianwenwen
 * @date 2019/7/25 21:13
 **/
@SpringBootApplication
@MapperScan("wen.tian.mapper")
public class BootDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(BootDemoApplication.class);
    }
}

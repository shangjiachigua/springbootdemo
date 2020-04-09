package wen.tian;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author tianwenwen
 * @date 2019/7/25 21:13
 **/
@EnableAsync
@EnableSwagger2Doc
@SpringBootApplication
@MapperScan("wen.tian.mapper")
public class BootDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(BootDemoApplication.class);
    }


}

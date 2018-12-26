package boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","service"})
@MapperScan(basePackages  = {"mapper"})
public class TestBoot {
    public static void main(String[] args) {
        SpringApplication.run(TestBoot.class, args);
    }
}

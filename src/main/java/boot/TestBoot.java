package boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"controller","service","configuration","interceptor","utils","rabbitmq"})
@MapperScan(basePackages  = {"mapper","domain"})
public class TestBoot extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TestBoot.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TestBoot.class, args);
    }
}

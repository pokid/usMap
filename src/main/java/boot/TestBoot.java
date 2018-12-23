package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"controller","dao","service"})
public class TestBoot {
    public static void main(String[] args) {
        SpringApplication.run(TestBoot.class, args);
        System.out.println();
    }
}

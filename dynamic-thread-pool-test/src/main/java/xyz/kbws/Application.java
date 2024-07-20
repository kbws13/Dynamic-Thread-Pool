package xyz.kbws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author kbws
 * @date 2024/7/20
 * @description:
 */
@SpringBootApplication
@Configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

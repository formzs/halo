package run.halo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Halo main class.
 *
 * @author ryanwang
 * @date 2017-11-14
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 自定义 spring 配置位置
        System.setProperty("spring.config.additional-location",
            "optional:file:${user.home}/.halo/,optional:file:${user.home}/halo-dev/");

        // Run application
        SpringApplication.run(Application.class, args);
    }

}

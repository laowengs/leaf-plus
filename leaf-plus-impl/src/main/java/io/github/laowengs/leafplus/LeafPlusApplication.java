package io.github.laowengs.leafplus;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class LeafPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafPlusApplication.class, args);
    }
//
}

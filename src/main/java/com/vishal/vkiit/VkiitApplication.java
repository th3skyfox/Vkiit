package com.vishal.vkiit;

import com.vishal.vkiit.config.VkiitConfigurationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({VkiitConfigurationProperties.class})
public class VkiitApplication {

    @Autowired
    private VkiitConfigurationProperties vkiitConfigurationProperties;

    public static void main(String[] args) {
        SpringApplication.run(VkiitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("Welcome Message :" + vkiitConfigurationProperties.getWelcomeMsg());
        };
    }

}

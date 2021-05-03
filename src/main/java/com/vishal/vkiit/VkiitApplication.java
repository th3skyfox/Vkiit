package com.vishal.vkiit;

import com.vishal.vkiit.config.VkiitConfigurationProperties;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties({VkiitConfigurationProperties.class})
@EnableJpaAuditing
public class VkiitApplication {

    @Autowired
    private VkiitConfigurationProperties vkiitConfigurationProperties;

    public static void main(String[] args) {
        SpringApplication.run(VkiitApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime(){
        return new PrettyTime();
    }


}

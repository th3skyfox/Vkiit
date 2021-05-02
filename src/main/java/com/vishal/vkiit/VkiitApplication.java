package com.vishal.vkiit;

import com.vishal.vkiit.config.VkiitConfigurationProperties;
import com.vishal.vkiit.domain.Comment;
import com.vishal.vkiit.domain.Link;
import com.vishal.vkiit.repository.CommentRepository;
import com.vishal.vkiit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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

//    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting Started with Spring boot 2","https://www.danvega.dev/docs/spring-boot-2-docs/");
            linkRepository.save(link);

            Comment comment = new Comment("This spring boot 2 link is awesome!!", link);
            commentRepository.save(comment);

            link.addComment(comment);
        };
   }

}

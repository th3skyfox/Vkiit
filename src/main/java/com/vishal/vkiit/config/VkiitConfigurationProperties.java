package com.vishal.vkiit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("vkiit")
public class VkiitConfigurationProperties {

    private String welcomeMsg = "Hello World!";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}

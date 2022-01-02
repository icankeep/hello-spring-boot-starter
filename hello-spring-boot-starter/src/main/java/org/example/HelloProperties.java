package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhouwenhua02
 * @date 2022/1/2
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

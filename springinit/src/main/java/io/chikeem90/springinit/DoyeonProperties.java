package io.chikeem90.springinit;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;

@Component
@ConfigurationProperties("doyeon")
@Validated
public class DoyeonProperties {
    @NotEmpty
    private String name;
    private int age;
    private String fullName;
    private Duration sessionTimeout = Duration.ofSeconds(30);

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
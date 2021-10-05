package org.soyphea.ruleprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(LoginEventBinder.class)
public class RuleProcessingApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuleProcessingApplication.class, args);
    }

}

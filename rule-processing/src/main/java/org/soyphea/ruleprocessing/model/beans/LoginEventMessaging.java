package org.soyphea.ruleprocessing.model.beans;

import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class LoginEventMessaging implements Serializable {
    private String eventName;
    private String serviceName;
    private String operation;
    private String username;
    private boolean isLoginSuccess;
}

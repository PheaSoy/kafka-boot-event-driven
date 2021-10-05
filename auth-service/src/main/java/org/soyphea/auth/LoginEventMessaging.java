package org.soyphea.auth;

import lombok.*;

@Builder
@AllArgsConstructor
@Setter
@ToString
@Getter
public class LoginEventMessaging extends EventBase {

    public LoginEventMessaging(String eventName, String serviceName, String operation) {
        super("LOGIN_EVENT", "auth-service", "LOGIN");
    }
    public LoginEventMessaging() {
        super("LOGIN_EVENT", "auth-service", "LOGIN");
    }

    private String username;
    private boolean isLoginSuccess;

}

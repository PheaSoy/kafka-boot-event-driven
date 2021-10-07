package org.soyphea.ruleprocessing.processor.login;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface LoginEventBinder {

    String LOGIN_IN = "login-in";

    @Input(LOGIN_IN)
    SubscribableChannel receive();
}

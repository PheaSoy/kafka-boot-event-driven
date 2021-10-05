package org.soyphea.ruleprocessing;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface LoginEventBinder {

    String LOGIN_IN = "login-in";

    @Input(LOGIN_IN)
    SubscribableChannel receive();
}

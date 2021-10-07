package org.soyphea.auth;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface LoginEventBinder {

    String LOGIN_OUT = "login-out";
    String LOGIN_IN = "login-in-disabled";

    @Output(LOGIN_OUT)
    MessageChannel report();

    @Input(LOGIN_IN)
    SubscribableChannel receive();

}

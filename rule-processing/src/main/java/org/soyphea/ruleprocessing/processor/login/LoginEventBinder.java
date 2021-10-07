package org.soyphea.ruleprocessing.processor.login;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface LoginEventBinder {

    String LOGIN_IN = "login-in";
    String LOGIN_OUT_DISABLE = "login-out-disable";

    @Output(LOGIN_OUT_DISABLE)
    MessageChannel send();

    @Input(LOGIN_IN)
    SubscribableChannel receive();
}

package org.soyphea.auth;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class AuthProcessor {

    @StreamListener(LoginEventBinder.LOGIN_IN)
    public void received(Message message){
        //TODO process based on demand.
    }
}

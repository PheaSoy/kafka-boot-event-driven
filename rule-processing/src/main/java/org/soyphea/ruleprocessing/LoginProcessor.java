package org.soyphea.ruleprocessing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginProcessor {

    @StreamListener(LoginEventBinder.LOGIN_IN)
    public void receive(Message<LoginEventMessaging> loginEventMessagingMessage) {
        log.info("Received the msg: {}", loginEventMessagingMessage.getPayload());
    }
}

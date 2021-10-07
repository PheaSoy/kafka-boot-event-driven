package org.soyphea.ruleprocessing.processor.login;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.soyphea.ruleprocessing.model.beans.LoginEventMessaging;
import org.soyphea.ruleprocessing.model.entity.LoginEventEntity;
import org.soyphea.ruleprocessing.repository.LoginRepository;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Slf4j
@AllArgsConstructor

public class LoginProcessor {

    private final LoginRepository loginRepository;

    @StreamListener(LoginEventBinder.LOGIN_IN)
    public void receive(Message<LoginEventMessaging> loginEventMessagingMessage) {
        log.info("Received the msg: {}", loginEventMessagingMessage.getPayload());
        LoginEventMessaging loginReceived = loginEventMessagingMessage.getPayload();

        LoginEventEntity loginEventEntity = LoginEventEntity.builder()
                .createdDate(Instant.now())
                .lastModifiedDate(Instant.now())
                .username(loginReceived.getUsername())
                .isSuccess(loginReceived.isLoginSuccess())
                .operation(loginReceived.getOperation())
                .build();
        loginRepository.save(loginEventEntity).subscribe();
    }
}

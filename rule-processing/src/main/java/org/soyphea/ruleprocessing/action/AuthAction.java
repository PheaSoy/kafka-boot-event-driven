package org.soyphea.ruleprocessing.action;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.soyphea.ruleprocessing.model.Action;
import org.soyphea.ruleprocessing.model.ActionType;
import org.soyphea.ruleprocessing.model.AuthProcessRequest;
import org.soyphea.ruleprocessing.model.BaseProcessRequest;
import org.soyphea.ruleprocessing.processor.login.LoginEventBinder;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component("AuthAction")
@AllArgsConstructor
@Slf4j
public class AuthAction implements Action {

    private final LoginEventBinder loginEventBinder;

    @Override
    public String name() {
        return "auth-disabled-user";
    }

    @Override
    public String code() {
        return "auth_disabled_user";
    }

    @Override
    public ActionType type() {
        return ActionType.ASYNC;
    }

    @Override
    public void apply(BaseProcessRequest processRequest) {
        log.info("Execute auth action.");
        AuthProcessRequest authProcessRequest = (AuthProcessRequest) processRequest;
        loginEventBinder.send().send(MessageBuilder.withPayload(authProcessRequest).build());
    }
}

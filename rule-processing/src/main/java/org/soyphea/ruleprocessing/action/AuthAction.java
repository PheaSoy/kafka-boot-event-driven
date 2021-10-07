package org.soyphea.ruleprocessing.action;

import org.soyphea.ruleprocessing.model.Action;
import org.soyphea.ruleprocessing.model.AuthProcessRequest;
import org.soyphea.ruleprocessing.model.BaseProcessRequest;
import org.springframework.stereotype.Component;

@Component("AuthAction")
public class AuthAction extends Action {


    @Override
    public void apply(BaseProcessRequest processRequest) {
        AuthProcessRequest authProcessRequest = (AuthProcessRequest) processRequest;
    }
}

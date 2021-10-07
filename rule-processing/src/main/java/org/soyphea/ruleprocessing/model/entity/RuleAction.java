package org.soyphea.ruleprocessing.model.entity;

import org.soyphea.ruleprocessing.model.Action;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("rule_actions")
public class RuleAction {
    @Id
    private String id;
    private String code;
    private List<Action> actions;
}

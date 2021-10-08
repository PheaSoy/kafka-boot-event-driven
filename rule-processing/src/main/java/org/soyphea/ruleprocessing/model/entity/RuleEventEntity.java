package org.soyphea.ruleprocessing.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("rule_events")
public class RuleEventEntity {

    @Id
    String id;
    String ruleId;
    Event event;
}

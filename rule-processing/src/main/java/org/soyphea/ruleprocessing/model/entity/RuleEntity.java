package org.soyphea.ruleprocessing.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.soyphea.ruleprocessing.model.Status;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Document("rules")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RuleEntity {

    @Id
    String id;
    @CreatedDate
    Instant createdDate;
    @LastModifiedDate
    Instant lastUpdatedDate;
    Status status;
    private List<String> mechanicIds;
    Instant fromDateTime;
    Instant endDateTime;
    RuleAction action;

}

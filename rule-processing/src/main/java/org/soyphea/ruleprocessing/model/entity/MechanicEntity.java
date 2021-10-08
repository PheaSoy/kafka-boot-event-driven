package org.soyphea.ruleprocessing.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.soyphea.ruleprocessing.model.Condition;
import org.soyphea.ruleprocessing.model.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Document("mechanics")
public class MechanicEntity {
    @Id
    String id;
    String name;
    String mechanicId;
    String description;
    List<Condition> conditions;
    Instant fromDateTime;
    Instant endDateTime;
    Status status;

    String sortId() {
        return this.getName() + this.getId().substring(0, 8);
    }
}

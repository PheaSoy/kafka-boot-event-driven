package org.soyphea.ruleprocessing.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("login_event")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginEventEntity {

    @Id
    String id;
    String operation;
    String username;
    boolean isSuccess;
    @LastModifiedDate
    Instant lastModifiedDate;
    @CreatedDate
    Instant createdDate;

}

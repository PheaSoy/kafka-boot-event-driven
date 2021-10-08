package org.soyphea.ruleprocessing.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.soyphea.ruleprocessing.model.EventKeys;
import org.soyphea.ruleprocessing.model.Status;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Document("login_event")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoginEventEntity extends EventKeys {

    @Id
    String id;
    Event event;
    String username;
    boolean isSuccess;
    Status status;
    @LastModifiedDate
    Instant lastModifiedDate;
    @CreatedDate
    Instant createdDate;

    @Override
    public EventKeys getEventWithKey() {
        List<String> key = List.of("username", "isSuccess");
        EventKeys eventKeys = EventKeys.builder()
                .event(Event.LOGIN)
                .build();
        return eventKeys;
    }
}

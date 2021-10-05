package org.soyphea.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
public class EventBase implements Serializable {
    private  String eventName;
    private  String serviceName;
    private String operation;

    public EventBase(String eventName, String serviceName, String operation) {
        this.eventName = eventName;
        this.serviceName = serviceName;
        this.operation = operation;
    }
}

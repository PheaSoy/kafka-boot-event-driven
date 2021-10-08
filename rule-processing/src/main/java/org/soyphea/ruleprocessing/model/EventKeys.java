package org.soyphea.ruleprocessing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.soyphea.ruleprocessing.model.entity.Event;

import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public abstract class EventKeys {
    Event event;
    Set<String> keys;

    public abstract EventKeys getEventWithKey();
}

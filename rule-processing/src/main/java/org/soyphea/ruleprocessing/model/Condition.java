package org.soyphea.ruleprocessing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class Condition {
    String assignLeft; // value config from the system
    String operator; // operator to compare
    String assignRight; // value from the event
    TimeBox timeBox; // number of the time box to be config to make the condition is matched
    boolean isLast;
    NextConditionOperator nextConditionOperator;
}

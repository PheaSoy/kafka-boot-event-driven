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
    String assignLeft;
    String operator;
    String assignRight;
    boolean isLast;
    NextConditionOperator nextConditionOperator;
}

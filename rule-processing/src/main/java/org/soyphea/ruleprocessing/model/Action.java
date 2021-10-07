package org.soyphea.ruleprocessing.model;

public interface  Action<T extends BaseProcessRequest> {

    String name();
    String code();
    ActionType type();
    void apply(T processRequest);
}

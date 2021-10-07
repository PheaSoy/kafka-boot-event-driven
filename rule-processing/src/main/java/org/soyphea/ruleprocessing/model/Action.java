package org.soyphea.ruleprocessing.model;

public abstract class Action<T extends BaseProcessRequest> {

    private String name;
    private String code;
    private String description;
    private String type;

    public abstract void apply(T processRequest);
}

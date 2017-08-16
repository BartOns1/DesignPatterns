package com.realdolmen.ood020.builderPattern;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class Email {
    private String fromField;
    private String toField;
    private String subjectField;
    private String messageField;

    public Email(String fromField, String toField, String subjectField, String messageField) {
        this.fromField = fromField;
        this.toField = toField;
        this.subjectField = subjectField;
        this.messageField = messageField;
    }

    public String getFromField() {
        return fromField;
    }

    public void setFromField(String fromField) {
        this.fromField = fromField;
    }

    public String getToField() {
        return toField;
    }

    public void setToField(String toField) {
        this.toField = toField;
    }

    public String getSubjectField() {
        return subjectField;
    }

    public void setSubjectField(String subjectField) {
        this.subjectField = subjectField;
    }

    public String getMessageField() {
        return messageField;
    }

    public void setMessageField(String messageField) {
        this.messageField = messageField;
    }
}

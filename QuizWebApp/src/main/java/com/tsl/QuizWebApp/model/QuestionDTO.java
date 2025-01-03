package com.tsl.QuizWebApp.model;

public class QuestionDTO {
    int qId;
    String qDescription;
    String[] options;

    public QuestionDTO(int qId, String qDescription, String[] options) {
        this.qId = qId;
        this.qDescription = qDescription;
        this.options = options;
    }

    public int getqId() {
        return qId;
    }

    public String getqDescription() {
        return qDescription;
    }

    public String[] getOptions() {
        return options;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public void setqDescription(String qDescription) {
        this.qDescription = qDescription;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}

package com.tsl.QuizWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
@Id
int qId;
String qDescription;
String[] options;
//String option1;
//String option2;
//String option3;
//String option4;
String answer;




//    public Question(int i, String s,String[]options, String delhi, String mumbai, String kolkata, String nashik, String delhi1) {
//    }
//
//    public Question() {
//
//    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public void setqDescription(String qDescription) {
        this.qDescription = qDescription;
    }



    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getqId() {
        return qId;
    }

    public String getqDescription() {
        return qDescription;
    }


    public String getAnswer() {
        return answer;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
    //    public Question(int i, String s, String delhi, String mumbai, String kolkata, String nashik, String delhi1) {
//    }

}

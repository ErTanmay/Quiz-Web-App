package com.tsl.QuizWebApp.repo;

import com.tsl.QuizWebApp.model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionRepo {

    List<Question> questions = new ArrayList<>();


    public QuestionRepo(){
//        questions.add(new Question(1,"What is the capital of India ?", new String[]{"Delhi", "Mumbai", "Kolkata", "Nashik"}, "Delhi"));
//        questions.add(new Question(2,"What is the economical capital of India ?", new String[]{"Delhi", "Mumbai", "Nagpur", "Pune"}, "Mumbai"));
//        questions.add( new Question(3,"What is the national sport of India ?", new String[]{"Cricket", "Hockey", "Football", "Baseball"}, "Hockey"));
    }


    public List<Question> getAllQuestions(){
        return  questions;
    }

    public Question getQuestion(int qId){

        for(Question qus : questions){
            if(qus.getqId()==qId){
               // qus.setAnswer("null");
             return qus;
            }
        }
         return  null;
    }

    public String setAnswer(int qId,String ans) {
        for(Question qus : questions){
            if(qus.getqId()==qId){
                System.out.println("Answer from path variable " + ans + " " + "Answer from constructor " + qus.getAnswer());
              if(qus.getAnswer().equalsIgnoreCase(ans)){
                  return "Answer is correct";
              }else{
                  return "Answer is falls";
              }
            }else{
                return "Question Id is not found";
            }
        }
        return null;
    }

    public void setQuestionSet(Question question) {
        questions.add(question);
    }
}

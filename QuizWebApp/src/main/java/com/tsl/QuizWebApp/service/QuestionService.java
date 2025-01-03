package com.tsl.QuizWebApp.service;

import com.tsl.QuizWebApp.model.Question;
import com.tsl.QuizWebApp.model.QuestionDTO;
import com.tsl.QuizWebApp.repo.QuestionJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    Question q1;
    @Autowired
    Question q2;
    @Autowired
    Question q3;
    @Autowired
    QuestionJPARepo qJPARepo;

//    public void loadData(){
//        q1.setqId(1);
//        q1.setqDescription("What is the Capital of India ?");
//        q1.setOptions(new String[]{"Delhi", "Mumbai", "Pune", "Nashik"});
//        q1.setAnswer("Delhi");
//
//        qJPARepo.save(q1);
//
//        q2.setqId(2);
//        q2.setqDescription("What is the Economical Capital of India ?");
//        q2.setOptions(new String[]{"Delhi", "Mumbai", "Nagpur", "Nashik"});
//        q2.setAnswer("Mumbai");
//
//        qJPARepo.save(q2);
//
//        q3.setqId(3);
//        q3.setqDescription("What is the Capital of USA ?");
//        q3.setOptions(new String[]{"Washington DC", "New York", "Boston", "Tampa"});
//        q3.setAnswer("Washington DC");
//
//        qJPARepo.save(q3);
//
//    }

    public void setQuestion(Question question){
        qJPARepo.save(question);
    }

    public List<QuestionDTO> getQuestion(int qId){
        return qJPARepo.findQuestion(qId);
    }

    public Question getEntireQuestion(int qId){
        return qJPARepo.getReferenceById(qId);
    }

    public String verifyAnswer(int qId, String ans) {
        String correctAns = qJPARepo.getReferenceById(qId).getAnswer();
        if(correctAns.equalsIgnoreCase(ans)){
            return "Correct Answer";
        }else {
            return "Incorrect Answer";
        }
    }

    public String deleteQuestion(int qId) {
        qJPARepo.deleteById(qId);
        return "Question Deleted";
    }

    public Question updateQuestion(Question question) {
        qJPARepo.deleteById(question.getqId());
        qJPARepo.save(question);
        return qJPARepo.getReferenceById(question.getqId());
    }
}

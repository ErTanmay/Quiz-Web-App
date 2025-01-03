package com.tsl.QuizWebApp.controller;

import com.tsl.QuizWebApp.model.Question;
import com.tsl.QuizWebApp.model.QuestionDTO;
import com.tsl.QuizWebApp.repo.QuestionRepo;
import com.tsl.QuizWebApp.service.QuestionService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    QuestionRepo qRepo;
    @Autowired
    QuestionService qservice;

    @GetMapping("/greet")
    public String greet(){
        return "Tanmay!!!!!!";
    }

    @GetMapping("/getAllQuestions")
    public List<Question> getAllJobs(){
        return qRepo.getAllQuestions();
    }

    @GetMapping("/getQuestion/{qId}")
    public Question getAllJobs(@PathVariable int qId){
        return qRepo.getQuestion(qId);
    }

    @GetMapping("/setAnswer/{qId}/{ans}")
    public String setAnswer(@PathVariable("qId") int qId, @PathVariable("ans") String ans){
        return qRepo.setAnswer(qId, ans);
    }

    //JPA Repository code started

    @PostMapping("/addQuestion")
    public Question addQuestionSet(@RequestBody Question question){
          qservice.setQuestion(question);
          return (Question) qservice.getEntireQuestion(question.getqId());
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrftoken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/verifyAnswer/{qId}/{ans}")
    public String verifyAnswer(@PathVariable("qId") int qId, @PathVariable("ans") String ans){
        return qservice.verifyAnswer(qId, ans);
    }

    @DeleteMapping("/deleteQuestion/{qId}")
    public String deleteQuestion(@PathVariable("qId") int qId){
        return qservice.deleteQuestion(qId);
    }

    @GetMapping("/loadQuestion/{qId}")
    public List<QuestionDTO> loadQuestion(@PathVariable("qId") int qId){
        return qservice.getQuestion(qId);
    }

    @PutMapping("/updateQuestion")
    public Question updateQuestion(@RequestBody Question question){
        return qservice.updateQuestion(question);
    }
}

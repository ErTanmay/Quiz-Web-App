package com.tsl.QuizWebApp.repo;

import com.tsl.QuizWebApp.model.Question;
import com.tsl.QuizWebApp.model.QuestionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionJPARepo extends JpaRepository<Question, Integer> {

    @Query("SELECT new com.tsl.QuizWebApp.model.QuestionDTO(q.qId, q.qDescription, q.options) FROM Question q where q.qId = :qId")
    List<QuestionDTO> findQuestion(@Param("qId") int qId);

}

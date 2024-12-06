package com.QuizMaster.quizapp.dao;


import com.QuizMaster.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {


    @Query(value = "",nativeQuery = true)
    static List<Question> findRandomQuestionsByCategory(String category, int numQ) {

    }

    List<Question> findByCategory(String category);
}

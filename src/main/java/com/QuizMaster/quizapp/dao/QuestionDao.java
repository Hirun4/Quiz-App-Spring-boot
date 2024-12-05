package com.QuizMaster.quizapp.dao;


import com.QuizMaster.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

}

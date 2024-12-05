package com.QuizMaster.quizapp.controller;


import com.QuizMaster.quizapp.Question;
import com.QuizMaster.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {


    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
//      return questionService.getAllQuestions();
        List<Question> questions = questionService.getAllQuestions();
        System.out.println(questions);  // Log the questions data
        return questions;

    }

}

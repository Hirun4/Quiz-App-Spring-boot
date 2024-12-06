package com.QuizMaster.quizapp.service;


import com.QuizMaster.quizapp.dao.QuestionDao;
import com.QuizMaster.quizapp.dao.QuizDao;
import com.QuizMaster.quizapp.model.Question;
import com.QuizMaster.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {


        List<Question> questions = questionDao.findRandomQuestionsByCategory(category,numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return ResponseEntity
    }
}

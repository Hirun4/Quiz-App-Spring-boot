package com.QuizMaster.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data // Lombok will generate getters, setters, and other utility methods
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Primary Key

    private String title; // Title of the quiz

    @ManyToMany
    private List<Question> questions; // List of questions associated with the quiz

    // You can add explicit setters and getters if Lombok is not working correctly:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}

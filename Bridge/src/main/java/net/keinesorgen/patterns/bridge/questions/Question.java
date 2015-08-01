package net.keinesorgen.patterns.bridge.questions;

/**
 * Implementator
 * 
 * Provides the navigation from one question to another.
 */
public interface Question {

    void nextQuestion();

    void previousQuestion();

    void newQuestion(String q);

    void deleteQuestion(String q);

    void displayQuestion();

    void displayAllQuestions();
}

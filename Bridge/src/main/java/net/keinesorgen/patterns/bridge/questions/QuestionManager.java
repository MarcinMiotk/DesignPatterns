package net.keinesorgen.patterns.bridge.questions;

/**
 * Abstraction
 */
public class QuestionManager {

    private final Question q;
    private final String catalog;

    public QuestionManager(String catalog, Question question) {
        this.catalog = catalog;
        this.q = question;
    }

    public void next() {
        q.nextQuestion();
    }

    public void previous() {
        q.previousQuestion();
    }

    public void newOne(String quest) {
        q.newQuestion(quest);
    }

    public void delete(String quest) {
        q.deleteQuestion(quest);
    }

    public void display() {
        q.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Easy interface (manager) to Question. Question Paper: " + catalog);
        q.displayAllQuestions();
    }
}

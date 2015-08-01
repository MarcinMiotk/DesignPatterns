package net.keinesorgen.patterns.bridge.questions;

/**
 * Refined Abstraction
 */
public class QuestionFormat extends QuestionManager {

    public QuestionFormat(String catalog, Question question) {
        super(catalog, question);
    }

    @Override
    public void displayAll() {
        System.out.println("Refined Abstraction (Bridge) before. Formatting message.");
        super.displayAll();
        System.out.println("Refined Abstraction (Bridge) after, Formatting message");
    }
}

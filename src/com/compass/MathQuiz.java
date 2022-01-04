package com.compass;

import java.util.ArrayList;

public class MathQuiz {
    private ArrayList<String> questions;
    private ArrayList<Integer> answers;

    private String userName;

    private int correct;
    private int wrong;

    MathQuiz() {
        questions = new ArrayList<>();
        answers = new ArrayList<>();
        userName = "";
        correct = 0;
        wrong = 0;
    }

    /**
     * Adiciona uma pergunta com sua resposta respectivamente
     * 
     * @param question pergunta realizada
     * @param answer   resposta da pergunta
     */
    public void addQuestion(String question, int answer) {
        questions.add(question);
        answers.add(answer);
    }

    public void correctAnswer() {
        correct++;
    }

    public void wrongAnswer() {
        wrong++;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Integer> answers) {
        this.answers = answers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }
}

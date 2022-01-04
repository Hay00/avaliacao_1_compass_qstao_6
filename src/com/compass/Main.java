package com.compass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Adiciona as perguntas e respostas respectivamente
        MathQuiz quiz = new MathQuiz();
        quiz.addQuestion("2 + 2", 4);
        quiz.addQuestion("3 * 4", 12);
        quiz.addQuestion("3 * 3 * 9", 81);
        quiz.addQuestion("1 + 2 * 5", 11);
        quiz.addQuestion("0,25 * 8", 2);
        quiz.addQuestion("92 * 206", 18952);
        quiz.addQuestion("3 * ((80 * 1000000) ÷ 16)", 15000000);
        quiz.addQuestion("6 ÷ 2 (1 + 2)", 9);

        // Lista com as perguntas e respostas
        ArrayList<String> questions = quiz.getQuestions();
        ArrayList<Integer> answers = quiz.getAnswers();

        System.out.println("\nOlá, esse é um quiz sobre perguntas matemáticas");
        System.out.println("Ele consiste de " + questions.size() + " perguntas básicas");
        System.out.println("!! Atenção, todas as respostas são números inteiros !!\n");
        System.out.print("Informe o seu nome: ");

        quiz.setUserName(input.nextLine());

        for (int i = 0; i < questions.size(); i++) {
            System.out.print("Pergunta [" + (i + 1) + "]: " + questions.get(i) + " = ");
            if (getValidIntInput() == answers.get(i))
                quiz.correctAnswer();
            else
                quiz.wrongAnswer();
        }

        System.out.println("\nUsuário: " + quiz.getUserName());
        System.out.println("Acertos: " + quiz.getCorrect());
        System.out.println("Erros: " + quiz.getWrong());
    }

    /**
     * Retorna um valor inteiro válido do Scanner
     *
     * @return inteiro válido do input
     */
    public static int getValidIntInput() {
        try {
            while (!input.hasNextInt()) {
                System.out.println("Valor inválido, digite novamente");
                input.nextLine();
            }
            return input.nextInt();
        } catch (Exception exception) {
            input.nextLine();
            return 0;
        }
    }
}

package com.compass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();

        // Adiciona as perguntas e respostas respectivamente
        questions.add("2 + 2");
        answers.add(4);
        questions.add("3 * 4");
        answers.add(12);
        questions.add("3 * 3 * 9");
        answers.add(81);
        questions.add("1 + 2 * 5");
        answers.add(11);
        questions.add("0,25 * 8");
        answers.add(2);
        questions.add("92 * 206");
        answers.add(18952);
        questions.add("3 * ((80 * 1000000) ÷ 16)");
        answers.add(15000000);
        questions.add("6 ÷ 2 (1 + 2)");
        answers.add(9);

        int acertos = 0;
        int erros = 0;
        System.out.println("\nOlá, esse é um quiz sobre perguntas matemáticas");
        System.out.println("Ele consiste de " + questions.size() + " perguntas básicas");
        System.out.println("!! Atenção, todas as respostas são números inteiros !!\n");
        System.out.print("Informe o seu nome: ");

        String userName = input.next();
        input.nextLine(); // Limpa sujeira de nomes com espaços

        for (int i = 0; i < questions.size(); i++) {
            System.out.print("Pergunta [" + (i + 1) + "]: " + questions.get(i) + " = ");
            if (getValidIntInput() == answers.get(i))
                acertos++;
            else
                erros++;
        }

        System.out.println("\nUsuário: " + userName);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
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
                input.next();
            }
            return input.nextInt();
        } catch (Exception exception) {
            input.nextLine();
            return 0;
        }
    }
}

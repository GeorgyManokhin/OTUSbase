package ru.x5.otus.testing;

import java.util.Scanner;


public class Testing {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = new String[3];
        questions[0] = "Столица России?";
        questions[1] = "Столица Сербии?";
        questions[2] = "Столица Бразилии?";

        String[][] answerOptions = new String[3][4];
        answerOptions[0][0] = "1. Москва ";
        answerOptions[0][1] = "2. Сочи ";
        answerOptions[0][2] = "3. Казань ";
        answerOptions[0][3] = "4. Пермь ";

        answerOptions[1][0] = "1. Приштина ";
        answerOptions[1][1] = "2. Белград ";
        answerOptions[1][2] = "3. Ниш ";
        answerOptions[1][3] = "4. Крагуевац ";

        answerOptions[2][0] = "1. Форталеза ";
        answerOptions[2][1] = "2. Салвадор ";
        answerOptions[2][2] = "3. Куритиба ";
        answerOptions[2][3] = "4. Бразилиа ";

        int[] correctAnswers = new int[3];
        correctAnswers[0] = 1;
        correctAnswers[1] = 2;
        correctAnswers[2] = 4;


        for (int i = 0; i < 3; i++) { //i=1
            System.out.println(questions[i]);
            for (int d = 0; d < answerOptions[i].length; d++) { //d=0 answerOptions[0].length = 4
                String n = answerOptions[i][d];
                System.out.println(n + " ");
            }
            System.out.println();
        }
        System.out.println("Результат: правильно "+correctCount +", неправильно "+wrongCount);
    }
}








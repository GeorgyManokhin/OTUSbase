package ru.x5.otus.testing;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = new String[3];
        questions[0] = "Столица России?";
        questions[1] = "Столица Сербии?";
        questions[2] = "Столица Бразилии?";

        String[][] answerOptions = {
         {"Москва", "Сочи", "Казань", "Пермь"},
         {"Приштина", "Белград", "Ниш", "Крагуевац"},
         {"Форталеза", "Салвадор", "Куритиба", "Бразилиа"}
        };

        int[] correctAnswers = null;

        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i]);
    }
}
}




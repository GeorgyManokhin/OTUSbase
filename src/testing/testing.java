package testing;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        String Question = getQuestion();
    }
public static String getQuestion() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Вопрос первый");
    return sc.nextLine();
    }
}



/*
Написать систему тестирования.
На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
Должно быть три вопроса, каждый с 3-5 вариантами ответов.
Все вопросы с одним правильным вариантом ответа.
После прохождения теста отображается результат.
Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
В этом задании не нужно использовать ООП (создавать классы), вопросы и варианты ответов надо хранить в массиве (массивах).
 */
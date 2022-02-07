package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        System.out.println("Выберите действие :");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите задачу для планирования");
                    Scanner add = new Scanner(System.in);
                    list.add(add.nextLine());
                    System.out.println("Выберите действие :");
                    System.out.println("1. Добавить задачу");
                    System.out.println("2. Вывести список задач");
                    System.out.println("3. Удалить задачу");
                    System.out.println("0. Выход");
                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i+1+". "+list.get(i));
                    }
                    System.out.println("Выберите действие :");
                    System.out.println("1. Добавить задачу");
                    System.out.println("2. Вывести список задач");
                    System.out.println("3. Удалить задачу");
                    System.out.println("0. Выход");
                   break;
                case 3:
                    list=new LinkedList<>(list);
                    System.out.println("Введите номер задачи, которую хотите удалить :");
                    Scanner remove1 = new Scanner(System.in);
                    list.remove(remove1.nextInt()-1);
                    System.out.println("Выберите действие :");
                    System.out.println("1. Добавить задачу");
                    System.out.println("2. Вывести список задач");
                    System.out.println("3. Удалить задачу");
                    System.out.println("0. Выход");
                    break;
                case 0: return;
                default:
                    System.out.println("Не правильный номер команды");
                    System.out.println("Выберите действие :");
                    System.out.println("1. Добавить задачу");
                    System.out.println("2. Вывести список задач");
                    System.out.println("3. Удалить задачу");
                    System.out.println("0. Выход");
                    break;
            }

        }
    }
}


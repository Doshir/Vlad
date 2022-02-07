package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Выберите действие :");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");
        while (scanner.hasNextLine()){
            if(scanner.nextInt()==1){
                System.out.println("Введите задачу для планирования: ");
                Scanner scanner1= new Scanner(System.in);
                list.add(scanner1.nextLine());

            }
            System.out.println("Выберите действие :");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Вывести список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("0. Выход");

        }
    }
}

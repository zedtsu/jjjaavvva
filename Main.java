package education;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static int task1(int n){
        // Сумма чисел от 1 до n.
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int taskk1(int n){
        //Произведение чисел от 1 до n.
        int F = 1;
        for (int i = 1; i <= n; i++) {
            F *= i;
        }
        return F;
    }

    public static void task2(){
        // Вывод всех простых чисел от 0 до 1000.
        for (int i = 1; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                }
            }
            if (flag)
                System.out.println(i);
        }
    }

    public static void task3(){
        // Калькулятор.
        System.out.println("Добро пожаловать в калькулятор!");
        Scanner calc = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, /, *): ");
        var op = calc.next();
        System.out.println("Введите первое число: ");
        double num1 = calc.nextInt();
        System.out.println("Введите второе число: ");
        double num2 = calc.nextInt();
        System.out.println("Думаю..");
        calc.close();
        double res = 0;
        if (op.equals("+")) {
            res = num1 + num2;
        } else if (op.equals("-")) {
            res = num1 - num2;
        } else if (op.equals("/")) {
            res = num1 / num2;
        } else if (op.equals("*")) {
            res = num1 * num2;
        } else {
            System.out.println("Такого вида операции нет.");
        }
        System.out.printf("Ответ: %f.", res);
    }
}
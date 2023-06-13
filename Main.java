package education;

import java.io.FileWriter;
import java.util.Scanner;

// Шугалей Александр.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        // 1) Дана строка sql-запроса "select * from students WHERE ".
        // Сформируйте часть WHERE этого запроса, используя StringBuilder.
        // Данные для фильтрации приведены ниже в виде json-строки.
        //Если значение null, то параметр не должен попадать в запрос.
        //String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
        //Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        //вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

        StringBuilder stroka = new StringBuilder(" ");
        Scanner sc = new Scanner(System.in);

        System.out.print("name: ");
        String a = sc.nextLine();
        if (a.equals("null")) {
        } else {
            stroka.append("name= ");
            stroka.append(a);
            stroka.append(" AND ");
        }
        System.out.print("country: ");
        String b = sc.nextLine();
        if (b.equals("null")){
        } else {
            stroka.append("country:= ");
            stroka.append(b);
            stroka.append(" AND ");
        }
        System.out.print("city: ");
        String c = sc.nextLine();
        if (c.equals("null")){
        } else {
            stroka.append("city= ");
            stroka.append(c);
            stroka.append(" AND ");
        }
        System.out.print("age: ");
        String d = sc.nextLine();
        if (d.equals("null")){
        } else {
            stroka.append("age= ");
            stroka.append(d);
        }
        sc.close();
        System.out.print("select * from students WHERE");
        System.out.print(stroka);
        System.out.print(".");
    }

    public static void task2(){
        // 2) Реализуйте алгоритм сортировки пузырьком числового массива,
        // результат после каждой итерации запишите в лог-файл.


        try {
            FileWriter fw = new FileWriter("log.txt", false);
            fw.write("Начало работы FileWriter. \n");
            int[] array = new int[]{2, 1, 2, 7, 6, 1, 8};
            fw.write("Создание массива. \n");
            for (int i :
                    array) {
                System.out.print(i + " ");
                fw.write("Вывод массива через цикл. \n");
            }
            boolean flag = false;
            int temp;
            while (!flag) {
                flag = true;
                for (int i = 0; i < array.length - 1; i++) {
                    fw.write("Проверка элементов массива. \n");
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        flag = false;
                        fw.write("Сортировка массива. \n");
                    }
                }
            }
            System.out.println();
            fw.write("Пробел. \n");
            for (int i :
                    array) {
                System.out.print(i + " ");
                fw.write("Вывод массива через цикл. \n");
            }
            fw.write("Закрытие FileWriter. \n");
            fw.close();
        }
        catch (Exception e){
            System.out.println("Ошибка!");
        }
    }
}
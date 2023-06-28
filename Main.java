package education;

import java.awt.*;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//NoteBook notebook1 = new NoteBook
//NoteBook notebook2 = new NoteBook
//NoteBook notebook3 = new NoteBook
//NoteBook notebook4 = new NoteBook
//NoteBook notebook5 = new NoteBook
//
//Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД hd hdd
//3 - Операционная система
//4 - Цвет
//
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//
//Класс сделать в отдельном файле
//
//приветствие
//Выбор параметра
//выбор конкретнее
//вывод подходящих
// Шугалей Александр.
public class Main {
    public static void main(String[] args) {
        int choise = 0;
        int value = 0;
        String value2 = "";
        NoteBook noteBook1 = new NoteBook("Lenovo 22", 8, 512, "iMac", "Black");
        NoteBook noteBook2 = new NoteBook("Philips 12e", 4, 1024, "Linux", "White");
        NoteBook noteBook3 = new NoteBook("Xiaomi 12 Lite", 16, 256, "Windows", "Grown");
        NoteBook noteBook4 = new NoteBook( "Samsung Samsa 12",32, 5120, "MacOS", "Pink");
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте, введите цифру, соответствующую необходимому критерию: \n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет");
        choise = sc.nextInt();
        if (choise == 1 || choise == 2){
            System.out.println("Введите желаемое значение критерия: ");
            value = sc.nextInt();
        } else if (choise == 3 || choise == 4) {
            System.out.println("Введите значение: ");
            value2 = sc.next();
        } else {
            System.out.println("Такого критерия нет.");
        }
        sc.close();
        task(noteBook1, noteBook2, noteBook3, noteBook4, choise, value, value2);
    }
    public static void task(NoteBook noteBook1, NoteBook noteBook2, NoteBook noteBook3,
                            NoteBook noteBook4, int choise, int value, String value2){
        System.out.print("Результаты: ");
        if (choise == 1) {
            if (noteBook1.OZU >= value) {
                System.out.println(noteBook1.name);
            } else if (noteBook2.OZU >= value) {
                System.out.println(noteBook2.name);
            } else if (noteBook3.OZU >= value) {
                System.out.println(noteBook3.name);
            } else if (noteBook4.OZU >= value) {
                System.out.println(noteBook4.name);
            } else System.out.println("Пусто.");
        } else if (choise == 2) {
            if (noteBook1.HDD >= value) {
                System.out.println(noteBook1.name);
            } else if (noteBook2.HDD >= value) {
                System.out.println(noteBook2.name);
            } else if (noteBook3.HDD >= value) {
                System.out.println(noteBook3.name);
            } else if (noteBook4.HDD >= value) {
                System.out.println(noteBook4.name);
            } else System.out.println("Пусто.");
        } else if (choise == 3) {
            if (noteBook1.OS.equals(value2)) {
                System.out.println(noteBook1.name);
            } else if (noteBook2.OS.equals(value2)) {
                System.out.println(noteBook2.name);
            } else if (noteBook3.OS.equals(value2)) {
                System.out.println(noteBook3.name);
            } else if (noteBook4.OS.equals(value2)) {
                System.out.println(noteBook4.name);
            } else System.out.println("Пусто.");
        } else if (choise == 4) {
            if (noteBook1.color.equals(value2)) {
                System.out.println(noteBook1.name);
            } else if (noteBook2.color.equals(value2)) {
                System.out.println(noteBook2.name);
            } else if (noteBook3.color.equals(value2)) {
                System.out.println(noteBook3.name);
            } else if (noteBook4.color.equals(value2)) {
                System.out.println(noteBook4.name);
            } else System.out.println("Пусто.");
        }
    }
}
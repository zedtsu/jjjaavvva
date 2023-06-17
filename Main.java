package education;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
// Шугалей Александр

public class Main {
    public static void main(String[] args) {
        List<Integer> spisok = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            spisok.add(random.nextInt(10));
        }
        System.out.println(spisok);
    }

    public static void task1(List<Integer> spisok) {
        for (int i = 0; i < spisok.size(); i++) {
            if (spisok.get(i) % 2 == 0) {
                spisok.remove(i);
                i--;
            }
        }
    }

    public static int task2(List<Integer> spisok) {
        int min = 1000000;
        for (int i = 0; i < spisok.size(); i++) {
            if (spisok.get(i) < min) {
                min = spisok.get(i);
            }
        }
        return min;
    }

    public static int task3(List<Integer> spisok) {
        int max = 0;
        for (int i = 0; i < spisok.size(); i++) {
            if (spisok.get(i) > max) {
                max = spisok.get(i);
            }
        }
        return max;
    }

    public static double task4(List<Integer> spisok){
        double sum = 0;
        double mid = 0;
        double len = spisok.size();
        for (int i = 0; i < spisok.size(); i++) {
            sum = sum + spisok.get(i);
        }
        mid = sum / spisok.size();
        return mid;
    }

}
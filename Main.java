package education;

// Даны два Deque, представляющие два целых числа.
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
//2) Сложите два числа и верните сумму в виде связанного списка.
//Одно или два числа могут быть отрицательными.
//
//Даны два Deque, цифры в обратном порядке.
//[3,2,1,-] - пример Deque
//[5,4,3]- пример второго Deque
//1) -123 * 345 = -42 435
//Ответ всегда - связный список, в обычном порядке
//[-,4,2,4,3,5] - пример ответа

// Шугалей Александр

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> dq1 = new ArrayDeque<>(Arrays.asList("3", "2", "-"));
        ArrayDeque<String> dq2 = new ArrayDeque<>(Arrays.asList("5", "4", "3"));
        System.out.println(dq1);
        System.out.println(dq2);
    }

    public static LinkedList<Character> task1(ArrayDeque<String> dq1, ArrayDeque<String> dq2){
        LinkedList<Character> ll = new LinkedList<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dq1.size(); i++) {
            sb1.append(dq1.pollLast());
        }
        sb1.append(dq1.pop());
        int a = Integer.parseInt(sb1.toString());
        for (int i = 0; i < dq2.size(); i++) {
            sb2.append(dq2.pollLast());
        }
        sb2.append(dq2.pop());
        int b = Integer.parseInt(sb2.toString());
        int res = a * b;
        String ss = Integer.toString(res);
        sb.append(ss);
        for (int i = 0; i < sb.length(); i++) {
            ll.add(sb.charAt(i));
        }
        return ll;
    }

    public static LinkedList<Character> task2(ArrayDeque<String> dq1, ArrayDeque<String> dq2){
        LinkedList<Character> ll = new LinkedList<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dq1.size(); i++) {
            sb1.append(dq1.pollLast());
        }
        sb1.append(dq1.pop());
        int a = Integer.parseInt(sb1.toString());
        for (int i = 0; i < dq2.size(); i++) {
            sb2.append(dq2.pollLast());
        }
        sb2.append(dq2.pop());
        int b = Integer.parseInt(sb2.toString());
        int res = a + b;
        String ss = Integer.toString(res);
        sb.append(ss);
        for (int i = 0; i < sb.length(); i++) {
            ll.add(sb.charAt(i));
        }
        return ll;
    }
}
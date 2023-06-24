package education;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
//Пример:
//Иванов 1231234
//Иванов 3456345
//Иванов 5676585
//Петров 12345
//Петров 82332

import java.util.*;

import static java.util.Comparator.comparingInt;

// Шугалей Александр
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Map<String, Integer> numBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите имя(Для выхода - exit): ");
            String name = sc.next();
            if (name.equals("exit")) {
                flag = false;
            } else {
                System.out.print("Ведите номер телефона: ");
                int number = sc.nextInt();
                if (numBook.containsKey(name)){
                    list.add(name + " " + number);
                    list2.add(number);
                } else
                    numBook.put(name, number);
            }
        }
        sc.close();
        for (var item : numBook.entrySet()) {
            list2.add(item.getValue());
        }
        list2.sort(Comparator.naturalOrder());
        System.out.println(numBook);
        System.out.println("Люди с разными номерами.");
        System.out.println(list);
        System.out.println("Отсортированные телефоны.");
        for (var item: list2) {
            System.out.println(item + " ");
        }
    }
}

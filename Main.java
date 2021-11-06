package com.company;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inlet = sc.nextLine(); // Запустили сканер
        String str = inlet.toLowerCase();  // Перевели строку в нижний регистр
        char[] numStr = str.toCharArray(); // Преобразовали строку в массив знаков
        List<Character> uniqArr = new ArrayList(); // Создаём массив первых значений
        for (int i = 0; i < (str.length()); i++) {
            String space = " "; // Используем пробел для определения новой заглавной буквы
            char spaceChar = space.charAt(0); // Преобразовали пробел в знак
            if (numStr[i] == numStr[0]) {  // Выводим первую букву ! Здесь баг с повтором этой буквы !
                uniqArr.add(numStr[0]); // Добавляем первую букву после пробела в массив
                continue;
            } else if (numStr[i] == spaceChar) {  // Ищем пробел как разделитель
                uniqArr.add(numStr[++i]); // Добавляем букву после пробела в массив
            } else {
                continue;
            }
        }

        int count = 0; // Записываем количество заглавных букв
        for (char ignored : uniqArr) {
            count++;
        }
        int index = 0; // Индексируем массив
        List<Character> sortArr = new ArrayList(); // Создаём массив для сортированных значений
        for (char a : uniqArr) { // Берем буквы по очереди
            int cons = 0; // Счётчик совпадений
            for (int i = index; i < count; i++) { // Итерации проверки совпадений
                if (a == uniqArr.get(i)) { // Совпадатор
                    uniqArr.get(i);
                    ++cons; // + в счётчик совпадений
                }
            }
            index++; // каждый раз считаем считаем на +1 что бы пропустить нынешнее совпадение.
            if (cons < 2) { // + в счётчик совпадений
                sortArr.add(a);
                }
            }

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] charAlphabet = alphabet.toCharArray(); // Сделали массив алфавита

        List<Character> over = new ArrayList();

        for (char a : charAlphabet) { // Ищем в алфавите вхождения
            for (char i : sortArr){
                if (a==i) {
                    over.add(i); // добавляем в финальный массив
                }
            }
        }
        System.out.print(over);
    }
}




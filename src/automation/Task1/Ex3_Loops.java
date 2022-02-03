package automation.Task1;

import java.util.Scanner;

public class Ex3_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String string = sc.nextLine();
        string = string.toUpperCase();
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'A'
                    || string.charAt(i) == 'О'
                    || string.charAt(i) == 'У'
                    || string.charAt(i) == 'Э'
                    || string.charAt(i) == 'Ы'
                    || string.charAt(i) == 'Я'
                    || string.charAt(i) == 'Е'
                    || string.charAt(i) == 'Ё'
                    || string.charAt(i) == 'Ю'
                    || string.charAt(i) == 'И'
                    || string.charAt(i) == 'A'
                    || string.charAt(i) == 'I'
                    || string.charAt(i) == 'E'
                    || string.charAt(i) == 'O'
                    || string.charAt(i) == 'U') {
                vCount++;
            } else if (string.charAt(i) >= 'A'
                    || string.charAt(i) >= 'А'
                    && string.charAt(i) <= 'Z'
                    || string.charAt(i) <= 'Я') {
                cCount++;
            }
        }
        System.out.println("Количество гласных: " + vCount);
        System.out.println("Количество согласных: " + cCount);
    }


}

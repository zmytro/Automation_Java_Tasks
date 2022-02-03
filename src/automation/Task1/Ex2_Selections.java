package automation.Task1;
import java.util.Scanner;

public class Ex2_Selections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int threeDigitNum = 0;

        while (threeDigitNum < 100 || threeDigitNum > 999) {
            System.out.println("Введите 3-х значное число: ");
            threeDigitNum = sc.nextInt();

            if (threeDigitNum < 100 || threeDigitNum > 999)
                System.err.println("ОШИБКА! Введите 3-х значное число");
        }
        int number = threeDigitNum;

        int reverseNumber = 0;
            while (number > 0) {
                int rm = number % 10;
                number /= 10;
                reverseNumber = reverseNumber * 10 + rm;
            }

        if (threeDigitNum == reverseNumber)
            System.out.println(threeDigitNum + " - палиндром");
        else
            System.out.println(threeDigitNum + " - не палиндром");

    }
}

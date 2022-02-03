package automation.Task1;
import java.util.Scanner;
public class Ex4_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Введите число:");
        number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println("Число " + number + " является палиндромом");
        } else System.out.println("Число " + number + " не является палиндромом");

    }
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        int a = reverse(number);
        return a == number;
    }
}
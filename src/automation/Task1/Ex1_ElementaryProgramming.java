package automation.Task1;
import java.util.Scanner;

public class Ex1_ElementaryProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Перевод C -> F");
        System.out.print("Введите температуру в градусах Цельсия: ");
        double temp = sc.nextDouble();
        System.out.println(celsiusToF(temp) + "F");
    }

    private static double celsiusToF(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
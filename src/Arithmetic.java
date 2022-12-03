import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Сумма: " + sum(firstNumber, secondNumber));
        System.out.println("Произведение: " + product(firstNumber, secondNumber));
        System.out.println("Разность: " + difference(firstNumber, secondNumber));
        System.out.println("Частное: " + quotient(firstNumber, secondNumber));
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double quotient(int firstNumber, int secondNumber) {
        return 1.0 * firstNumber / secondNumber;
    }
}
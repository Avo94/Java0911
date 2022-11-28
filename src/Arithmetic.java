import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        printMessage("Введите первое число:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        printMessage("Введите второе число:");
        int secondNumber = scanner.nextInt();

        printMessage("Сумма: " + sum(firstNumber, secondNumber));
        printMessage("Произведение: " + op(firstNumber, secondNumber));
        printMessage("Разность: " + dif(firstNumber, secondNumber));
        printMessage("Частное: " + quot(firstNumber, secondNumber));
    }

    public static void printMessage(String output) {
        System.out.println(output);
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public static int op(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double quot(int firstNumber, int secondNumber) {
        return 1.0 * firstNumber / secondNumber;
    }
}
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        Scanner firstScanner = new Scanner(System.in);
        int firstNumber = firstScanner.nextInt();

        System.out.println("Введите второе число:");
        Scanner secondScanner = new Scanner(System.in);
        int secondNumber = secondScanner.nextInt();

        double doubleParser = 1.0;

        System.out.println("Сумма: " + (firstNumber + secondNumber));
        System.out.println("Произведение: " + (firstNumber * secondNumber));
        System.out.println("Разность: " + (firstNumber - secondNumber));
        System.out.println("Частное: " + (doubleParser * firstNumber / secondNumber));
    }
}

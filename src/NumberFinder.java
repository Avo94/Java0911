import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {

        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();

        System.out.println("Сотни: " + (threeDigitNumber / 100));
        System.out.println("Десятки: " + (threeDigitNumber / 10 % 10));
        System.out.println("Единицы: " + (threeDigitNumber % 10));
    }
}
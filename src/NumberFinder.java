import java.util.Scanner;

public class NumberFinder {
    public static void main(String[] args) {

        System.out.println("Введите трехзначное число:");
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();

        System.out.println("Сотни: " + getUnits(threeDigitNumber));
        System.out.println("Десятки: " + getTens(threeDigitNumber));
        System.out.println("Единицы: " + getHundreds(threeDigitNumber));
    }

    public static int getUnits(int threeDigitNumber) {
        return threeDigitNumber / 100;
    }

    public static int getTens(int threeDigitNumber) {
        return threeDigitNumber / 10 % 10;
    }

    public static int getHundreds(int threeDigitNumber) {
        return threeDigitNumber % 10;
    }
}
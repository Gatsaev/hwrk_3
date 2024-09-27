import java.util.Scanner;

public class SumUntilMinusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            sum += number;

            if (number == -1) {
                break;
            }
        }

        System.out.println("Сумма всех введенных чисел: " + sum);
    }
}
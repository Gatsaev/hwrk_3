import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        int middle;
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            middle = b;
        } else if ((b <= a && a <= c) || (c <= a && a <= b)) {
            middle = a;
        } else {
            middle = c;
        }

        System.out.println("Среднее число: " + middle);
    }
}
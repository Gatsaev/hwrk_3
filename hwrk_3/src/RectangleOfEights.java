import java.util.Scanner;

public class RectangleOfEights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
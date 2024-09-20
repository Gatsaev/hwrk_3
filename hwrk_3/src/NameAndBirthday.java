import java.util.Scanner;

public class NameAndBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите год рождения: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц рождения: ");
        int month = scanner.nextInt();
        System.out.print("Введите день рождения: ");
        int day = scanner.nextInt();

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);
    }
}
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

        // String.format
        String introduction = String.format("Меня зовут %s.", name);
        String birthday = String.format("Я родился %02d.%02d.%d", day, month, year);

        System.out.println(introduction);
        System.out.println(birthday);
    }
}
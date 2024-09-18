public class Task6 {
    public static void main(String[] args) {
        int year = 2024; // пример года
        int days;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days = 366;
        } else {
            days = 365;
        }

        System.out.println("Количество дней в этом году: " + days);
    }
}
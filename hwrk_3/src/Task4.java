public class Task4 {
    public static void main(String[] args) {
        int number = -3; // пример числа

        if (number > 0) {
            number *= 2;
        } else if (number < 0) {
            number += 1;
        }

        System.out.println("Результат: " + number);
    }
}
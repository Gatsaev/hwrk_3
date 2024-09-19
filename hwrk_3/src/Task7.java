public class Task7 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5; // пример сторон

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}
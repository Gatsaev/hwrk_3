public class Task8 {
    public static void main(String[] args) {
        double t = 4.5; // время, прошедшее с начала часа

        t = t % 5; // т.к. цикл повторяется каждые 5 минут

        if (t < 3) {
            System.out.println("зелёный");
        } else if (t < 4) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        int month = 2; // пример месяца

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("зима");
                break;
            case 3: case 4: case 5:
                System.out.println("весна");
                break;
            case 6: case 7: case 8:
                System.out.println("лето");
                break;
            case 9: case 10: case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
                break;
        }
    }
}
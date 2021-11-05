public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
        checkSumSing();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }

    public static void checkSumSing() {
        int a;
        a = 12;
        int b = -24;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 12;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Некоректные данные");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

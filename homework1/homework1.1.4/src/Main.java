public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int n = b - a - 1;
        System.out.println("Количество цифр между a и b = " + n);
        for (; a++ <= b; b--) {
            System.out.println(b - 1);
        }
    }
}
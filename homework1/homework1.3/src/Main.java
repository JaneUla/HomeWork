public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 8;
        if (a > b && a > c && b > c) {
            System.out.println(a+b);
        } else if (a > b && a > c && c > b) {
            System.out.println(a+c);
        } else if (b > a && b > c && a > c) {
            System.out.println(b+a);
        } else if (b > a && b > c && c > a) {
            System.out.println(b+c);
        } else
            if (c > a && c > b && a > b) {
            System.out.println(c+a);
        } else {
            System.out.println(c+b);
        }

    }
}
public class Main {
    public static void main(String[] args) {
        int fact = 4;
        for (int i = 1; fact >= i; i++) {
            i = i * fact*(fact-1)*(fact-2);
            System.out.println("Факториал " + fact + "=" + i);
        }
    }
}
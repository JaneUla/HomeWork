import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        while (str.isEmpty()) {
            System.out.println("Введите текст ещё раз");
            str = scanner.nextLine();
        }
        char[] array = str.toCharArray();
        System.out.println("Введите два символа без пробела");
        String symb = scanner.nextLine();
        char[] symbols = symb.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (array[i] == symbols[0]) {
                array[i] = symbols[1];
            }
        }
        System.out.println(array);
    }
}
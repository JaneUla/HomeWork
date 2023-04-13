import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        System.out.println("Введите символ");
        String symb = scanner.nextLine();
        char[] symbol = symb.toCharArray();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (array[i] == symbol[0]) {
                index++;
            }
        }
        System.out.println("строка "+str+", символ "+symb+" встречается "+index+" раз(а)");
    }
}
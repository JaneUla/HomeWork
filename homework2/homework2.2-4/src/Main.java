import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int mass = scanner.nextInt();
        while (mass <= 0) {
            System.out.println("Введите размер масссива ещё раз");
            mass = scanner.nextInt();
        }
        int[] array = new int[mass];
        System.out.println("Введите верхний диапазон массива");
        int highDeap = scanner.nextInt();
        System.out.println("Введите нижний диапазон массива");
        int lowDeap = scanner.nextInt();
        while (highDeap <= lowDeap) {
            System.out.println("Введите нижний и верхний диапазоны ещё раз");
            lowDeap = scanner.nextInt();
            highDeap = scanner.nextInt();
        }
        for (int i = 0; i < mass; i++) {
            array[i] = (int) ((Math.random() * (highDeap - lowDeap)) + lowDeap);
            System.out.print(array[i]+" ");
        }
        System.out.println(Arrays.toString(array));
            int iMax = 0;
            for (int i = 0; i < array.length; i++)
                if (array[i] > array[iMax]) {
                    iMax = i;
                    break;
                }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + array[iMax] + ", его индекс: " + iMax);

        for (int i = 0; i < mass; i++) {

            for (int j = 0; j < mass - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}







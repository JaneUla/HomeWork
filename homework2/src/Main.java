

public class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i : array) {
            array[i] = (int) ((Math.random() * (99 - 10)) + 10);
            System.out.print(" "+array[i]);
        } System.out.println();
        boolean t = true;
        for (int a = 1; a < array.length; a++) {
            if (array[a] <= array[a - 1]) {
                t = false;
                break;
            }
        }if (t) {
                System.out.println("Массив - возрастающая последовательность");
            } else {
                    System.out.println("Массив - не возрастающая последовательность");
                }

            }
        }




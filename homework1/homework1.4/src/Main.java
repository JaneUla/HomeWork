import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("В году 366 дней");
        } else {
            System.out.println("В году 365 дней");
        }
    }
 }
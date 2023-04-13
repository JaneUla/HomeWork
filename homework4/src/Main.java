import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(802955055, "сотовый");
        Phone phone2 = new Phone(801711011, "домашний");
        Phone phone3 = new Phone();
        Scanner scanner = new Scanner(System.in);
        phone1.receiveCall("Danny");
        phone2.receiveCall("Alex", 801711011);
        Phone.sendMessage(802955055, 801711011);
    }
}
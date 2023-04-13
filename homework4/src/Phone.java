import java.util.Scanner;

public class Phone {
    Scanner scanner = new Scanner(System.in);
    private int number;
    private String model;
    private String weight;
    private String name;
    public void receiveCall(String name) {
      System.out.println("Звонит "+name);
    }
    public Phone (int number, String model, String weight) {
        this (number, model);
        this.weight = weight;
    }
    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {

    }
    public void receiveCall(String name, int number) {
        System.out.println(name + " "+ number);
    }
    public static void sendMessage(int ... nums) {
        System.out.print("Номера, которым нужно отправить соoбщение: ");
        for (int i : nums) {
            System.out.print(i+ " ");
        }
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public String getWeight() {
        return weight;
        }
        public String getModel() {
            return model;
        }
}

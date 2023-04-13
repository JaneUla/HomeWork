public class Tuba implements Instrument{
    private int diameter;
    Tuba(int diameter) {
        this.diameter = diameter;
    }
    public void play() {
        System.out.println("Играет труба диаметром "+diameter);
    }
}

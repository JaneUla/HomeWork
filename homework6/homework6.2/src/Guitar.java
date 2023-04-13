public class Guitar implements Instrument{
    private int numberOfStrings;
    Guitar(int nOS) {
        this.numberOfStrings = nOS;
    }
    public void play() {
        System.out.println("Играет гитара с "+numberOfStrings +" струнами");
    }
}

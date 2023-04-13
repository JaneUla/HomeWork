public class Drum implements Instrument{
    private int size;
    Drum(int size) {
        this.size = size;
    }
    public void play() {
        System.out.println("Играют бараьаны размером "+ size);
    }
}

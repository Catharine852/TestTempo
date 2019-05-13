package examples.cars;

public class Chevrolet extends Cars {
    private int volume;
    public Chevrolet (String model) {
        super (model);
    }
    public Chevrolet(String color, String model) {
        super(color, model);
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    String data () {
        return "Motor " + volume + "i";
    }
}

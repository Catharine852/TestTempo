package examples.cars;

public class TestClass {
    public static void main(String[] args) {
        Chevrolet someChevrolet = new Chevrolet ("Tacuma");
        System.out.println(someChevrolet.getModel());
        someChevrolet.setVolume(2);
        System.out.println(someChevrolet.data());
    }
}

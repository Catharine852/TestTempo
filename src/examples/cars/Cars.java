package examples.cars;

import javax.swing.*;

public class Cars {
    private String color;
    private String model;
    public Cars (String model){
        this.model = model;
    }
    public Cars(String color, String model) {
        this.color = color;
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

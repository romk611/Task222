package web.model;

public class Car {

    private String model;
    private String color;
    private int vin;

    public Car(String model, String color, int vin) {
        this.model = model;
        this.color = color;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}

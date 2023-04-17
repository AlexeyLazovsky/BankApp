package ParkingLot;

import java.util.PrimitiveIterator;

public class Vehicle {
    private String color;
    private String size;

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }




    public Vehicle(String plateNumber, String color, String size) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.size = size;
    }






}

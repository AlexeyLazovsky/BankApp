package ParkingLot;

abstract class ParkingSpot {


    String id;
    int floor;

    int row;
    int size;
    boolean isAvailable;

    public ParkingSpot(String id, int floor, int row, int size, boolean isAvailable) {
        this.id = id;
        this.floor = floor;
        this.row = row;
        this.size = size;
        this.isAvailable = isAvailable;
    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public abstract void parkVehicle(Vehicle vehicle);
    public abstract void leaveSpot();



}

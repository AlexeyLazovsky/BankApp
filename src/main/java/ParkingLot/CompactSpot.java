package ParkingLot;

public class CompactSpot extends ParkingSpot {
    public CompactSpot(String id, int floor, int row, int size, boolean isAvailable) {
        super(id, floor, row, size, isAvailable);
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (isAvailable() && vehicle.getSize().equals("Car")) {
            setParkedVehicle(vehicle);
            setIsAvailable(false);
            System.out.println("Car " + vehicle.getPlateNumber() + " parked in spot " + getId());
        } else {
            System.out.println("Parking spot is not available or vehicle size is not suitable.");
        }
    }

    @Override
    public void leaveSpot() {
        if (!isAvailable()) {
            System.out.println("Car " + getParkedVehicle().getPlateNumber() + " has left the spot " + getId());
            setParkedVehicle(null);
            setIsAvailable(true);
        } else {
            System.out.println("Parking spot is already empty.");
        }
    }


}





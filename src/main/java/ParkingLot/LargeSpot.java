package ParkingLot;

public class LargeSpot extends ParkingSpot {


    public LargeSpot(String id, int floor, int row, int size, boolean isAvailable) {
        super(id, floor, row, size, isAvailable);
    }


    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (isAvailable() && vehicle.getSize().equals("Bus")) {
            setParkedVehicle(vehicle);
            setIsAvailable(false);
            System.out.println("Bus " + vehicle.getPlateNumber() + " parked in spot " + getId());
        } else {
            System.out.println("Parking spot is not available or vehicle size is not suitable.");
        }
    }

    @Override
    public void leaveSpot() {
        if (!isAvailable()) {
            System.out.println("Bus " + getParkedVehicle().getPlateNumber() + " has left the spot " + getId());
            setParkedVehicle(null);
            setIsAvailable(true);
        } else {
            System.out.println("Parking spot is already empty.");
        }
    }




}

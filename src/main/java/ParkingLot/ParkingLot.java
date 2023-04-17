package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;

    public ParkingLot() {
        this.parkingFloors = new ArrayList<>();
    }

    public void addParkingFloor(ParkingFloor floor) {
        parkingFloors.add(floor);
    }

    public List<ParkingSpot> findAvailableSpots(Vehicle vehicle) {
        List<ParkingSpot> availableSpots = new ArrayList<>();
        for (ParkingFloor floor : parkingFloors) {
            List<ParkingSpot> spotsOnFloor = floor.findAvailableSpots(vehicle);
            availableSpots.addAll(spotsOnFloor);
        }
        return availableSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        List<ParkingSpot> availableSpots = findAvailableSpots(vehicle);
        if (!availableSpots.isEmpty()) {
            ParkingSpot spot = availableSpots.get(0);
            spot.parkVehicle(vehicle);
            return true;
        } else {
            System.out.println("No suitable spot available for vehicle: " + vehicle.getPlateNumber());
            return false;
        }
    }

    public void leaveSpot(ParkingSpot spot) {
        spot.leaveSpot();
    }
}
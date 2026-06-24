package service;

import model.Vehicle;
import java.util.ArrayList;

public class VehicleManager {

    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {

        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);
    }

    public void displayVehicles() {

        if (vehicles.isEmpty()) {

            System.out.println(
                    "No vehicles found."
            );

            return;
        }

        for (Vehicle vehicle : vehicles) {

            System.out.println(
                    "--------------------"
            );

            vehicle.displayInfo();
        }
    }

    public ArrayList<Vehicle> getVehicles() {

        return vehicles;
    }
}
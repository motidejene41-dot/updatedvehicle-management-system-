package model;

public class Truck extends Vehicle {

    private double maxPayload;
    private double currentLoad;

    public Truck(String make,
                 String model,
                 int year,
                 double maxPayload) {

        super(make, model, year);

        this.maxPayload =
                maxPayload;

        this.currentLoad = 0;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public void loadCargo(
            double amount) {

        if(currentLoad + amount
                <= maxPayload) {

            currentLoad += amount;

            System.out.println(
                    "Cargo Loaded."
            );

        } else {

            System.out.println(
                    "Payload Exceeded."
            );
        }
    }

    @Override
    public String getVehicleType() {

        return "Truck";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Load: "
                        + currentLoad
                        + "/"
                        + maxPayload
                        + " tons"
        );
    }
}
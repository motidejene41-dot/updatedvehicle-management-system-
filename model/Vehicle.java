package model;

public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double fuelLevel;
    private boolean running;

    public Vehicle(String make,
                   String model,
                   int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = 100;
        this.running = false;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if(year > 1885) {
            this.year = year;
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isRunning() {
        return running;
    }

    public void startEngine() {

        if(fuelLevel <= 0) {

            System.out.println(
                    "No fuel available."
            );

            return;
        }

        running = true;

        System.out.println(
                "Engine Started."
        );
    }

    public void stopEngine() {

        running = false;

        System.out.println(
                "Engine Stopped."
        );
    }

    public void refuel(double amount) {

        fuelLevel += amount;

        if(fuelLevel > 100) {
            fuelLevel = 100;
        }
    }

    public abstract String getVehicleType();

    public void displayInfo() {

        System.out.println(
                year + " " +
                make + " " +
                model
        );

        System.out.println(
                "Fuel Level: " +
                fuelLevel + "%"
        );
    }

    @Override
    public String toString() {

        return getVehicleType() +
                " | " +
                make +
                " | " +
                model +
                " | " +
                year;
    }
}
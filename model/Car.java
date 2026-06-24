package model;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make,
               String model,
               int year,
               int numberOfDoors) {

        super(make, model, year);

        this.numberOfDoors =
                numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(
            int numberOfDoors) {

        this.numberOfDoors =
                numberOfDoors;
    }

    public void lockDoors() {

        System.out.println(
                "Doors Locked."
        );
    }

    @Override
    public String getVehicleType() {

        return "Car";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Doors: " +
                numberOfDoors
        );
    }
}
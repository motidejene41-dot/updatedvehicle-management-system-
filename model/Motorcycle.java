package model;

public class Motorcycle extends Vehicle {

    private String style;
    private boolean hasSidecar;

    public Motorcycle(String make,
                      String model,
                      int year,
                      String style,
                      boolean hasSidecar) {

        super(make, model, year);

        this.style = style;
        this.hasSidecar =
                hasSidecar;
    }

    public String getStyle() {
        return style;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void doWheelie() {

        if(isRunning()
                && !hasSidecar) {

            System.out.println(
                    "Wheelie Performed!"
            );

        } else {

            System.out.println(
                    "Cannot Perform Wheelie."
            );
        }
    }

    @Override
    public String getVehicleType() {

        return "Motorcycle";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Style: " +
                style
        );

        System.out.println(
                "Sidecar: " +
                hasSidecar
        );
    }
}
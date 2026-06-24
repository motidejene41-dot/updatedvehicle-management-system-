package app;

import model.Car;
import model.Motorcycle;
import model.Truck;
import model.Vehicle;

import service.DatabaseManager;
import service.FileManager;
import service.VehicleManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VehicleManager manager =
                new VehicleManager();

        int choice = 0;

        while (choice != 7) {

            System.out.println("\n==============================");
            System.out.println("VEHICLE MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Add Car");
            System.out.println("2. Add Truck");
            System.out.println("3. Add Motorcycle");
            System.out.println("4. View Vehicles");
            System.out.println("5. Save Vehicles To File");
            System.out.println("6. Save Vehicles To Database");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");

            try {

                choice = input.nextInt();
                input.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Make: ");
                        String carMake =
                                input.nextLine();

                        System.out.print("Model: ");
                        String carModel =
                                input.nextLine();

                        System.out.print("Year: ");
                        int carYear =
                                input.nextInt();

                        System.out.print("Number of Doors: ");
                        int doors =
                                input.nextInt();

                        Vehicle car =
                                new Car(
                                        carMake,
                                        carModel,
                                        carYear,
                                        doors
                                );

                        manager.addVehicle(car);

                        System.out.println(
                                "Car Added Successfully!"
                        );

                        break;

                    case 2:

                        System.out.print("Make: ");
                        String truckMake =
                                input.nextLine();

                        System.out.print("Model: ");
                        String truckModel =
                                input.nextLine();

                        System.out.print("Year: ");
                        int truckYear =
                                input.nextInt();

                        System.out.print("Maximum Payload (tons): ");
                        double payload =
                                input.nextDouble();

                        Vehicle truck =
                                new Truck(
                                        truckMake,
                                        truckModel,
                                        truckYear,
                                        payload
                                );

                        manager.addVehicle(truck);

                        System.out.println(
                                "Truck Added Successfully!"
                        );

                        break;

                    case 3:

                        System.out.print("Make: ");
                        String bikeMake =
                                input.nextLine();

                        System.out.print("Model: ");
                        String bikeModel =
                                input.nextLine();

                        System.out.print("Year: ");
                        int bikeYear =
                                input.nextInt();

                        input.nextLine();

                        System.out.print("Style: ");
                        String style =
                                input.nextLine();

                        System.out.print(
                                "Has Sidecar (true/false): "
                        );

                        boolean sidecar =
                                input.nextBoolean();

                        Vehicle motorcycle =
                                new Motorcycle(
                                        bikeMake,
                                        bikeModel,
                                        bikeYear,
                                        style,
                                        sidecar
                                );

                        manager.addVehicle(
                                motorcycle
                        );

                        System.out.println(
                                "Motorcycle Added Successfully!"
                        );

                        break;

                    case 4:

                        manager.displayVehicles();

                        break;

                    case 5:

                        FileManager.saveVehicles(
                                manager.getVehicles()
                        );

                        break;

                    case 6:

                        DatabaseManager.saveVehicles(
                                manager.getVehicles()
                        );

                        break;

                    case 7:

                        System.out.println(
                                "Program Closed."
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid Choice."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "Invalid Input!"
                );

                input.nextLine();
            }
        }

        input.close();
    }
}
package service;

import model.Vehicle;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveVehicles(
            ArrayList<Vehicle> vehicles) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "vehicles.txt"
                    );

            for (Vehicle vehicle
                    : vehicles) {

                writer.write(
                        vehicle.toString()
                );

                writer.write(
                        System.lineSeparator()
                );
            }

            writer.close();

            System.out.println(
                    "Vehicles saved to file successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error saving file: "
                            + e.getMessage()
            );
        }
    }
}
package service;

import model.Vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseManager {

    private static final String URL =
            "jdbc:mysql://localhost:3306/vehicledb";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "";

    public static void saveVehicles(
            ArrayList<Vehicle> vehicles) {

        try {

            Connection connection =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            String sql =
                    "INSERT INTO vehicles "
                    + "(make, model, year, type) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement statement =
                    connection.prepareStatement(
                            sql
                    );

            for (Vehicle vehicle
                    : vehicles) {

                statement.setString(
                        1,
                        vehicle.getMake()
                );

                statement.setString(
                        2,
                        vehicle.getModel()
                );

                statement.setInt(
                        3,
                        vehicle.getYear()
                );

                statement.setString(
                        4,
                        vehicle.getVehicleType()
                );

                statement.executeUpdate();
            }

            statement.close();
            connection.close();

            System.out.println(
                    "Vehicles saved to database."
            );

        } catch (SQLException e) {

            System.out.println(
                    "Database Error: "
                            + e.getMessage()
            );
        }
    }
}
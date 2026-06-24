# Vehicle Management System

## Introduction

The Vehicle Management System is a Java application developed as part of our Object-Oriented Programming (OOP) coursework. The purpose of this project is to manage different types of vehicles while demonstrating important OOP concepts and Java programming techniques.

The system allows users to add and manage Cars, Trucks, and Motorcycles through a simple menu-driven interface. Vehicle information can be displayed, saved to a text file, and stored in a MySQL database using JDBC.

---

## Project Features

The system provides the following functionalities:

* Add a new Car
* Add a new Truck
* Add a new Motorcycle
* Display all vehicles stored in the system
* Save vehicle information to a text file
* Save vehicle information to a MySQL database
* Handle invalid user inputs using exception handling

---

## OOP Concepts Used

This project was designed to demonstrate the following Object-Oriented Programming concepts:

### Encapsulation

Vehicle attributes are declared as private and are accessed through getter and setter methods.

### Constructors

Constructors are used to initialize objects when they are created.

### Inheritance

The Car, Truck, and Motorcycle classes inherit common properties and methods from the Vehicle class.

### Method Overriding

Each vehicle type overrides methods such as `displayInfo()` and `getVehicleType()` to provide its own implementation.

### Polymorphism

A Vehicle reference can be used to store objects of different vehicle types such as Car, Truck, and Motorcycle.

### Abstraction

The Vehicle class is implemented as an abstract class that provides common functionality for all vehicle types.

### Packages

The project is organized into separate packages to improve readability and maintainability.

### Access Modifiers

Private and public access modifiers are used to control access to class members.

### ArrayList

An ArrayList is used to store multiple vehicle objects dynamically.

### Scanner

The Scanner class is used to collect input from the user.

### Exception Handling

Try-catch blocks are used to handle invalid input and runtime errors.

### File and Stream Handling

Vehicle information can be written to a text file using FileWriter.

### JDBC

JDBC is used to connect the application to a MySQL database and store vehicle records.

---

## Project Structure


├── app
│   └── Main.java
│
├── model
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Truck.java
│   └── Motorcycle.java
│
└── service
    ├── VehicleManager.java
    ├── FileManager.java
    └── DatabaseManager.java

Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework
* MySQL
* JDBC
* Visual Studio Code

## Database Setup

To create the database used by this project, run the following SQL commands:

sql
CREATE DATABASE vehicledb;

USE vehicledb;

CREATE TABLE vehicles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    make VARCHAR(50),
    model VARCHAR(50),
    year INT,
    type VARCHAR(30)
);


## Authors

This project was developed by:

* Moti Dejene
* Natoli Mekonen
* Salim Nejim


## Conclusion

This project provided practical experience in applying Object-Oriented Programming principles using Java. It combines concepts such as inheritance, abstraction, polymorphism, exception handling, file management, and database connectivity to create a simple but functional Vehicle Management System.

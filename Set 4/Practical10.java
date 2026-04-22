class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;

    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75.0, 1.5);

        System.out.println("=== Vehicle ===");
        v1.displayDetails();

        System.out.println("\n=== Car ===");
        c1.displayDetails();

        System.out.println("\n=== Electric Car ===");
        e1.displayDetails();

        System.out.println("\n=== Upcasting ===");
        Vehicle v = new Car("GJ04GH3456", "Honda", "Petrol", 5, true);
        v.displayDetails();

        System.out.println("\n=== Downcasting with instanceof ===");
        if (v instanceof Car) {
            Car temp = (Car) v;
            System.out.println("Accessing Car specific details:");
            System.out.println("Seats: " + temp.numberOfSeats);
            System.out.println("AC Available: " + temp.ACavailable);
        }
    }
}

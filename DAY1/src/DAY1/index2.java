package DAY1;

public class index2 {

    // Lớp Vehicle (Phương tiện)
    class Vehicle {
        String brand;
        String model;
        int year;
        String color;
        String licensePlate;
        String fuelType;

        // Constructor
        public Vehicle(String brand, String model, int year, String color, String licensePlate, String fuelType) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
            this.licensePlate = licensePlate;
            this.fuelType = fuelType;
        }

        public void startEngine() {
            System.out.println("Engine started");
        }

        public void stopEngine() {
            System.out.println("Engine stopped");
        }

        public void accelerate(int speed) {
            System.out.println("Accelerating to " + speed + " km/h");
        }

        public void brake() {
            System.out.println("Braking");
        }
    }

    // Lớp Car kế thừa từ Vehicle
    class Car extends Vehicle {
        int numberOfDoors;
        String transmission;
        int maxSpeed;

        // Constructor
        public Car(String brand, String model, int year, String color, String licensePlate, String fuelType, int numberOfDoors, String transmission, int maxSpeed) {
            super(brand, model, year, color, licensePlate, fuelType);
            this.numberOfDoors = numberOfDoors;
            this.transmission = transmission;
            this.maxSpeed = maxSpeed;
        }

        public void honk() {
            System.out.println("Honking");
        }

        public void openDoor(int doorNumber) {
            System.out.println("Opening door " + doorNumber);
        }

        public void closeDoor(int doorNumber) {
            System.out.println("Closing door " + doorNumber);
        }
    }

    // Lớp Bus kế thừa từ Vehicle
    class Bus extends Vehicle {
        int numberOfSeats;
        int numberOfDoors;
        int routeNumber;
        int capacity;

        // Constructor
        public Bus(String brand, String model, int year, String color, String licensePlate, String fuelType, int numberOfSeats, int numberOfDoors, int routeNumber, int capacity) {
            super(brand, model, year, color, licensePlate, fuelType);
            this.numberOfSeats = numberOfSeats;
            this.numberOfDoors = numberOfDoors;
            this.routeNumber = routeNumber;
            this.capacity = capacity;
        }

        public void pickUpPassengers() {
            System.out.println("Picking up passengers");
        }

        public void dropOffPassengers() {
            System.out.println("Dropping off passengers");
        }

        public void openDoor(int doorNumber) {
            System.out.println("Opening door " + doorNumber);
        }

        public void closeDoor(int doorNumber) {
            System.out.println("Closing door " + doorNumber);
        }
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Car
        index2 program = new index2();  // Tạo đối tượng chương trình để truy cập các lớp lồng nhau
        Car myCar = program.new Car("Toyota", "Corolla", 2021, "White", "ABC123", "Gasoline", 4, "Automatic", 180);
        System.out.println("My car is a " + myCar.brand + " " + myCar.model);
        myCar.startEngine();
        myCar.honk();
        myCar.accelerate(60);
        myCar.openDoor(1);
        myCar.brake();
        myCar.stopEngine();
        System.out.println();

        // Khởi tạo đối tượng Bus
        Bus myBus = program.new Bus("Mercedes", "Sprinter", 2020, "Yellow", "XYZ456", "Diesel", 20, 2, 101, 30);
        System.out.println("My bus is a " + myBus.brand + " " + myBus.model);
        myBus.startEngine();
        myBus.pickUpPassengers();
        myBus.accelerate(50);
        myBus.openDoor(1);
        myBus.brake();
        myBus.dropOffPassengers();
        myBus.stopEngine();
    }
}


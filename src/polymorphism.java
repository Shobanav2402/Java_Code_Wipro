class Vehicle{
    void startEngine(){
        System.out.println("The vehicle's engine is starting");
    }
}
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("The car's engine starts with a key or push button.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("The motorcycle's engine starts with a kick or electric starter.");
    }
}


public class polymorphism {
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        // Testing polymorphism
        vehicleTestDrive(myCar);
        vehicleTestDrive(myMotorcycle);
        
    }

}

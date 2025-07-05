
abstract class Vehicle {
    abstract void start(); // Abstract method (no body)
    
    void stop() {  // Concrete method (has a body)
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

public class _11_Abstract_classes{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car is starting...
        myCar.stop();  // Output: Vehicle stopped.
    }
}

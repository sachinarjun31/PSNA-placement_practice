class Vehicle {
    int maxSpeed = 120;

    Vehicle() { //constructor
        System.out.println("Vehicle constructor called");
    }

    void displaySpeed() {
        System.out.println("Vehicle max speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int maxSpeed = 180;

    Car() {
        super();  //super keyword used to call the parent constructor as default
        System.out.println("Car constructor called");
    }

    void displaySpeed() {
        super.displaySpeed();
        System.out.println("Car max speed: " + maxSpeed);
    }

    void showSpeeds() {
        System.out.println("Vehicle max speed variable: " + super.maxSpeed); 
        System.out.println("Car max speed variable: " + maxSpeed);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.displaySpeed();
        car.showSpeeds();
    }
}

package structural.flyweight;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

        System.out.printf("Object returned by the factory is not null! %s\n", blackVehicle);
        System.out.printf("Object returned by the factory is not null! %s\n", blueVehicle);
        System.out.println(blackVehicle.equals(blueVehicle)); //false

        Vehicle anotherBlackVehicle = VehicleFactory.createVehicle(Color.BLACK);

        System.out.printf("Object returned by the factory is not null! %s\n", blackVehicle);
        System.out.printf("Object returned by the factory is not null! %s\n", anotherBlackVehicle);
        System.out.println(blackVehicle.equals(anotherBlackVehicle)); //true
    }
}

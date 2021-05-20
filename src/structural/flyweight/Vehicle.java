package structural.flyweight;

import java.awt.*;

public interface Vehicle {

    /**
     * Starts the vehicle.
     */
    public void start();

    /**
     * Stops the vehicle.
     */
    public void stop();

    /**
     * Gets the color of the vehicle.
     *
     * @return the color of the vehicle
     */
    public Color getColor();

}

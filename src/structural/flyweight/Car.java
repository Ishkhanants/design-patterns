package structural.flyweight;

import java.awt.*;
import java.util.logging.Logger;

public class Car implements Vehicle {

    /**
     * Logger.
     */
    private final static Logger LOG = Logger.getLogger(Car.class.getName());

    /**
     * The car's engine.
     */
    private Engine engine;

    /**
     * The car's color.
     */
    private Color color;

    /**
     * Instantiates a new Car.
     *
     * @param engine
     *            the {@link #engine}
     * @param color
     *            the {@link #color}
     */
    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        // Building a new car is a very expensive operation!
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LOG.severe("Error while creating a new car\n" + e.getMessage());
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#start()
     */
    @Override
    public void start() {
        LOG.info("Car is starting!");
        engine.start();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#stop()
     */
    @Override
    public void stop() {
        LOG.info("Car is stopping!");
        engine.stop();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.baeldung.flyweight.Vehicle#getColor()
     */
    @Override
    public Color getColor() {
        return this.color;
    }

}

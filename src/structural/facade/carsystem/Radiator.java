package structural.facade.carsystem;

import java.util.logging.Logger;

public class Radiator {

    private static final Logger LOGGER = Logger.getLogger(Radiator.class.getName());

    public void on(){
        LOGGER.info("Radiator switched on!");
    }

    public void off(){
        LOGGER.info("Radiator switched off!");
    }

    public void setSpeed(Integer speed){
        LOGGER.info(String.format("Setting radiator speed to %s", speed));
    }
}

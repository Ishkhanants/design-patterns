package structural.adapter;

import java.util.logging.Logger;

public class Main {
    public static void main(String args[]) {
        Logger LOG = Logger.getLogger(Main.class.getName());

        Movable bugattiVeyron = new Bugatti();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        LOG.info("Bugatti F1 top speed is " + bugattiVeyronAdapter.getSpeed() + " Kmph.");

        Movable mcLaren = new McLaren();
        MovableAdapter mcLarenAdapter = new MovableAdapterImpl(mcLaren);
        LOG.info("McLaren F1 top speed is " + mcLarenAdapter.getSpeed() + " Kmph.");

        Movable astonMartin = new AstonMartin();
        MovableAdapter astonMartinAdapter = new MovableAdapterImpl(astonMartin);
        LOG.info("McLaren F1 top speed is " + astonMartinAdapter.getSpeed() + " Kmph.");
    }
}

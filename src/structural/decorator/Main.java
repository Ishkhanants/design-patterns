package structural.decorator;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger LOG = Logger.getLogger(structural.adapter.Main.class.getName());

        // christmas tree with just one Garland
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        LOG.info(tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        LOG.info(tree2.decorate());
    }
}


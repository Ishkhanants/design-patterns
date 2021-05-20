package structural.proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private Logger LOG = Logger.getLogger(ExpensiveObjectImpl.class.getName());

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        LOG.info("processing complete.");
    }

    private void heavyInitialConfiguration() {
        LOG.info("Loading initial configuration..");
    }

}

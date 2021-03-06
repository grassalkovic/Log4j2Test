import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by peter.kompan on 3/3/17.
 *
 * Class bar for testing different loggers
 */
public class Bar {
    private static Logger logger = LogManager.getLogger(Bar.class);

    public Bar(){
        logger.traceEntry("Bar");
        logger.traceExit();
    }

    public void logVoid( int a, String s, String t, int b, int c, int d){

        logger.traceEntry("logVoid", a, s, t, b, c, d);


        logger.trace("trace log happened void");
        logger.error("error log happened void");

        logger.traceExit();
    }

    public boolean logBoolean(){
        logger.traceEntry("logBoolean");

        logger.trace("trace log happened boolean");
        logger.error("error log happened boolean");

        return logger.traceExit(false);
    }

    public void raiseException(int a, String b) throws fooException {
        logger.traceEntry("raiseException", a, b);

        if (a == 4){
            logger.warn("value 4 will cause throwing of an exception");

            try {
                baseException(a);
            } catch (barException e) {
                throw new fooException("Foo exception has been raised", e);
            }
        }

        logger.traceExit();
    }

    private void baseException(int a) throws  barException {
        logger.traceEntry("baseException");

        if (a == 4){
            logger.warn("value 4 will cause throwing of an exception");

            throw new barException("Bar exception has been raised", null);
        }

        logger.traceExit();

    }
}

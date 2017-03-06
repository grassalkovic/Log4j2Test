import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.ERROR;

/**
 * Created by peter.kompan on 3/3/17.
 *
 * Main class for log4j2 testing
 */
public class Log4j2Test {

    private static Logger logger = LogManager.getLogger(Log4j2Test.class);
//    this is the same ase the one above
//    private static Logger logger = LogManager.getLogger();

    public static void main (String[] args){
        logger.trace("Entering application.");

        logger.trace("trace log happened");
        logger.warn("warning log happened");
        logger.error("error log happened");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Bar bar = new Bar();

        bar.logBoolean();
        bar.logVoid(4,"String", "abcd", 4, 4, 4);

        try {
            bar.raiseException(4, "String");
        } catch (fooException e) {

            logger.catching(ERROR, e);

        }
    }
}

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;

/**
 * Created by slavka on 3/3/17.
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
    }
}
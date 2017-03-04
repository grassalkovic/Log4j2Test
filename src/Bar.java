import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by slavka on 3/3/17.
 */
public class Bar {
    private static Logger logger = LogManager.getLogger(Bar.class);

    public Bar(){
        logger.entry();
        logger.exit();
    }

    public void logVoid( int a, String s, String t, int b, int c, int d){

        logger.entry(a, s, t, b, c, d);


        logger.trace("trace log happened void");
        logger.error("error log happened void");

        logger.exit();
    }

    public boolean logBoolean(){
        logger.traceEntry();

        logger.trace("trace log happened boolean");
        logger.error("error log happened boolean");

        return logger.exit(false);
    }
}

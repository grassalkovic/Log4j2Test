/**
 * Created by peter.kompan on 06-Mar-17.
 *
 * Exception class to test logging with log4j2
 */
public class fooException extends Exception {
    public fooException(String message, Throwable exc) {
        super(message, exc);
    }
}

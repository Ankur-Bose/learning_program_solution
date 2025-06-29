package Exercise3_Using_Different_Appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersExample {

    // Create logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(AppendersExample.class);

    public static void main(String[] args) {

        logger.debug("This is a DEBUG level message.");
        logger.info("This is an INFO level message.");
        logger.warn("This is a WARN level message.");
        logger.error("This is an ERROR level message.");

        // Example of parameterized logging
        String username = "Ankur";
        int attempts = 3;
        logger.info("User {} has attempted login {} times", username, attempts);
    }
}
package Exercise2_Parameterized_Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Ankur";
        int userId = 101;
        String action = "login";

        logger.info("User {} with ID {} has performed the action: {}",user, userId,action);

        int a = 10;
        int b = 5;
        int sum = a+b;

        logger.debug("Adding {} and {} gives {}",a,b,sum);

        if(sum>10) {
            logger.warn("Sum {} is greater than expected threshold. ", sum);
        }

        try{
            int result = divide(a,0);
            logger.info("Division result is {}",result);
        } catch (ArithmeticException e) {
            logger.error("Error dividing {} by {}: {}",a,0,e.getMessage());
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}

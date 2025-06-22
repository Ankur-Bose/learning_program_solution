class Logger{
    private static Logger logger;
    private Logger(){}
    public static Logger getLogger(){
        if(logger == null){
            synchronized(Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}



// test class
public class SingletonPattern {
    public static void main(String[] args) {
        // test to check whether only one instance of logger is created and used or not...
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        Logger logger3 = Logger.getLogger();
        Logger logger4 = Logger.getLogger();
        Logger logger5 = Logger.getLogger();

        // In singleton object, it says that, the hashcode of the instance variable will always be same.
        long hashcode_logger1 = logger1.hashCode();
        long hashcode_logger2 = logger2.hashCode();
        long hashcode_logger3 = logger3.hashCode();
        long hashcode_logger4 = logger4.hashCode();
        long hashcode_logger5 = logger5.hashCode();

        // Lets print the values and see the result

        System.out.println("Hashcode value for Logger 1 "+hashcode_logger1);
        System.out.println("Hashcode value for Logger 2 "+hashcode_logger2);
        System.out.println("Hashcode value for Logger 3 "+hashcode_logger3);
        System.out.println("Hashcode value for Logger 4 "+hashcode_logger4);
        System.out.println("Hashcode value for Logger 5 "+hashcode_logger5);
    }
}
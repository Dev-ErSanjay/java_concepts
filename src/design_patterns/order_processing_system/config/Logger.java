package config;

import java.time.LocalDateTime;

public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("Logger object created");
    }

    public static synchronized Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void log(String message) {

        System.out.println(LocalDateTime.now() + " " + message);
    }
}

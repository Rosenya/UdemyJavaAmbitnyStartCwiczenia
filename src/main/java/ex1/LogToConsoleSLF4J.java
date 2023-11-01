package ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogToConsoleSLF4J {

    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(LogToConsoleSLF4J.class);

        LOGGER.info("info from logger!");
    }

}

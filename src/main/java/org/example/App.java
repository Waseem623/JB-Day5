package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        logger.trace("Trace level Log displaying");
        logger.debug("Debug level Log displaying");
        logger.info("Info level Log displaying");
        logger.warn("Warn level Log displaying");
        logger.error("Error level Log displaying");
        logger.fatal("Fatal level Log displaying");
    }
}
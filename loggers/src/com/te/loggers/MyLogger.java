package com.te.loggers;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
	/*	ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.CONFIG);

		LOGGER.addHandler(consoleHandler);
*/
		
		FileHandler fileHandler = new FileHandler("C:\\Users\\Y\\Desktop\\LOGGER\\LOGGER.log");
		Formatter myFormat = new MyFormat();
		fileHandler.setFormatter(myFormat);
		LOGGER.setLevel(Level.FINE);

		LOGGER.finest("iam from finest");
		LOGGER.finer("iam from finer");
		LOGGER.fine("iam from fine");
		LOGGER.config("iam from config");
		LOGGER.info("i am from info");
		LOGGER.warning("iam from warning");
		LOGGER.severe("iam from sereve");

	}

}

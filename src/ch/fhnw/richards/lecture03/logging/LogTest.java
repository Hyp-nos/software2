package ch.fhnw.richards.lecture03.logging;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class LogTest {
	public static final String LOGGER_NAME= LogTest.class.getSimpleName();
	private Logger logger = null;
	public static void main(String[] args) {
	
	LogTest instance = new LogTest();
	instance.doStuff();

	}
	private LogTest(){
		logger = Logger.getLogger(LOGGER_NAME);
		logger.setLevel(Level.FINEST);
		Handler[] defaultHandlers = Logger. getLogger("").getHandlers();
		 System. out.println(defaultHandlers. length);
		 if (defaultHandlers. length == 1) {
		 // Configure the console handler
		 defaultHandlers[0].setLevel(Level. WARNING);
		 } else {
		 throw new RuntimeException("More than one default handler found");
		 }
	}
	private void doStuff() {
		// TODO Auto-generated method stub
		
	}

}

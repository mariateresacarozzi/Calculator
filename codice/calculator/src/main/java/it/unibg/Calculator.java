package it.unibg;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {

		/*
		 * Per creare un oggetto logger
		 */
		private static final Logger LOGGER = LogManager.getLogger();
		
		/*
		 * per dare istruzioni al logger
			logger.debug("Debug log message");
			logger.info("Info log message");
			logger.error("Error log message");
		 */
		public static void main(String... args) {
		        String thing = args.length > 0 ? args[0] : "world";
		        LOGGER.error("Hello, {}", thing);
		        LOGGER.debug("Got calculated value only if debug enabled: {}", () -> doSomeCalculation());
		    }

		    private static Object doSomeCalculation() {
		        return null;
		        // do some complicated calculation
		    }
		

	}


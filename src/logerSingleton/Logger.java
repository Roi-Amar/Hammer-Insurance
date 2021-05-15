package logerSingleton;

public class Logger {
	    private static Logger instance = null;
	    public String example;
	  
	    private Logger() {
	        example = "I am a singelton logger";
	    }
	  
	    public static Logger getInstance() {
	        if (instance == null)
	            instance = new Logger();
	        return instance;
	    }
}

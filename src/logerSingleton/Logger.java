package logerSingleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
    
	    public ArrayList<String[]> readCSV(String pathToCsv) throws IOException {
	    String row = null;
	    ArrayList<String[]> readData = new ArrayList<String[]>();
	    BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
		    while ((row = csvReader.readLine()) != null) {
		        String[] data = row.split(",");
		        readData.add(data);
		    }
	    csvReader.close();
	    return readData;
	    }
}

package logerSingleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {
	    private static Logger instance = null;
	    public String example;
		private String basePath = new File("").getAbsolutePath();

	  
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
	    BufferedReader csvReader = new BufferedReader(new FileReader(basePath+pathToCsv));
		    while ((row = csvReader.readLine()) != null) {
		        String[] data = row.split(",");
		        readData.add(data);
		    }
	    csvReader.close();
	    return readData;
	    }
	    
	    public boolean writeCSV(String pathToCsv, String[] content) throws IOException {
	    	FileWriter csvWriter = new FileWriter(basePath+pathToCsv,true);
	    	for (String data : content) {
	    	    csvWriter.append(data);
	    	    csvWriter.append(",");
	    	}
    	    csvWriter.append("\n");
	    	csvWriter.flush();
	    	csvWriter.close();
	    	return true;
	    }
	    
	    public ArrayList<String[]> readJSON(String pathToJson){
	    	return null;
	    }

	
}

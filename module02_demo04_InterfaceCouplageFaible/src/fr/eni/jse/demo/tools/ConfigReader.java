/**
 * 
 */
package fr.eni.jse.demo.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bmartin
 *
 */
public class ConfigReader {
	public static String getPropertieValue(String propertyName) {
		String propertyValue = null;
	
		try (InputStream input = new FileInputStream("config/config.properties")) {
			Properties prop = new Properties();
	        // load a properties file
	        try {
				prop.load(input);
				// get the property value and print it out
		        propertyValue = prop.getProperty(propertyName);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return propertyValue;
	}

}

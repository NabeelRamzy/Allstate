package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	

	Properties properties;
	
	public ReadProperties() {
		loadProperties();
	}

	private void loadProperties() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("environment.properties");
		properties = new Properties(); 
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	public String getProperty(String Key) {
		if (Key != null) {
			 
		}else {
			return null;
		}
		return properties.getProperty(Key);
		
	}
	
	public long getNumProperty(String Key) {
		String value = getProperty(Key);
		if (value != null ) {
			String refindvalue = value.trim().replaceAll("[^0-9]", "");
			return Long.parseLong(refindvalue);
		}else
		return 0;
		
	}
	//public static void main(String[] args) {
	//	ReadPropertie ReadPropertie = new ReadPropertie
	//	String urlString = ReadPropertie.getProperty("bowser");
	//	System.out.println(urlString);
	//	String urlString2 = ReadPropertie.getProperty(null);
	//	System.out.println(urlString2);
	//	String urlString3 = ReadPropertie.getProperty("abc");
	//	System.out.println(urlString3);
		
	//	long wait = ReadPropertie.getNumProperty("pageloadTime");
	//	System.out.println(wait);
	//}
}




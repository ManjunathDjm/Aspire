package com.onco.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesData {

	static Properties properties;

	public static void loadData() throws Exception {

		properties = new Properties();
		File f = new File("/Users/manjunathdj/Applications/OncoWeb/src/resources/config.properties");
		FileReader obj = new FileReader(f);
		properties.load(obj);
		
}

	public static String getObject(String Data) throws Exception {
	loadData();
	String data = properties.getProperty(Data);
	return data;
	}

}

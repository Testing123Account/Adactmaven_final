package com.helperfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	public ConfigurationReader() throws IOException
	{
		File f=new File("C:\\Users\\devi\\eclipse-workspace\\eclipse-workspace\\adact_mavenfinal\\src\\main\\java\\com\\helperfile\\Configuration.properties");
	FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getUrl() {
		String url_auto=p.getProperty("url");
		return url_auto;
	}
}

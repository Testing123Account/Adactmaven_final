package com.helperfile;

import java.io.IOException;

public class FileReadManager {
	
	private FileReadManager() {
		
	}
	public static FileReadManager getInstance_FRM() {
		FileReadManager helper=new FileReadManager();
		return helper;
	}
	public ConfigurationReader getInstance_CR() throws IOException{
		ConfigurationReader reader=new ConfigurationReader();
		return reader;
	}
}

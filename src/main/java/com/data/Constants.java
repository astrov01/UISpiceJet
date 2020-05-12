package com.data;

public class Constants {

	public static final Constants BROWSER = new Constants("BROWSER");
	public static final Constants ENVIRONMENT = new Constants("ENVIRONMENT");
	public static final Constants DATA_FILE = new Constants("DATA_FILE");
	public static final Constants CHROME = new Constants("CHROME");
	public static final Constants FIREFOX = new Constants("FIREFOX");
	public static final Constants DEFAULT_BROWSER = new Constants("DEFAULT_BROWSER");
	public static final Constants REPORT_PATH = new Constants("REPORT_PATH");
	public static final Constants REPORT_NAME = new Constants("REPORT_NAME");
	public static final Constants SERVER = new Constants("SERVER");
	public static final Constants BUILD = new Constants("BUILD");
	public static final Constants PROJECT = new Constants("PROJECT");
	public static final Constants RESOLUTION = new Constants("RESOLUTION");
	public static final Constants BUILD_NAME = new Constants("BUILD_NAME");
	public static final Constants BROWSER_VERSION = new Constants("BROWSER_VERSION");
	public static final Constants OS = new Constants("OS");
	public static final Constants OS_VERSION = new Constants("OS_VERSION");
	
	private String name;
	
	public Constants(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

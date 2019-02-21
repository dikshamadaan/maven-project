package com.QA.testBaseDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.*;

import MAVEN.demo.Webdriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Test
public class TestBAse_java {

	public static Webdriver driver;
	public static Properties prop;
	
 public void testbase()
{
	try
	{
	FileInputStream ip= new FileInputStream ("C:\\Users\\User\\eclipse-workspace\\demo\\src\\main\\java\\com\\facebook\\configuration\\configuration.properties");
	prop=new Properties();
	prop.load(ip);
	
     }
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}

 public static void initialization()
 {
	String broswerName=prop.getProperty("browser");
	
	if(broswerName.equalsIgnoreCase("chrome"));
	  {
		System.setProperty(prop.getProperty("Systemproperty_1"),prop.getProperty("Systemproperty_2"));
	    driver = new Webdriver();
	  
	  }
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.NANOSECONDS);
	  driver.get(prop.getProperty("url"));
	  
	  
 }
 
}
 
 

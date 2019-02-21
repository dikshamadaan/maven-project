package MAVEN.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver 
{
String path;
public static ChromeDriver driver;
@Beforesuite
public void launch_browser()
{
	path=System.getProperty("User.dir")+"//Driver//chrome//exe";
	System.setProperty("WebDriver.chrome.driver", path);
   driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
}
@Aftersuite
public void close_broswer()
{
	driver.close();
	
}
}

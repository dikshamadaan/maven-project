package demo;

import org.testng.annotations.BeforeSuite;

public class Open_Browser {
	String path;
	public static WebDriver driver;
	@BeforeSuite
	public void Open_Browser()
	{
		path=System.getProperty("User.dir")+"//Driver//chrome//exe";
		System.setProperty("WebDriver.chrome.driver", path);
	}

}

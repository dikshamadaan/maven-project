package MAVEN.demo;

import org.junit.Test;

public class loginTest extends Driver{
@Test
public void checklogin()
{
	driver.findElement(By.id("email")).sendkeys("admin");
	driver.findElement(By.id("pass")).sendkeys("admin");
	driver.findElement(By.id("loginbutton")).click();
	driver.navigate().back();
	
}

}

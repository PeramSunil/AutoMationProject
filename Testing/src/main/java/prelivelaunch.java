import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prelivelaunch {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PP-IN-287\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://prelive.pragmaticplaylive.net/authentication/authenticate.jsp");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Peram");
			driver.findElement(By.id("pass")).sendKeys("Peram123");
			driver.findElement(By.xpath("//input[@alt=\"Verify me!\"]")).click();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	       String Parent = driver.getWindowHandle();
	       System.out.println("Current window ID"+ Parent);
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@id=\'DESKTOP\']/div/div/button/img")).click(); 
		    
		    Set<String> totalWindows = driver.getWindowHandles();
		    int count = totalWindows.size();
		    System.out.println("Child Window" + count);
		    
		    for(String child:totalWindows )
		    {
		    	if (!Parent.equalsIgnoreCase(child)) {
		    		driver.switchTo().window(child);
		    	}
		    }
		    driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@id=\'lobby-tables-container\']/div[3]/ul/li[1]/img")).click();
		    
	}
	}

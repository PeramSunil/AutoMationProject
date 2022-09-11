import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlaunch {

	public static void main(String[] args) throws InterruptedException {
		long start = System.nanoTime();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PP-IN-287\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		
		String Parent = driver.getWindowHandle();
		Set<String> Allwindows = driver.getWindowHandles();
		Iterator<String> su = Allwindows.iterator();
		while(su.hasNext()){
			String Child = su.next();
			if (Parent.equalsIgnoreCase(Child)) {
				driver.switchTo().window(Child);
				}
		}
		driver.findElement(By.id("glow-ingress-line2")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("522316");
		driver.findElement(By.xpath("//*[@id='GLUXZipUpdate']/span/input")).click();
		
		driver.findElement(By.xpath("//*[@id='GLUXSignInButton']/span/input")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 while(su.hasNext()) {
			 String Child1 = su.next();
			 if(Parent.equalsIgnoreCase(Child1)) {
				 driver.switchTo().window(Child1);
			 }
		 }
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 driver.findElement(By.id("ap_email")).sendKeys("9553994852");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Sunil@4852");
		 driver.findElement(By.id("signInSubmit")).click();
		driver.switchTo().window(Parent);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("real me phone between 15000-20000");
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.close();
		 long duration = (System.nanoTime()-start)/1000000;
		 System.out.println(duration +"ms");
		 
}
}

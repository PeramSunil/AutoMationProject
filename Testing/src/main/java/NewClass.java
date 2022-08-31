import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PP-IN-287\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://games.pragmaticplaylive.net/portal");
		driver.findElement(By.id("username")).sendKeys("venkata");
		driver.findElement(By.id("pass")).sendKeys("venkata");
		driver.findElement(By.xpath("//input[@alt=\"Verify me!\"]")).click();
		String Parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> su = allwindows.iterator();
		while (su.hasNext())
		{
			String Child = su.next();
			if (!Parent.equalsIgnoreCase(Child)) {
				driver.switchTo().window(Child);
			}
		}
		driver.findElement(By.xpath("//*[@id=\'DESKTOP\']/div/div/button/img")).click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String Parent1 = driver.getWindowHandle();
		Set<String> allwindows1 = driver.getWindowHandles();
		Iterator<String> it = allwindows1.iterator();
		while (it.hasNext()) {
			String Child1 = it.next();
			if (!Parent1.equalsIgnoreCase(Child1)) {
				driver.switchTo().window(Child1);
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[1]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[2]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[4]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[5]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"game-container\"]/div[2]/app-lobby-desktop/div[2]/div[1]/div[2]/ul/li[6]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("tilesView")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("gridView")).click();
		Thread.sleep(3000);
	
	

	}

}



	

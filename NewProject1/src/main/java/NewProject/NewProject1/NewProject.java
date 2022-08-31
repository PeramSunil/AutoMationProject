package NewProject.NewProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PP-IN-287\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	

	}

}

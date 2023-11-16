package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		Thread.sleep(3000);
		WebElement x = d.findElement(By.xpath("//span[text()='✕']"));
		a.click(x).perform();
		WebElement signin = d.findElement(By.className("_1sLnDu"));
		a.click(signin).perform();
		WebElement mob = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mob.sendKeys("1234567890");
	}

}

package keyboardActions;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\keyboardActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://google.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		WebElement srch = d.findElement(By.id("APjFqb"));
		srch.sendKeys("Inmakes_Infotech");
		Actions a = new Actions(d);
		a.doubleClick(srch).perform();
	}

}

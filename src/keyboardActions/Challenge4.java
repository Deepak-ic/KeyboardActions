package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement signin = d.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.click(signin).perform();
		WebElement email = d.findElement(By.id("ap_email"));
		email.sendKeys("1234567890");
		Thread.sleep(3000);
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		Robot r = new Robot();
		for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}

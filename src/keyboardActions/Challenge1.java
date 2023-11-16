package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\keyboardActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		Actions a = new Actions(d);
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("Deepak_Sundaravelu");
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			// downArrow
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		} // enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement pass = d.findElement(By.id("pass"));
		a.contextClick(pass).perform();
		for (int i = 0; i < 7; i++) {
			// downArrow
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} // enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}

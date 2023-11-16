package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge6 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Actions a = new Actions(d);
		Thread.sleep(3000);
		WebElement x = d.findElement(By.xpath("//span[text()='✕']"));
		a.click(x).perform();
		WebElement elec = d.findElement(By.xpath("(//img[@class='_2puWtW _3a3qyb'])[6]"));
		elec.click();
		WebElement ac = d.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[5]"));
		a.moveToElement(ac).perform();
		a.contextClick().perform();
		Robot r = new Robot();
		for (int i = 0; i < 7; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

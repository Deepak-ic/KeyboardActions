package keyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge5 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Deepak\\Documents\\mouseActions\\drivers\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		WebElement random = d.findElement(By.xpath("(//img[@class='wooble'])[4]"));
		Actions a1 = new Actions(d);
		a1.contextClick(random).perform();
		Robot r = new Robot();
		//down arrow
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		//enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);		
		
	}

}

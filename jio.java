package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/selfcare/login/");
		driver.findElement(By.linkText("Mobile")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("True 5G")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("JioFiber")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Business")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shop")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apps")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Support")).clear();
		Thread.sleep(2000);
		driver.findElement(By.linkText("")).clear();

	}

}

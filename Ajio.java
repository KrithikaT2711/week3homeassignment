package homeassignmentweek3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.ajio.com/");
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
	driver.findElement(By.xpath("//span[@class='ic-search']")).click();
	driver.findElement(By.xpath("(//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	
	WebElement text = driver.findElement(By.xpath("//div[@class='length']"));
	String text2 = text.getText();
	
	System.out.println(text2);
}
}


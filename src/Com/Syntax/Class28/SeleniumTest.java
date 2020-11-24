package Com.Syntax.Class28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/raheen/Documents/chromedriver");
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");
    }
}
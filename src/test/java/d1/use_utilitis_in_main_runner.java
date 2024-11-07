package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class use_utilitis_in_main_runner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        Thread.sleep(4000);
        WebElement cdd=driver.findElement(By.id("countrySelect"));
        Select csdd=new Select(cdd);
        csdd.selectByVisibleText("India");
        Thread.sleep(4000);
        driver.quit();





    }
}

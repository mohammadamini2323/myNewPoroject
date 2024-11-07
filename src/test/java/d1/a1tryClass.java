package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a1tryClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        seliniumUtilities utilities=new seliniumUtilities(wait);
        int random_number=(int) (Math.random()*1000);
        String email="mohammad22"+random_number+"@gmail.com";
        utilities.click(By.cssSelector("div.min-w-fit >button.ant-btn-default"));
        utilities.click(By.linkText("Don't have account yet, register here"));
        utilities.sendKeys(By.id("firstName"),"mohammad");
        utilities.sendKeys(By.id("lastName"),"amini");
        utilities.sendKeys(By.id("email"),email);
        utilities.sendKeys(By.id("password"),"isthis34892@#");
        utilities.sendKeys(By.id("confirmPassword"),"isthis34892@#");
        utilities.click(By.cssSelector("button.ant-btn-primary"));
        Thread.sleep(2000);
        utilities.sendKeys(By.id("email"),email);
        utilities.sendKeys(By.id("password"),"isthis34892@#");
        utilities.click(By.cssSelector("div.ant-flex >button.ant-btn-primary"));
        utilities.click(By.cssSelector("button.ant-btn-circle"));
        String accoutsOWNNERname=utilities.getText(By.cssSelector("span.ant-dropdown-menu-title-content>div.ant-space-gap-col-small >div.ant-space-item"));
        System.out.println(accoutsOWNNERname);
        System.out.println(accoutsOWNNERname.equalsIgnoreCase("mohammad amini"));
        driver.quit();




    }


}

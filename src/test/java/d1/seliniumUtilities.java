package d1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class seliniumUtilities {
    WebDriverWait wait;

    public seliniumUtilities(WebDriverWait wait) {
        this.wait = wait;
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeys(By locator,String yourKeys)
    {wait.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(yourKeys);
    }
    public String getText(By locator){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
}

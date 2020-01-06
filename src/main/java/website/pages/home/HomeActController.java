package website.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static website.pages.DriverFactory.getChromeDriver;

public class HomeActController {

    private WebDriver driver = getChromeDriver();

    public HomeActController search(String value){

        WebElement search = driver.findElement(By.className("header_search--input"));
        //    WebElement search = driver.findElement(By.cssSelector(".header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);  // Here it goes to different page. So cannot apply builder patter as this action wont stay in the same page
        // So return type should be void
        return  this;
    }
}

package website.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static website.pages.DriverFactory.getChromeDriver;

public class HomePage {

    private HomeActController act;

    private HomePage(HomeActController act){
        this.act = act;
    }

    public HomeActController act(){
        return  act;
    }
//    private WebDriver driver = getChromeDriver();

    // This is o make sure HomPage object is accessible ONLY via getHomePage() below
    private HomePage (){
        //hide it
    }

    public static HomePage getHomePage(){
        return new HomePage();
    }

//    public void search(String value){
//        WebElement search = driver.findElement(By.className("header_search--input"));
//    //    WebElement search = driver.findElement(By.cssSelector(".header_search--input"));
//        search.sendKeys(value);
//        search.sendKeys(Keys.ENTER);  // Here it goes to different page. So cannot apply builder patter as this action wont stay in the same page
//                                        // So return type should be void
//    }
}

package website.pages.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import website.pages.search.AbstractPage;
import org.testng.Assert;

import static website.pages.DriverFactory.getChromeDriver;

public class CoursePage extends AbstractPage {

    private WebDriver driver = getChromeDriver();

    private CoursePage(){
        // hide it
    }

    public static CoursePage getCoursePage(){
        return new CoursePage();
    }

    public CoursePage verifyFreeTrialIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath(""))
                .isDisplayed());
        return this;
    }

    public CoursePage verifyCoursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath(""))
        .isDisplayed());

        return this;
    }

    // This is common method which can be used by other classes as well, So can be moved to Abstract class and extent from this class (i.e. Inheritance
    // Or can create typical util class like CommonVerification in this project (i.e. Composition) as Composition is less hassel and flexible in the long run compare to inheritance

//    public CoursePage verifyIsDisplayed(By element){
//
//        Assert.assertTrue(driver.findElement(element)
//                .isDisplayed());
//
//        return this;
//    }

    public static By freeTrialButton(){
        return By.xpath("");
    }

    public static By coursePreviewButton(){
        return By.xpath("");
    }



}

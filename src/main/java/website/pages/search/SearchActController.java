package website.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static website.pages.DriverFactory.getChromeDriver;
import static website.pages.DriverFactory.getWebDriverWait;

public class SearchActController {

    private WebDriver driver = getChromeDriver();
    private WebDriverWait wait = getWebDriverWait();

    public SearchActController filterBySkillLevel(SkillLevel value){

        driver.findElement(By.xpath(""))
                .click();

        By skillFilter = By.xpath("" + value);
        wait.until(visibilityOfElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter)
                .click();

        explicitWait();

        return this;
    }

    public SearchActController filterByRole(Role role){

        driver.findElement(By.xpath(""))
                .click();
        By roleFilter = By.xpath("" + role);
        wait.until(visibilityOfElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter)
                .click();

        explicitWait();

        return this;

    }

    public SearchActController selectTab(Tab tab){

        driver.findElement(By.xpath("" + tab))
                .click();
        return this;

    }

    public void selectCourse(String courseName){

        driver.findElement(By.xpath(" " + courseName))
                .click();   // Here it goes to different page. So cannot apply builder patter as this action wont stay in the same page
        // So return type should be void

    }
}

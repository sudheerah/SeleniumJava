package website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import website.pages.search.Role;
import website.pages.search.SkillLevel;
import website.pages.search.Tab;

import static website.pages.DriverFactory.getChromeDriver;
import static website.pages.DriverFactory.getWebDriverWait;

//Builder Pattern which uses method change and fluent interface also uses method chain

public class SearchPage {

    private SearchActController act;
    private SearchVerifyController verify;

    private SearchPage(SearchActController act, SearchVerifyController verify){
        this.act = act;
        this.verify = verify;
    }

    public SearchActController act(){  // do or step
        return act;
    }

    public SearchVerifyController verify(){  // check
        return verify;
    }

    private SearchPage(){
        // hide it
    }

    // This is static factory method, Have to do all the chanhf=ges here once rather than in several places
    // If DI become complext have to use seperate framework like Spring
    public static SearchPage getSearchPage(){
        return new SearchPage(new SearchActController(), new SearchVerifyController()); // initialise here
    }

//    private WebDriver driver = getChromeDriver();
//    private WebDriverWait wait = getWebDriverWait();
//
//    public SearchPage filterBySkillLevel(SkillLevel value){
//
//        driver.findElement(By.xpath(""))
//                .click();
//
//        By skillFilter = By.xpath("" + value);
//        wait.until(visibilityOfElementsLocatedBy(skillFilter));
//        driver.findElement(skillFilter)
//                .click();
//
//        explicitWait();
//
//        return this;
//    }
//
//    public SearchPage filterByRole(Role role){
//
//        driver.findElement(By.xpath(""))
//        .click();
//         By roleFilter = By.xpath("" + role);
//         wait.until(visibilityOfElementsLocatedBy(roleFilter));
//         driver.findElement(roleFilter)
//                 .click();
//
//         explicitWait();
//
//        return this;
//
//    }
//
//    public SearchPage selectTab(Tab tab){
//
//        driver.findElement(By.xpath("" + tab))
//                .click();
//        return this;
//
//    }
//
//    public void selectCourse(String courseName){
//
//        driver.findElement(By.xpath(" " + courseName))
//                .click();   // Here it goes to different page. So cannot apply builder patter as this action wont stay in the same page
//                            // So return type should be void
//
//    }
//
//    public SearchPage verifyThingOne(){
//        //
//        return this;
//    }
//
//    public SearchPage verifyThingTwo(){
//        //
//        return this;
//    }
}

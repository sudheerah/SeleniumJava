package website;

import org.junit.Test;
import website.pages.CommonVerification;
import website.pages.course.CoursePage;
import website.pages.home.HomePage;
import website.pages.search.SearchPage;
import website.pages.search.Role;
import website.pages.search.SkillLevel;
import website.pages.search.Tab;

import static website.pages.CommonVerification.getCommonVerification;
import static website.pages.course.CoursePage.*;
import static website.pages.home.HomePage.getHomePage;
import static website.pages.search.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {

    HomePage home = getHomePage();  // This is the usage of Static Factory Method
    SearchPage search = getSearchPage();
    CoursePage course = getCoursePage();
    CommonVerification common = getCommonVerification();

    @Test
    public void basicFilterByTest() {
        home.act()
                .search("Java");

        // method chain
        search.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)   // Using enum for better maintainability which has more advantage over readability
                .filterByRole(Role.SOFTWARE_PROFESSIONAL)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");

        search.verify()
                .verifyThingOne()
                .verifyThingTwo();

        course.verifyIsDisplayed(freeTrialButton())
                .verifyIsDisplayed(coursePreviewButton());

        // OR

        common.verifyIsDisplayed(freeTrialButton())
                .verifyIsDisplayed(coursePreviewButton());


    }
}

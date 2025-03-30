package phonebook.tests.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositiveTests() {
        clickOnLoginLink();
        fillRegisterLoginForm(new UserDate().setMail("rita35@gmail.com").setPassword("323Rita323$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSignOutButtonPresent());
      //Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
      //Assert.assertTrue(isAlertDisplayed());

    }



}

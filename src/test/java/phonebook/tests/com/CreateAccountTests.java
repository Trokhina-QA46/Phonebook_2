package phonebook.tests.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test (enabled = false)
   public void newUserRegistrationPositiveTest(){
       // click(By.cssSelector("[href='/login']"));
       //type(By.name("email"), "rita15@gmail.com");
       //type(By.name("password"), "331Rita343$");
       //click on Registration button
       //click(By.name("registration"));
       //Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
       //Assert.assertTrue(isAlertDisplayed());

       clickOnLoginLink();
      fillRegisterLoginForm(new UserDate().setMail("rita303@gmail.com").setPassword("323Rita323$"));
      clickOnRegistrationButton();
      Assert.assertTrue(isSignOutButtonPresent());

   }

}

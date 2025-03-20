package phonebook.tests.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
    @Test
    public void newUserRegistrationPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.name("email"), "rita15@gmail.com");
        //enter password
        type(By.name("password"), "331Rita333$");
        //click on Registration button
        click(By.name("registration"));
        //verify SignOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }


}

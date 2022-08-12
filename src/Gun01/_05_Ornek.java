package Gun01;

/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _05_Ornek extends GenelWebDriver {


    @Test
    void LoginTest(){

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("ebusarigul@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("xjdsmzdq123");

        WebElement loginButton = driver.findElement(By.cssSelector("[value=\"Login\"]"));
        loginButton.click();

        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        Assert.assertTrue(myAccount.isDisplayed());


    }
}

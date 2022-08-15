package Projeler.Proje5;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje5_POM extends ProjeDriver {

    @Test(groups = "valid")
    void senaryo1(){

        Proje5_Elements elements = new Proje5_Elements(driver);
        elements.logginButton.click();
        elements.email.sendKeys("esargl147@gmail.com");
        elements.password.sendKeys("123456");

        wait.until(ExpectedConditions.elementToBeClickable(elements.loginBtn)).click();

        Assert.assertTrue(elements.logOut.isDisplayed());

        elements.logOut.click();
    }

    @Test(groups = "invalid")
    void senaryo2(){

        Proje5_Elements elements1 = new Proje5_Elements(driver);

        elements1.logginButton.click();
        elements1.email.sendKeys("esargl147@gmail.com");
        elements1.password.sendKeys("1234567");

        wait.until(ExpectedConditions.elementToBeClickable(elements1.loginBtn)).click();
        Assert.assertTrue(elements1.invalidMessage.getText().contains("incorrect"));

        elements1.email.clear();
        elements1.email.sendKeys("esargl@gmail.com");
        elements1.password.sendKeys("123456");

        wait.until(ExpectedConditions.elementToBeClickable(elements1.loginBtn)).click();
        Assert.assertTrue(elements1.invalidMessage.getText().contains("No customer"));

    }

    @Test(groups = "shopping")
    void senaryo3(){

        Proje5_Elements elements2 = new Proje5_Elements(driver);

        loginOl();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.laptopAddCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.shoppingCard)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.iAgree)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.checOut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.contunie1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.contunie2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.contunie3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.contunie4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.contunie5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements2.confirm)).click();

        Assert.assertTrue(elements2.result.getText().contains("successfully processed!"));

    }



}

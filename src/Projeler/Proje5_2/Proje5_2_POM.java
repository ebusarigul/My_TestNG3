package Projeler.Proje5_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Proje5_2_POM extends Proje5_2_Driver {


    @Test(groups = "validlogin")
    public void validLoginTest() throws InterruptedException {

        Proje5_2_Elements elements = new Proje5_2_Elements(driver);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(elements.signIn)).click();
        elements.email.sendKeys("esargl147@gmail.com");
        elements.password.sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(elements.signInButton)).click();
        Assert.assertTrue(elements.loginText.getText().contains("Welcome to your account"));
    }

    @Test(dataProvider = "data",groups = "senaryo1")
    public void senaryo1(String birim, int siparisNo) throws InterruptedException {

        loginOl();

        Proje5_2_Elements elements = new Proje5_2_Elements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(elements.contactUs)).click();

        Select select = new Select(elements.birim);
        select.selectByVisibleText(birim);

        Select select1 = new Select(elements.siparisNo);
        select1.selectByIndex(siparisNo);

        Select select2 = new Select(elements.urun);
        select2.selectByValue("1");

        wait.until(ExpectedConditions.elementToBeClickable(elements.message))
                .sendKeys("bu ürün çok guzel");

        wait.until(ExpectedConditions.elementToBeClickable(elements.submitMessage)).click();
        wait.until(ExpectedConditions.visibilityOf(elements.succesMessage));

        Assert.assertTrue(elements.succesMessage.getText().contains("successfully"));

        wait.until(ExpectedConditions.elementToBeClickable(elements.logoutButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.loginButton)).click();
    }

    @Test(groups = "senaryo2")
    public void senaryo2() throws InterruptedException {

        loginOl();

        Proje5_2_Elements elements = new Proje5_2_Elements(driver);
        wait.until(ExpectedConditions.elementToBeClickable(elements.homePage)).click();

        Actions actions = new Actions(driver);
        actions.moveToElement(elements.favUrun).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.addCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.proceed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.proceed2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.proceed3)).click();
        actions.moveToElement(elements.cgv).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(elements.proceed4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.bankwire)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.confirm)).click();

        String siparisNumarasi = elements.siparisNumarasi.getText();
        wait.until(ExpectedConditions.elementToBeClickable(elements.backToOrder)).click();

        boolean bulundu = false;
        for (WebElement u : elements.urunlerListe) {
            if (siparisNumarasi.contains(u.getText())) {
                System.out.println(u.getText());
                System.out.println(siparisNumarasi);
                bulundu = true;
                break;
            }
        }
        Assert.assertTrue(bulundu);

    }

    @DataProvider(name = "data")
    public Object[][] data() {
        Object[][] data = {{"Customer service", 1}, {"Webmaster", 1}};
        return data;
    }

}

package Gun02;


import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.

*/

public class _02_SubscribeTest extends GenelWebDriver {

    By link = By.linkText("Newsletter");
    By cnt = By.cssSelector("[value=\"Continue\"]");
    By yes = By.cssSelector("[name=\"newsletter\"][value='1']");
    By no = By.cssSelector("[name=\"newsletter\"][value='0']");

    @Test(priority = 1)
    public void subsYes(){

        driver.findElement(link).click();

        WebElement subsYes = driver.findElement(yes);
        subsYes.click();

        WebElement continuee = driver.findElement(cnt);
        continuee.click();

        Tools.successMessageValidation();

    }
    @Test(priority = 2)
    public void subsNo(){

        driver.findElement(link).click();

        WebElement subsNo = driver.findElement(no);
        subsNo.click();

        WebElement continuee = driver.findElement(cnt);
        continuee.click();

        Tools.successMessageValidation();

    }

    @Test(priority = 3)
    public void tersIslem(){

        driver.findElement(link).click();

        WebElement yesRadioButton = driver.findElement(yes);
        WebElement noRadioButton = driver.findElement(no);

        if (yesRadioButton.isSelected()){
            noRadioButton.click();
        }else {
            yesRadioButton.click();
        }

        WebElement continuee = driver.findElement(cnt);
        continuee.click();

        Tools.successMessageValidation();

    }




}

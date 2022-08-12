package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_EditAccount extends GenelWebDriver {

    @Test
    public void editAccount(){

        isimSoyisimDegis("Ebubekir","Sari");
        isimSoyisimDegis("ebu","sarigul");

    }

     void isimSoyisimDegis(String isim,String soyisim){
        WebElement editAccount = driver.findElement(By.linkText("Edit Account"));
        editAccount.click();

        WebElement firstName = driver.findElement(By.cssSelector("[name=\"firstname\"]"));
        firstName.clear();
        firstName.sendKeys(isim);

        WebElement lastName = driver.findElement(By.cssSelector("[name=\"lastname\"]"));
        lastName.clear();
        lastName.sendKeys(soyisim);

        WebElement ctn = driver.findElement(By.cssSelector("[value=\"Continue\"]"));
        ctn.click();

         Tools.successMessageValidation();

    }
}

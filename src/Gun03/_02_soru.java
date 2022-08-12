package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;

public class _02_soru extends GenelWebDriver {

    By adresslink= By.linkText("Address Book");
    By firstN = By.id("input-firstname");
    By lastN = By.id("input-lastname");
    By defaultAdressN = By.cssSelector("[name=\"default\"][value=\"0\"]");
    By ctnB = By.cssSelector("[value=\"Continue\"]");

    @Test
    void adressEkle() {

        WebElement adressBook = driver.findElement(adresslink);
        adressBook.click();

        WebElement newAdress = driver.findElement(By.linkText("New Address"));
        newAdress.click();

        WebElement firstName = driver.findElement(firstN);
        firstName.sendKeys("Ebubekir");

        WebElement lastName = driver.findElement(lastN);
        lastName.sendKeys("Sarigul");

        WebElement adress1 = driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("Nilüfer");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("BURSA");

        WebElement postCode = driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("16130");

        WebElement country = driver.findElement(By.id("input-country"));
        Select ulkeMenu = new Select(country);
        ulkeMenu.selectByValue("215");

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        // bu elemanın bayatlamış hali gidene kadar bekle

        WebElement cityy = driver.findElement(By.id("input-zone"));
        Select sehirMenu = new Select(cityy);
        sehirMenu.selectByValue("3335");

        WebElement defaultAdressYN = driver.findElement(defaultAdressN);
        defaultAdressYN.click();

        WebElement ctnButton = driver.findElement(ctnB);
        ctnButton.click();

        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods = {"adressEkle"})
    public void editAdress(){

        WebElement adressBook = driver.findElement(adresslink);
        adressBook.click();

        List<WebElement> adresses = driver.findElements(By.xpath("//a[text()='Edit']"));

        WebElement editButton = adresses.get(adresses.size()-1);
        editButton.click();

        WebElement firstName = driver.findElement(firstN);
        firstName.clear();
        firstName.sendKeys("Ebu");

        WebElement lastName = driver.findElement(lastN);
        lastName.clear();
        lastName.sendKeys("Sari");

        WebElement defaultAdressYN = driver.findElement(defaultAdressN);
        defaultAdressYN.click();

        WebElement ctnButton = driver.findElement(ctnB);
        ctnButton.click();

        Tools.successMessageValidation();


    }

    @Test(dependsOnMethods = {"editAdress"})
    public void lastAdressDelete(){

        WebElement adressBook = driver.findElement(adresslink);
        adressBook.click();

        List<WebElement> adressess = driver.findElements(By.xpath("//a[text()='Delete']"));

        WebElement deleteButton = adressess.get(adressess.size()-1);
        deleteButton.click();

        Tools.successMessageValidation();

    }


}

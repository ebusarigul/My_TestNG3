package Gun02;


import Utils.GenelWebDriver;
import Utils.Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
        Senaryo;
        1- http://opencart.abstracta.us/index.php?route=account/login
        2- Siteyi açınız
        3- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */

public class _01_ValidateMenuTest extends GenelWebDriver {


    @Test
    public void ValidateMenu(){

        By menuListe = By.cssSelector("[class=\"nav navbar-nav\"]>li");
        List<WebElement> menuActualListe = driver.findElements(menuListe);

        List <String> expectedList =new ArrayList<>();

        expectedList.add("Desktops");expectedList.add("Laptops & Notebooks");expectedList.add("Components");
        expectedList.add("Tablets");expectedList.add("Software");expectedList.add("Phones & PDAs");expectedList.add("Cameras");
        expectedList.add("MP3 Players");

        Tools.compareToList(expectedList,menuActualListe);


    }
}

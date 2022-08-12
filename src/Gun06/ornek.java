package Gun06;

import Utils.GenelWebDriver;
import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/

public class ornek extends ParametreliWebDriver {

    @Test
    public void specials(){

        driver.findElement(By.linkText("Specials")).click();

        List<WebElement> allProducts = driver.findElements(By.cssSelector("h4>a"));
        List<WebElement> oldPrice = driver.findElements(By.cssSelector("[class=\"price-old\"]"));
        List<WebElement> newPrice = driver.findElements(By.cssSelector("[class=\"price-new\"]"));

        Assert.assertEquals(oldPrice.size(), allProducts.size());

        for (int i = 0; i < newPrice.size() ; i++) {
            double oldP = Double.parseDouble(oldPrice.get(i).getText().substring(1));
            double newP = Double.parseDouble(newPrice.get(i).getText().substring(1));
            Assert.assertTrue(oldP>newP);
        }
    }


}

package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class soru1 extends MentoringDriver{

    @Test
    public void test1(){

        soru1_Elements elements = new soru1_Elements(driver);

        wait.until(ExpectedConditions.elementToBeClickable(elements.august3)).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".raDiv")));

        wait.until(ExpectedConditions.visibilityOf(elements.result));

        System.out.println(elements.result.getText());

        Assert.assertTrue(elements.result.getText().contains(" August 3"));

    }

}

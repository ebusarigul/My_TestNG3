package Projeler.Proje4;


import Utils.GenelWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class senaryo2 extends GenelWebDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get(("http://www.automationpractice.com"));
        WebElement login = driver.findElement(By.className("login"));

        Thread.sleep(2000);

        login.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("esargl147@gmail.com");
        password.sendKeys("123456");
        loginButton.click();

        Actions actions = new Actions(driver);

        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();

        WebElement product = driver.findElement(By.cssSelector("[class=\"product-container\"]"));
        actions.moveToElement(product).build().perform();

        WebElement addToCard = driver.findElement(By.linkText("Add to cart"));
        addToCard.click();

        WebElement proceedToChecout = driver.findElement(By.xpath("(//div[@class=\"button-container\"]/a)[1]"));
        proceedToChecout.click();

        WebElement pcheck = driver.findElement(By.linkText("Proceed to checkout"));
        pcheck.click();

        WebElement pcheck2 = driver.findElement(By.cssSelector("[name=\"processAddress\"]"));
        pcheck2.click();

        driver.findElement(By.id("cgv")).click();

        driver.findElement(By.cssSelector("[name=\"processCarrier\"]")).click();

        driver.findElement(By.cssSelector("[class=\"payment_module\"]>a[class='bankwire']")).click();

        driver.findElement(By.cssSelector("[class=\"button btn btn-default button-medium\"]")).click();

        WebElement succesMessage = driver.findElement(By.cssSelector("[class=\"cheque-indent\"]>strong"));
        WebElement kututext = driver.findElement(By.cssSelector("[class=\"box\"]"));
        String kutu = kututext.getText();
        //System.out.println(kutu);

        Assert.assertTrue(succesMessage.getText().contains("complete"));

        driver.findElement(By.xpath("(//div[@class=\"header_user_info\"]/a)[1]")).click();

        driver.findElement(By.cssSelector("[class=\"icon-list-ol\"]")).click();

        WebElement orderNumber = driver.findElement(By.xpath("(//a[@class=\"color-myaccount\"])[1]"));
        String order = orderNumber.getText().replaceAll("[^A-Z]", "");
        //System.out.println(orderNumber.getText());

        Assert.assertTrue(kutu.contains(order));
    }
}

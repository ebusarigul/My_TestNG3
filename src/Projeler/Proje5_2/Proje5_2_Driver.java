package Projeler.Proje5_2;

import Projeler.Proje5.Proje5_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proje5_2_Driver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void Baslangicİslemleri(){


        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        Duration dr= Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(dr); // bütün webElement için geçerli

        driver.get("http://automationpractice.com/index.php?");

    }

    @AfterClass(alwaysRun = true)
    public void Bitisİslemleri(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void loginOl() throws InterruptedException {

        Proje5_2_Elements elements = new Proje5_2_Elements(driver);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(elements.signIn)).click();
        elements.email.sendKeys("esargl147@gmail.com");
        elements.password.sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(elements.signInButton)).click();

    }

}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


public class TestGoogle {

    ChromeOptions options = new ChromeOptions();

    private WebDriver driver;
    Duration duration = Duration.ofSeconds(5);

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    }
    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void test() {
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options);
        WebDriverWait driverWait = new WebDriverWait(driver, 10);
        WebDriverWait driverWait1 = new WebDriverWait(driver, 5);
        driver.get("https://stackoverflow.com/users/signup?ssrc=head&returnurl=%2fusers%2fstory%2fcurrent%27");
        driver.findElement(By.xpath("//div[@id='openid-buttons']//button[1]")).click();
        driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("optic969@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("totenkopf");
        driver.findElement(By.id("passwordNext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://mail.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElements(By.xpath("//*[@role='checkbox']")).get(1).click();
        driver.findElements(By.xpath(" //div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']//div[@class='asa']")).get(0).click();
        driver.findElements(By.xpath("//*[@id=\":k6\"]")).get(0).click();
        driver.findElements(By.xpath("//div[@class='TN bzz aHS-bnv']")).get(0).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            driverWait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\":ln\"]/div[1]/span")));
            driver.findElement(By.xpath("//*[@id=\":ln\"]/div[1]/span")).click();
            driver.findElement(By.xpath("//*[@id=\":4\"]/div[2]/div[1]/div[1]/div/div/div[2]/div/div")).click();
        }catch (Exception exception){
            System.out.println("The spam directory is empty");
        }finally {
            driver.findElement(By.xpath("//a[@class='gb_D gb_Ra gb_i']")).click();
            driver.findElement(By.xpath("//a[@id='gb_71']")).click();
        }







        //driver.findElement(By.xpath("//td[@class='TC']")).getText().equalsIgnoreCase("Ура, спама нет!");
        
        /*if(driver.findElement(By.xpath("//td[@class='TC']")).getText().equalsIgnoreCase("Ура, спама нет!")){
            System.out.println("The spam directory is empty");
        }else{
            driver.findElement(By.xpath("//span[@class='T-Jo J-J5-Ji T-Jo-auq T-Jo-Jp']")).click();
            driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aFi T-I-ax7 mA']//div[@class='Bn']")).click();
        }


        // String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
        //driver.findElement(By.linkText("https://mail.google.com/")).sendKeys(selectLinkOpeninNewTab);
        //driver.get("https://mail.google.com/");
        //driver.get("https://www.google.com/intl/ru/gmail/about/#");
        /*driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']"))).sendKeys("optic969@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("gashu");
        driver.findElement(By.id("passwordNext")).click();
        /*driver.findElement(By.id("identifierId")).sendKeys("optic969@gmail.com",Keys.ENTER);
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, 5);

        WebElement element = wait.until(

                ExpectedConditions.visibilityOfElementLocated(By.id("password")));

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("your password");
        //driver.findElement(By.xpath("//div[4]//ul[1]//li[2]//a[1]")).click(); //sendKeys("optic969@gmail.com");
        //WebElement foo = new WebDriverWait(driver, duration.getSeconds()).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe vHVGub zKHdkd sdJrJc Tyc9J']//input[@class='whsOnd zHQkBf']")));
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#identifierId")).sendKeys("optic969@gmail.com");
        /*driver.findElement(By.xpath("//div[@name='identifier']")).sendKeys("optic969@gmail.com");
        driver.findElement(By.xpath("span[@class='CwaK9']")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("totenkopf");
        driver.findElement(By.xpath("//div[@id='passwordNext']")).click();*/
    }
}

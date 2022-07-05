package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MyTest {


        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://the-internet.herokuapp.com/");

            /// Assertion
            Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("The Internet");
            assertTrue(verifyTitle);
            System.out.println("This is my first assertion  :" + verifyTitle);
            //////////////

          // TO verify the element is avaialbel or not on the webpage
            if( driver.findElement(By.xpath("//h1[@class='heading']")).isDisplayed()){

                System.out.println("Element is Visible");

            }else{

                System.out.println("Element is InVisible");
            }



            if( driver.findElement(By.xpath("//h1[@class='heading']")).isEnabled()){

                System.out.println("Element is Enabled");

            }else{

                System.out.println("Element is Disabled");
            }
            driver.findElement(By.xpath("//*[contains(text(),'A/B Testing')]")).click();

            // for next tab
            String oldTab = driver.getWindowHandle();
            driver.findElement(By.xpath("//*[contains(text(),'Elemental Selenium')]")).click();
            ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
            newTab.remove(oldTab);
            driver.switchTo().window(newTab.get(0));

            String oldTab1 = driver.getWindowHandle();
            driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs')]")).click();
            ArrayList<String> newTab1 = new ArrayList<String>(driver.getWindowHandles());
            newTab.remove(oldTab);
            driver.switchTo().window(newTab1.get(2));


            driver.manage().window().maximize();

            if( driver.findElement(By.xpath("//a[@class='link has-text-white']")).isEnabled()){

                System.out.println("Sign-In is Enabled");

            }else{

                System.out.println("Sign-in is Disabled");
            }

            driver.findElement(By.xpath("//a[@class='link has-text-white']")).click();
            driver.findElement(By.id("idToken1")).sendKeys("Mubeen Akhtar");


            // To verify the tooltip
//            WebElement n = driver.findElement(By.id("idToken1"));
//            //obtain title attribute
//            String s = n.getAttribute("title");
//            //verify tooltip text
//
//            if(s.equals("Please provide a value")) {
//                System.out.println("Tooltip text matched");
//            }else{
//                System.out.println("Tooltip text not matched");
//            }

        driver.findElement(By.id("idToken1")).sendKeys("Mubeen Akhtar");
        driver.findElement(By.id("idToken2")).sendKeys("123");
        driver.findElement(By.id("loginButton_0")).click();

            driver.findElement(By.id("//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']")).click();


            //driver.quit();

        }
    }



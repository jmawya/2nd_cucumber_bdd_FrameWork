import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Macys {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.macys.com/shop/featured/tommy-shoes");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"resultsFoundMessage\"]")).getText());
        int a=6;
        int b=0;
        if(a==b){
            System.out.println("Tommy Shoes number is zero");
        }
        else {
            System.out.println("Tommy Shoes number is more then zero");
        }

        driver.quit();
    }
}

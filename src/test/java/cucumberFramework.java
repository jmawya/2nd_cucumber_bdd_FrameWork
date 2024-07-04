import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cucumberFramework {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();

        driver.get("https://qa.taltektc.com/signup.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstName")).sendKeys("Jannatul");
        driver.findElement(By.name("lastName")).sendKeys("Mawya");
        driver.findElement(By.name("email")).sendKeys("jmakldjf@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Abdc123456789");
        driver.findElement(By.name("confirmPassword")).sendKeys("Abdc123456789");
       WebElement list= driver.findElement(By.name("month"));
        Select sk=new Select(list);
        sk.selectByValue("02");
        WebElement list1=driver.findElement(By.name("day"));
        Select ls=new Select(list1);
        ls.selectByValue("13");

        WebElement list2 =driver.findElement(By.name("year"));
        Select et = new Select(list2);
        et.selectByValue("2002");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();

    }
}

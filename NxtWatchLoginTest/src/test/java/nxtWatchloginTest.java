import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
public class nxtWatchloginTest {
    public static void main(String[] args){
        //System.setProperty("webdriver.chrome.driver" , "C:\\Users\\BHAVANA\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanxtwatch.ccbp.tech/login");
        // entering the name in the username field
        WebElement usernameEl = driver.findElement(By.id("userNameInput"));
        usernameEl.sendKeys("rahul");
        // entering the password in the password field
        WebElement passwordEl = driver.findElement(By.id("passwordInput"));
        passwordEl.sendKeys("rahul@2021");
        // submitting the form
        WebElement loginBtnEl = driver.findElement(By.id("loginButton"));
        loginBtnEl.click();
        String expectedUrl = "https://qanxtwatch.ccbp.tech/";
        // wait for the page redirected
        WebDriverWait wait = new WebDriverWait(driver ,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.equals(expectedUrl)){
            System.out.println("Logged in successfully");
        }
        //Printing current page title
        String currentPageTitle = driver.getTitle();
        System.out.println(currentPageTitle);
        // clicking on the logout button
        WebElement logoutBtnEl = driver.findElement(By.id("logoutButton"));
        logoutBtnEl.click();
        // Click the "Confirm" button element - use id locator.
        WebElement confirmBtnEl = driver.findElement(By.id("desktopConfirmButton"));
        confirmBtnEl.click();
        // expected url
        String logoutPageUrl = "https://qanxtwatch.ccbp.tech/login";
        wait.until(ExpectedConditions.urlToBe(logoutPageUrl));
        String currentUrl1 = driver.getCurrentUrl();
        if(currentUrl1.equals(logoutPageUrl)){
            System.out.println("Logged out successfully");
        }
        // Print current page title in a new line.
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
    }
}

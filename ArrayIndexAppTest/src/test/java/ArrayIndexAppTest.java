import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ArrayIndexAppTest {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Navigate to the url https://qanumberindex.ccbp.tech/
        driver.get("https://qanumberindex.ccbp.tech/");
        //Find the <p> element whose class attribute value contains
        WebElement pEl = driver.findElement(By.xpath("/html/body/div/div/div[1]/p"));
        String expectedText = pEl.getText();
        //System.out.println(pEl.getText());
        // Verify whether the text matches the below text.
        String actualText = "[ 17, 31, 77, 20, 63 ]";
        if(actualText.equals(expectedText)){
            System.out.println("Default Array Matched");
        }
        else{
            System.out.println("Mismatch in Default Array");
        }
        //Test the index of the number 48
        //Enter the text 48 in the input field whose class attribute value contains
        WebElement enterEl = driver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
        enterEl.sendKeys("48");
        //Click the "Find" button whose id attribute value contains
        WebElement findBtn = driver.findElement(By.xpath("/html/body/div/div/div[2]/button"));
        findBtn.click();
        //Find the <span> element whose class attribute value contains number
        WebElement spanEl = driver.findElement(By.xpath("/html/body/div/div/div[3]"));
        String spanText = spanEl.getText();
        //System.out.println(spanText);
        String actualSpanText = "-1";
        //Verify whether the text matches the below text.
        if(actualSpanText.equals(spanText)){
            System.out.println("Index matched for the number 48");
        }
        else{
            System.out.println("Index mismatched for the number 48");
        }
        //Clear the input field.
        enterEl.clear();
        //Test the index of the number 17
        //Enter the text 17 in the input field.
        enterEl.sendKeys("17");
        //Click the "Find" button.
        findBtn.click();
        //Get the text and verify whether the text matches the below text.
        //text: 0
        String spanText1 = spanEl.getText();
        String actualSpanText1 = "0";
        //if text matches the expected text, print "Index matched for the number 17".
        //else, print "Index mismatched for the number 17".
        if(actualSpanText1.equals(spanText1)){
            System.out.println("Index matched for the number 17");
        }
        else{
            System.out.println("Index mismatched for the number 17");
        }
        //Clear the input field.
        enterEl.clear();
        //Test the index of the number 77
        //Enter the text 77 in the input field.
        enterEl.sendKeys("77");
        //Click the "Find" button.
        findBtn.click();
        //Get the text and verify whether the text matches the below text.
        //text: 2
        String spanText2 = spanEl.getText();
        String actualSpanText2 = "2";
        //if text matches the expected text, print "Index matched for the number 77".
        //else, print "Index mismatched for the number 17".
        if(actualSpanText2.equals(spanText2)){
            System.out.println("Index matched for the number 77");
        }
        else{
            System.out.println("Index mismatched for the number 77");
        }
        //Clear the input field.
        enterEl.clear();
        //Test the index of the number 63
        //Enter the text 63 in the input field.
        enterEl.sendKeys("63");
        //Click the "Find" button.
        findBtn.click();
        //Get the text and verify whether the text matches the below text.
        //text: 4
        String spanText3 = spanEl.getText();
        String actualSpanText3 = "4";
        //if text matches the expected text, print "Index matched for the number 77".
        //else, print "Index mismatched for the number 17".
        if(actualSpanText3.equals(spanText3)){
            System.out.println("Index matched for the number 63");
        }
        else{
            System.out.println("Index mismatched for the number 63");
        }
        //Close the browser window.
        driver.quit();
    }
}

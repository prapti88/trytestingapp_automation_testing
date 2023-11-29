package package1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class trytestingapp1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // initialization
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://trytestingthis.netlify.app/");
        driver.manage().window();
        
        //select first name 
        driver.findElement(By.id("fname")).sendKeys("Prapti");
        
        //select last name 
        driver.findElement(By.id("lname")).sendKeys("Saha");
        
        //select gender
        WebElement radiobutton = driver.findElement(By.id("female"));
        radiobutton.click();
        
        assert radiobutton.isSelected();
        
        System.out.println(radiobutton.isSelected());
        
        //Drop Down
        WebElement testDropDown = driver.findElement(By.id("option"));
        Select dorpdown = new Select(testDropDown);
        
        //way1
        dorpdown.selectByIndex(3);
        
        //way2
        //dorpdown.selectByValue("option 3");
        
        //way3
        //dorpdown.selectByVisibleText("Option 1");
        
		//checklist
        
		WebElement checklist = driver.findElement(By.name("option3"));  
		checklist.click();
        
		//submit button click
        WebElement submitbutton = driver.findElement(By.xpath("//Button[normalize-space()='Submit']"));
        submitbutton.click(); 
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClasses;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

/**
 *
 * @author raojha
 */
public class DBConnectionIT {
    
    @Test
    public void testSimple() throws Exception {
// Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new HtmlUnitDriver();
        
        driver.get("http://54.255.142.60:8080/PhoenixConsultingv2/index.jsp");

        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        //(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
          //  @Override
            //public Boolean apply(WebDriver d) {
              //  return d.getTitle().contains("NetBeans");
            //}
            
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.equalsIgnoreCase("Home Page - Phoenix"));
        
        WebElement element = driver.findElement(By.name("submit"));
        element.click();
        
        actualTitle = driver.getTitle();
        assertTrue(actualTitle.equalsIgnoreCase("Phoenix Consulting - Details"));
        
        element = driver.findElement(By.name("back"));
        element.click();
        
        actualTitle = driver.getTitle();
        assertTrue(actualTitle.equalsIgnoreCase("Home Page - Phoenix"));
        //Close the browser  
        driver.quit();
        } 
}

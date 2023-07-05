package org.firstprogramselenium;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium_testing\\Driver\\chromedriver.exe");
	WebDriver button=new ChromeDriver();
          button.get("https://www.leafground.com/button.xhtml");
          button.manage().window().maximize();
          WebElement disabled = button.findElement(By.xpath("//div[@class='card']"));
          boolean enabled = disabled.isEnabled();
          System.out.println(enabled);
          
          WebElement position = button.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
          Point location = position.getLocation();
          int x = location.getX();
          int y = location.getX();
          System.out.println("location of x"+x);
          System.out.println("location of y"+y);
          
          WebElement colour = button.findElement(By.id("j_idt88:j_idt96"));
          String cssValue = colour.getCssValue("background");
          System.out.println("background clour-"+cssValue);
          
          WebElement HW = button.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
          int height = HW.getSize().getHeight();
          int width = HW.getSize().getWidth();    
          System.out.println("button height"+height);
          System.out.println("button width"+width);
          
         WebElement clrchange = button.findElement(By.id("j_idt88:j_idt100"));
         String cssValue2 = clrchange.getCssValue("background-color");
         System.out.println("background colour before mouse button:-"+cssValue2);
         Actions mouseover=new Actions(button);
         mouseover.clickAndHold(clrchange);
         String cssValue3 = clrchange.getCssValue("background-color");
         System.out.println("background colour after mouse over:-"+cssValue3);
         
          
          
          
          
          
          
          
} 
}

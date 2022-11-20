package com.my.stuff.main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  WebDriver driver;
  @FindBy(linkText="Dropdown")
  private WebElement linkDropDwon;

  public HomePage(WebDriver driver){
      this.driver=driver;
      PageFactory.initElements(driver,this);
  }
    public void typeEmailId(String Id){
//       emailID.sendKeys(Id);
    }
    public void ClickLinkDropDown(){
        linkDropDwon.click();
    }

    public void fnClick(String sLinkText){
      driver.findElement(By.linkText(sLinkText)).click();
    }

}

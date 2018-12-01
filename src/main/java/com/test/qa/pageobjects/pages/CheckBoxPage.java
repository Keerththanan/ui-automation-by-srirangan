package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * CheckBoxPage.java - class to verify CheckBox Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class CheckBoxPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(CheckBoxPage.class);
    private static By headerCheckBoxPage = By.xpath("//h3");
    private static By checkBox1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private static By checkBox2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");


    public static boolean isCheckBoxPageDisplayed() {
        return getDriver().findElement(headerCheckBoxPage).isDisplayed();
    }

    public static boolean isCheckBox1Available() {
        return getDriver().findElement(checkBox1).isDisplayed();
    }

    public static boolean isCheckBox1Selected() {
        return getDriver().findElement(checkBox1).isSelected();
    }

    public static boolean isCheckBox2Available() {
        return getDriver().findElement(checkBox2).isDisplayed();
    }

    public static boolean isCheckBox2Selected() {
        return getDriver().findElement(checkBox2).isSelected();
    }

    public static void slectCheckbox1(){
        if(!getDriver().findElement(checkBox1).isSelected()){
            getDriver().findElement(checkBox1).click();
        }
    }



    public static void waitTillHeaderLoad() {
        waiTillVisible(headerCheckBoxPage, 2);
    }

}

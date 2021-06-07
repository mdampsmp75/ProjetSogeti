package StandardsMethodes;

import net.bytebuddy.implementation.bind.annotation.This;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUntil {

   static WebDriver driver;

    public void waitUntil()  {}   // constructeur vide

    public static void expliciteWaitToBeClickable(By element, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void visibilityOfElementLocated (By selector, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    }
}

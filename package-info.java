package com.ffc.tests;

import com.ffc.base.BaseTest;
import com.ffc.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PunchInTest extends BaseTest {

    @Test
    public void verifyPunchInToast() {
        new LoginPage(driver).login("admin@gmail.com", "admin123");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement punchInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Punch In')]")));
        punchInBtn.click();

        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Toastify__toast-body")));
        String toastMsg = toast.getText();
        System.out.println("Toast: " + toastMsg);
        Assert.assertTrue(toastMsg.toLowerCase().contains("punch in"), "Punch In toast not visible.");
    }
}

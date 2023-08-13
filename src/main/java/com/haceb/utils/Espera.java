package com.haceb.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Espera {

    // Validaciones para los diferentes tipos de espera

    public WebElement esperaVisibilidad(WebDriver driver, By elemento){
        Duration tiempoEspera = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, tiempoEspera);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        return element;
    }

}

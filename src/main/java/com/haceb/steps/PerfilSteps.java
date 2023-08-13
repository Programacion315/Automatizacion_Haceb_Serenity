package com.haceb.steps;

import com.haceb.pageObject.PerfilPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PerfilSteps {

    PerfilPage perfilPage = new PerfilPage();


    @Step("Validacion de usuario registrado")
    public void validacionUsuario(){
        perfilPage.cambioAVentanaEmergente();
        WebDriverWait wait = new WebDriverWait(perfilPage.getDriver(), Duration.ofSeconds(20));
        WebElement registroExitioso = wait.until(ExpectedConditions.visibilityOfElementLocated(perfilPage.getLblPerfil()));
        System.out.println("Nombre: " + perfilPage.getLblPerfil());
        Assert.assertTrue(registroExitioso.isDisplayed());

    }

}

package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.Set;

public class PerfilPage extends PageObject {

    By lblPerfil = By.xpath("//input[@placeholder='Nombre *']");


    public By getLblPerfil() {
        return lblPerfil;
    }
    public void cambioAVentanaEmergente(){

        Set<String> ventanas = getDriver().getWindowHandles();
        for (String ventana : ventanas) {
            if(!ventanas.equals(ventana)){
                getDriver().switchTo().window(ventana);
                break;
            }

        }
    }
}

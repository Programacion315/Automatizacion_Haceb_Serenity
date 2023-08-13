package com.haceb.stepDefinitions;


import com.haceb.steps.PerfilSteps;
import com.haceb.steps.RegistroSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;



public class RegistoStepDefinition {

    @Steps
    RegistroSteps registroSteps;

    @Steps
    PerfilSteps perfilSteps;



    @Dado("que el usuario ingresa a haceb y le da en la opcion de registrarse")
    public void queElUsuarioIngresaAHacebYLeDaEnLaOpcionDeRegistrarse() throws Exception {
        registroSteps.abrirNavegador();
        registroSteps.entrarPerfil();


    }
    @Cuando("el usuario llena el formulario de registro")
    public void elUsuarioLlenaElFormularioDeRegistro() throws Exception {
        registroSteps.clickRegisrtro();
        registroSteps.clickBotonRegistrarse();
        registroSteps.registrarCorreo();
        registroSteps.registrarNombre();
        registroSteps.registrarApellido();
        registroSteps.registrarContrasenia();
        registroSteps.registrarComfirContrasenia();
        registroSteps.clickCheckbox();
        registroSteps.registrarCheckBoxAutorizo();
        registroSteps.registrarOprimeBotonRegistrarme();
        registroSteps.registrarCedula();
        registroSteps.registarGenero();
        registroSteps.registrarFecha();
        registroSteps.registrarCodigo();
        registroSteps.registrarNumeroDeContacto();
        registroSteps.registarDepartamento();
        registroSteps.registarCiudad();
        registroSteps.registarBotonEnviar();

    }

    @Entonces("el usuario visualiza informacion de su perfil.")
    public void elUsuarioVisualizaInformacionDeSuPerfil() {

        perfilSteps.validacionUsuario();
    }
}

package com.clinica.glue.login;

import com.clinica.step.login.LoginStep;
import io.cucumber.java.es.*;

public class LoginStepDefinition {

    private LoginStep loginStep = new LoginStep();

    @Dado("que abro la pagina de Login de la clinica")
    public void abrirPagina() {
        loginStep.abrirPaginaLogin();
    }

    @Cuando("selecciono el tipo de documento como DNI")
    public void seleccionarDni() {
        loginStep.seleccionarDni();
    }

    @Y("ingreso mi numero de documento {string}")
    public void ingresoDni(String dni) {
        loginStep.escribirDni(dni);
    }

    @E("ingreso mi contrasenia {string}")
    public void ingresoPassword(String pass) {
        loginStep.ingresoMiPassword(pass);
    }

    @Y("presiono el boton Iniciar Sesion")
    public void iniciarSesion() {
        loginStep.clickIniciarSesion();
    }

    @Entonces("debe de redireccionarme a la pagina principal del Portal del Paciente")
    public void verificarRedireccion() {
        loginStep.verificarRedireccion();
    }
}
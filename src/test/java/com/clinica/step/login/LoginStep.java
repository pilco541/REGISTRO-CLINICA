package com.clinica.step.login;

import com.clinica.hooks.Hooks;
import com.clinica.page.login.loginPage;

public class LoginStep {

    private loginPage loginPage;

    public LoginStep() {
        this.loginPage = new loginPage(Hooks.driver);
    }

    public void abrirPaginaLogin() {
        loginPage.navegarALogin();
    }

    public void seleccionarDni() {
        loginPage.seleccionarDni();
    }

    public void escribirDni(String dni) {
        loginPage.escribirDni(dni);
    }

    public void ingresoMiPassword(String password) {
        loginPage.escribirContrasenia(password);
    }

    public void clickIniciarSesion() {
        loginPage.seleccionarIniciarSesion();
    }

    public void verificarRedireccion(){
        loginPage.validarRedireccion();
    }
}
package com.clinica.step.editarPerfil;

import com.clinica.hooks.Hooks;
import com.clinica.page.editarPerfil.editarPerfilPage;

public class editarPerfilStep {
    private editarPerfilPage editarPerfilPage;

    public editarPerfilStep() {
        this.editarPerfilPage = new editarPerfilPage(Hooks.driver);
    }

    public void validarTextoBienvenida(){
        editarPerfilPage.validarTextoBienvenida();
    }
    public void seleccionarMenuLateral() {
        editarPerfilPage.seleccionarMenuLateral();
    }
    public void seleccionarBtnEditar(){
        editarPerfilPage.seleccionarBtnEditar();
    }

    public void validarTituloEditarPerfil(String titulo) {
        editarPerfilPage.validarTituloEditarPerfil(titulo);
    }

    public void seleccionarBotonLapiz()
    {
        editarPerfilPage.seleccionarBotonLapiz();
    }

    public void modificarDirección(String nuevaDireccion) {
        editarPerfilPage.modificarDireccion(nuevaDireccion);
    }

    public void guardarCambios() {
        editarPerfilPage.guardarCambios();
    }

    public void validarCambios(){
        editarPerfilPage.validarCambios();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario
 */
import Presentacion.menuAplicacion;
import logicaProvedor.*;
import logicaApoyo.*;
public class Modelo {
    //gestor apoyo  
    logicaApoyo.componenteApoyo gestorApoyo= new logicaApoyo.gestorApoyo();
    //gestor de menu
    ComponenteGestorProvedores gestorProvedores= new logicaProvedor.Menus();
    //interfazGrafica
    menuAplicacion vista;
    
    public void iniciar() {
        getVista();
    }

    public String verMenu() {
        return this.gestorProvedores.verMenu();
    }
    public boolean AgregarSemanario(String[] semanario) {
        return this.gestorProvedores.agregarMenu(semanario[0], semanario[1], semanario[2], semanario[3], semanario[4]);
    }
    private menuAplicacion getVista() {
        if(this.vista==null){
           vista= new menuAplicacion(this);
        }
        return vista;
    }

    public String verMenu(int nSemana) {
      return this.gestorProvedores.verMenu(nSemana);
    }

    public void inscribir() {
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaProvedor;

/**
 *
 * @author Usuario
 */
public interface ComponenteGestorProvedores {
    public String verMenu();//retorna el menu de la ultima semana
    public String verMenu(int semana);//retorna el menu de la ultima semana ingresada
    public boolean agregarMenu(String lunes,String martes,String miercoles,String jueves,String viernes);//agrega un menu a la lista de horarios

}

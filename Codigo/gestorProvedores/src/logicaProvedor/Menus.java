package logicaProvedor;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.Stack;
public class Menus implements ComponenteGestorProvedores{
    private Stack<MenuSemanal> menuSemestral;

    public Menus(){
        menuSemestral= new Stack<MenuSemanal>();
    }
    @Override
    public String verMenu(int semana){
        if (menuSemestral.size()>semana){
            return "Aun no hay registro para esta semana";
        }
        return "El menu de la semana " + semana + " es " + menuSemestral.get(semana).GetHorariomenu();
    }
    @Override
    public String verMenu() {
        if(menuSemestral.size()>0){
            return "El menu de la semana " + menuSemestral.size() + " es " + menuSemestral.peek().GetHorariomenu();    
        }
        return "no hay menu";       
    }
    @Override
    public boolean agregarMenu(String lunes,String martes,String miercoles,String jueves,String viernes) {
        MenuSemanal horarioSemanal= new MenuSemanal(lunes,martes,miercoles,jueves,viernes);//se crea el horario
        this.menuSemestral.push(horarioSemanal);//se ingresa el horario al semanario
        if (this.menuSemestral.peek()==horarioSemanal){
            return true;
        }
        return false;
    }
    
            
    
}

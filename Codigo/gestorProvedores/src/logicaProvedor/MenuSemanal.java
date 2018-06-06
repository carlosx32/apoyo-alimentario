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
class MenuSemanal {
    private String[] menuDia;
    public MenuSemanal(String lunes,String martes,String miercoles,String jueves,String viernes){
        this.menuDia=new String[5];
        menuDia[0]=lunes;
        menuDia[1]=martes;
        menuDia[2]=miercoles;
        menuDia[3]=jueves;
        menuDia[4]=viernes;        
    } 
    public String GetHorariomenu(){
        String retorno ="";
        retorno+="Lunes: "+menuDia[0];
        retorno+="martes: "+menuDia[1];
        retorno+="miercoles: "+menuDia[2];
        retorno+="jueves: "+menuDia[3];
        retorno+="viernes: "+menuDia[4];
        return retorno;
    }
}

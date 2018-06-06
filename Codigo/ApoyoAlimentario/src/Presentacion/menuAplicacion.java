/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JOptionPane;
import logica.Modelo;

/**
 *
 * @author Usuario
 */
public class menuAplicacion {

    Modelo model;

    public menuAplicacion(Modelo athis) {
        model = athis;
        this.MenuPrincipal();
    }

    ;

    public Modelo getModel() {
        return model;
    }

    public void MenuPrincipal() {
        int cont = 2;
        do {
            String[] opcionesMenu = {"Provedor ", "Estudiante ", "Bienestar"};
            int opcMenu = JOptionPane.showOptionDialog(null, "seleccione su rol", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, 0);
            switch (opcMenu) {
                case 0:
                    this.menuProvedor();
                    break;
                case 1:
                    this.menuEstudiante();
                    break;
                case 2:
                    this.menuBienestar();
                    break;
                default:
                    break;
            }
            cont = (JOptionPane.showConfirmDialog(null, "Desea continuar"));
        } while (cont == 0);
    }
    public void menuBienestar() {
            String[] opcionesMenu = {"bienestar1 ", "bienestar2 ", "salir"};
            int opcMenu = JOptionPane.showOptionDialog(null, "servicio a utilizar", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, 0);
            switch (opcMenu) {
                default:
                    break;
            }
    }
    public void menuProvedor() {
        int cont = 2;
        String[] opcionesMenu = {"ver Menu ", "ver Menu, semana especifica ", "agregarMenuSemana", "salir"};
        int opcMenu = JOptionPane.showOptionDialog(null, "servicio a utilizar", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, 0);
        int nSemana=0;
        switch (opcMenu) {
            case 0://ver menu
                JOptionPane.showMessageDialog(null, this.getModel().verMenu());
                break;
            case 1://ver menu
                nSemana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la semana"));
                JOptionPane.showMessageDialog(null, this.getModel().verMenu(nSemana));
                break;
            case 2://ver menu
                String[] semanario = new String[5];
                semanario[0] = JOptionPane.showInputDialog("Platos para el dia lunes: ");
                semanario[1] = JOptionPane.showInputDialog("Platos para el dia martes: ");
                semanario[2] = JOptionPane.showInputDialog("Platos para el dia miercoles: ");
                semanario[3] = JOptionPane.showInputDialog("Platos para el dia jueves: ");
                semanario[4] = JOptionPane.showInputDialog("Platos para el dia viernes: ");
                if(getModel().AgregarSemanario(semanario)){
                    JOptionPane.showMessageDialog(null, "semana registrada");
                }else{
                    JOptionPane.showMessageDialog(null, "semana no registrada");
                }
                break;

            default:
                break;
        }
    }

    public void menuEstudiante() {
        int cont = 2;
            String[] opcionesMenu = {"verMenu", "Inscribir papeles ", "salir"};
            int opcMenu = JOptionPane.showOptionDialog(null, "servicio a utilizar", "estudiante", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu, 0);
            switch (opcMenu) {
                case 0:
                    JOptionPane.showMessageDialog(null, "El menu es: " + this.getModel().verMenu());
                    break;
                case 1:
                    
                    JOptionPane.showMessageDialog(null,"Incribir papeles");
                    this.getModel().inscribir();
                    
                    break;
                    default:
                        break;
            }
 
    }
}

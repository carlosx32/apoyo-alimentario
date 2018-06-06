/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaApoyo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface componenteApoyo {
    public void InscribirPapeles(String codigo, String nombre1, String nombre2, String apellido1, String apellido2, float ingresosfamiliares, boolean condiciones_sostieneElHogar, boolean condiciones_seSostieneASiMismo, boolean condiciones_viveFueraDelNuecleFamiliar, boolean condiciones_TieneHijoOConyuge, boolean vivienda_CasaEmpleados, boolean vivienda_Desplazamiento, boolean vivienda_zonasVulnerables, boolean salud_discapacidad, boolean salud_patologias, int salario);
    public ArrayList<beneficiario> admitidos();
    public ArrayList<ArrayList<estudiante>> Clasificar(int Porcentajetipoa, int Porcentajetipob);   
}

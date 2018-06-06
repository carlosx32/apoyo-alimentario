/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaApoyo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class gestorApoyo implements componenteApoyo {
    ArrayList<inscrito> inscritos;
    ArrayList<estudiante> tipoa;
    ArrayList<estudiante> tipob;
    ArrayList<estudiante> tipoc;
    ArrayList<beneficiario> beneficiarios;
    
    
    @Override
    public void InscribirPapeles(String codigo, String nombre1, String nombre2, String apellido1, String apellido2, float ingresosfamiliares, boolean condiciones_sostieneElHogar, boolean condiciones_seSostieneASiMismo, boolean condiciones_viveFueraDelNuecleFamiliar, boolean condiciones_TieneHijoOConyuge, boolean vivienda_CasaEmpleados, boolean vivienda_Desplazamiento, boolean vivienda_zonasVulnerables, boolean salud_discapacidad, boolean salud_patologias, int salario) {
        inscrito auxEst= new inscrito(codigo,nombre1,nombre2,apellido1,apellido2,ingresosfamiliares,condiciones_sostieneElHogar,condiciones_seSostieneASiMismo, condiciones_viveFueraDelNuecleFamiliar,  condiciones_TieneHijoOConyuge, vivienda_CasaEmpleados, vivienda_Desplazamiento,  vivienda_zonasVulnerables, salud_discapacidad, salud_patologias,  salario);
        
    }

    @Override
    public ArrayList<beneficiario> admitidos() {
        return  beneficiarios;
    }

    @Override
    public ArrayList Clasificar(int procentajetipoa, int procentajetipob) {
        int totalIns=this.inscritos.size();
        int totalTipoA= procentajetipoa*totalIns;
        int totalTipoB= procentajetipob*totalIns;        
        int totalTipoC= totalIns-totalTipoA-totalTipoB;

        //ordenamos la lista de inscritos
        Collections.sort(this.inscritos, new Comparator<inscrito>(){
            @Override
            public int compare(inscrito o1, inscrito o2) {
                int indice1 = o1.getIndiceApoyo();
                int indice2 = o2.getIndiceApoyo();
                return new Integer(indice1).compareTo(indice2);
            }
        });
        int asignados=0;
        for (inscrito inscrito1 : inscritos) {
            if(asignados<=totalTipoA){
                tipoa.add(inscrito1);
            }else if(asignados<=totalTipoA+totalTipoB){
                tipob.add(inscrito1);
            }else{
                tipoc.add(inscrito1);    
            }
        }
        
        ArrayList<ArrayList<estudiante>> aux= new ArrayList<>();
        aux.add(tipoa);
        aux.add(tipob);
        aux.add(tipoc);
        return aux;
    }
    
    
}

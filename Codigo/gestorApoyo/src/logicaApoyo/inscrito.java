/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaApoyo;

/**
 *
 * @author Usuario
 */
class inscrito extends estudiante {
    private float ingresosfamiliares;
    private boolean condiciones_sostieneElHogar;
    private boolean condiciones_seSostieneASiMismo;
    private boolean condiciones_viveFueraDelNuecleFamiliar;
    private boolean condiciones_TieneHijoOConyuge;
    private boolean vivienda_CasaEmpleados;
    private boolean vivienda_Desplazamiento;
    private boolean vivienda_zonasVulnerables;
    private boolean salud_discapacidad;
    private boolean salud_patologias;
    private int salario;
    private int indiceApoyo;

    public inscrito(String codigo, String nombre1, String nombre2, String apellido1, String apellido2) {
        super(codigo, nombre1, nombre2, apellido1, apellido2);
        this.indiceApoyo=this.calcularIndice();
    }

    public inscrito(String codigo, String nombre1, String nombre2, String apellido1, String apellido2, float ingresosfamiliares, boolean condiciones_sostieneElHogar, boolean condiciones_seSostieneASiMismo, boolean condiciones_viveFueraDelNuecleFamiliar, boolean condiciones_TieneHijoOConyuge, boolean vivienda_CasaEmpleados, boolean vivienda_Desplazamiento, boolean vivienda_zonasVulnerables, boolean salud_discapacidad, boolean salud_patologias, int salario) {
        super(codigo, nombre1, nombre2, apellido1, apellido2);
        this.ingresosfamiliares = ingresosfamiliares;
        this.condiciones_sostieneElHogar = condiciones_sostieneElHogar;
        this.condiciones_seSostieneASiMismo = condiciones_seSostieneASiMismo;
        this.condiciones_viveFueraDelNuecleFamiliar = condiciones_viveFueraDelNuecleFamiliar;
        this.condiciones_TieneHijoOConyuge = condiciones_TieneHijoOConyuge;
        this.vivienda_CasaEmpleados = vivienda_CasaEmpleados;
        this.vivienda_Desplazamiento = vivienda_Desplazamiento;
        this.vivienda_zonasVulnerables = vivienda_zonasVulnerables;
        this.salud_discapacidad = salud_discapacidad;
        this.salud_patologias = salud_patologias;
        this.salario = salario;
        this.indiceApoyo=calcularIndice();
    }

    public float getIngresosfamiliares() {
        return ingresosfamiliares;
    }

    public void setIngresosfamiliares(float ingresosfamiliares) {
        this.ingresosfamiliares = ingresosfamiliares;
    }

    public boolean isCondiciones_sostieneElHogar() {
        return condiciones_sostieneElHogar;
    }

    public void setCondiciones_sostieneElHogar(boolean condiciones_sostieneElHogar) {
        this.condiciones_sostieneElHogar = condiciones_sostieneElHogar;
    }

    public boolean isCondiciones_seSostieneASiMismo() {
        return condiciones_seSostieneASiMismo;
    }

    public void setCondiciones_seSostieneASiMismo(boolean condiciones_seSostieneASiMismo) {
        this.condiciones_seSostieneASiMismo = condiciones_seSostieneASiMismo;
    }

    public boolean isCondiciones_viveFueraDelNuecleFamiliar() {
        return condiciones_viveFueraDelNuecleFamiliar;
    }

    public void setCondiciones_viveFueraDelNuecleFamiliar(boolean condiciones_viveFueraDelNuecleFamiliar) {
        this.condiciones_viveFueraDelNuecleFamiliar = condiciones_viveFueraDelNuecleFamiliar;
    }

    public boolean isCondiciones_TieneHijoOConyuge() {
        return condiciones_TieneHijoOConyuge;
    }

    public void setCondiciones_TieneHijoOConyuge(boolean condiciones_TieneHijoOConyuge) {
        this.condiciones_TieneHijoOConyuge = condiciones_TieneHijoOConyuge;
    }

    public boolean isVivienda_CasaEmpleados() {
        return vivienda_CasaEmpleados;
    }

    public void setVivienda_CasaEmpleados(boolean vivienda_CasaEmpleados) {
        this.vivienda_CasaEmpleados = vivienda_CasaEmpleados;
    }

    public boolean isVivienda_Desplazamiento() {
        return vivienda_Desplazamiento;
    }

    public void setVivienda_Desplazamiento(boolean vivienda_Desplazamiento) {
        this.vivienda_Desplazamiento = vivienda_Desplazamiento;
    }

    public boolean isVivienda_zonasVulnerables() {
        return vivienda_zonasVulnerables;
    }

    public void setVivienda_zonasVulnerables(boolean vivienda_zonasVulnerables) {
        this.vivienda_zonasVulnerables = vivienda_zonasVulnerables;
    }

    public boolean isSalud_discapacidad() {
        return salud_discapacidad;
    }

    public void setSalud_discapacidad(boolean salud_discapacidad) {
        this.salud_discapacidad = salud_discapacidad;
    }

    public boolean isSalud_patologias() {
        return salud_patologias;
    }

    public void setSalud_patologias(boolean salud_patologias) {
        this.salud_patologias = salud_patologias;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIndiceApoyo() {
        return indiceApoyo;
    }

    public void setIndiceApoyo(int indiceApoyo) {
        this.indiceApoyo = indiceApoyo;
    }

    private int calcularIndice() {
       return (int) (Math.random() * 100) + 1;//falta crear el metodo segun los requerimientos del acuerdo 
    }
}

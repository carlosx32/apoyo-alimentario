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
class beneficiario extends estudiante {
    String clasificacion;

    public beneficiario(String clasificacion, String codigo, String nombre1, String nombre2, String apellido1, String apellido2) {
        super(codigo, nombre1, nombre2, apellido1, apellido2);
        this.clasificacion = clasificacion;
    }
    public beneficiario(String clasificacion, estudiante e) {
        super(e.getCodigo(), e.getNombre1(), e.getNombre2(), e.getApellido1(), e.getApellido2());
        this.clasificacion = clasificacion;
    }
}

package SistemaApoyoAlimentario;

import java.util.*;

/**
 * 
 */
public interface operacionsEstudiantes {

    /**
     * @return
     */
    public boolean CrearSolicitud();

    /**
     * @return
     */
    public Set<Estudiante> obtenerBeneficiarios();

    /**
     * @param cod_Estudiante
     */
    public void CambiarAspiranteBeneficiario(void cod_Estudiante);

    /**
     * 
     */
    public void OrdenarAspirantes();

    /**
     * 
     */
    public void Obtenerbeneficiarios();

    /**
     * @param cod_estudiante 
     * @return
     */
    public Beneficiario buscarBeneficiario(int cod_estudiante);

    /**
     * 
     */
    private void calificarAspirante();

}
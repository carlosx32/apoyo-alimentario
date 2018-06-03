package SistemaApoyoAlimentario;

import java.util.*;

/**
 * 
 */
public interface controlTurnos {

    /**
     * @param est 
     * @return
     */
    public boolean AsignarTurno(estudiante est);

    /**
     * 
     */
    public void verTurnos();

    /**
     * @param fecha 
     * @return
     */
    public gestorDiario verDatosDia(dateTime fecha);

}
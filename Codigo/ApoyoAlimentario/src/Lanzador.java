import logica.Modelo;

public class Lanzador {
    
    Modelo model=new Modelo();
    
    public Lanzador() {
        model.iniciar();
    };
    public static void main(String[] args) {
            //System.out.println("hola");
            new Lanzador();
    }
}

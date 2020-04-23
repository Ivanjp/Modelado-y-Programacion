
public abstract class Certificado {

    /*
     * Metodo abstracto para que cada clase lo modifique a su antojo.
     */
    abstract void opTecnica();

    /*
     * Metodo template (plantilla)
     */
    public final void rutinaDiaria() {
        agregaNombre();
        materias();
        calificaciones();
        profesores();
        promedio();
        opTecnica();
    }

    void agregaNombre(){
        
    }
    
    void materias(){
        
    }
    
    void calificaciones(){
        
    }
    
    void profesores(){
        
    } 
    
    void promedio(){
        
    }
}

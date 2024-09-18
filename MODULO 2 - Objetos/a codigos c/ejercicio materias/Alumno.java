public class Alumno {
    private String nomYape;
    private String legajo;
    

    public Alumno(String nomYape, String legajo){
        this.nomYape = nomYape;
        this.legajo = legajo; 
    }
    
    public Alumno(){
     
    }

    public String getNomYape() {
        return nomYape;
    }
    
     public String getLegajo() {
        return legajo;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }
    
    public void setlegajo(String Legajo) {
        this.legajo = legajo;
    }
    
    public String toString(){
        return ("Alumno: "+nomYape+", legajo: "+legajo);
    }
    
    
}
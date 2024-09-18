public class Propietario {
    private String nomYape;
    private int cuit;
    

    public Propietario(String nomYape, int cuit){
        this.nomYape = nomYape;
        this.cuit = cuit; 
    }
    
    public Propietario(){
     
    }

    public String getNomYape() {
        return nomYape;
    }
    
     public int getCuit() {
        return cuit;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }
    
    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    public String toString(){
        return ("propietario: "+nomYape+", cuit: "+cuit);
    }
    
    
}
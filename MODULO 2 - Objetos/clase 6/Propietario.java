public class Propietario {
    private String nomYape;
    private int CIT;
    

    public Propietario(String nomYape, int CIT){
        this.nomYape = nomYape;
        this.CIT = CIT; 
    }
    
    public Propietario(){
     
    }

    public String getNomYape() {
        return nomYape;
    }
    
     public int getCIT() {
        return CIT;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }
    
    public void setCIT(int CIT) {
        this.CIT = CIT;
    }
    
    public String toString(){
        return ("propietario: "+nomYape);
    }
    
    
}


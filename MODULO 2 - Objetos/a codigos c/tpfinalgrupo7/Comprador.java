public class Comprador {
    private String nomYape;
    private int dni;
    

    public Comprador(String nomYape, int dni){
        this.nomYape = nomYape;
        this.dni = dni; 
    }
    
    public Comprador(){
     
    }

    public String getNomYape() {
        return nomYape;
    }
    
     public int getDni() {
        return dni;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public String toString(){
        return ("comprador: "+nomYape+", dni: "+dni);
    }
    
    
}
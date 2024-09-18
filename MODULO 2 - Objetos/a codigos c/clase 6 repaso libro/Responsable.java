
public class Responsable {
    private String nomYap;
    private int DNI; 
    
    public Responsable(String nomYap, int DNI){
        this.nomYap = nomYap;
        this.DNI = DNI;
    }
    
    public Responsable(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public String getNomYap() {
        return nomYap;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        edad = edad;
    }

    public void setNomYap(String nomYap) {
        nomYap = nomYap;
    }
    
    public String toString(){
         
        return "nombre y apellido:" + nomYap  ;
    }
    
    
    
    
}

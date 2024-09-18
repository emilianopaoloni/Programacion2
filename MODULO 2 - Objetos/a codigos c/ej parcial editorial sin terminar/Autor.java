
public class Autor {
    private String nomYap;
    private int DNI; 
    private String nacionalidad;
    
    public Autor(String nomYap, int DNI, String nacionalidad){
        this.nomYap = nomYap;
        this.DNI = DNI;
        this.nacionalidad=nacionalidad;
    }
    
    public Autor(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public String getNomYap() {
        return nomYap;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }


    public void setNomYap(String nomYap) {
        this.nomYap = nomYap;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String toString(){
         
        return "nombre y apellido del autor:" + nomYap+ " nacionalidad: "+nacionalidad+" DNI: "+DNI;
    }
    
    
    
    
}

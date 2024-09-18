public class Automotor extends Vehiculo {
    private String descripcion;
    private String patente;
    private double importeA;
    

    public Automotor(Propietario propietario, int añoF, double importeB,String descripcion, String patente, double importeA){
        super(propietario,añoF,importeB);
        this.descripcion = descripcion;
        this.patente = patente; 
        this.importeA= importeA;
    }
    
    public Automotor(){
     
    }

    public String getDescripcion() {
        return descripcion;
    }
    
     public String getPatente() {
        return patente;
    }
    
    public double getImporteA() {
        return importeA;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public void setImporteA(double importeA) {
        this.importeA = importeA;
    }

    @Override  
    public double calcularImporte() {
        double aux = super.getImporteB();
        if (super.getAñoF()<2000){
            aux+= 40000;
        }
        else 
        if (super.getAñoF()>=2000){
            aux += 80000;
        }
        return aux;
        
    }
    public String toString(){
        return super.toString()+",descripcion: "+descripcion+", patente: "+patente+" ,importe final: "+this.calcularImporte();
    }
    
    
}


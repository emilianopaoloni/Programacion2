public abstract class Vehiculo {
    private Propietario propietario;
    private int añoF;
    private double importeB;
    

    public Vehiculo(Propietario propietario, int añoF, double importeB){
        this.propietario = propietario;
        this.añoF = añoF; 
        this.importeB= importeB;
    }
    
    public Vehiculo(){
     
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
     public int getAñoF() {
        return añoF;
    }
    
    public double getImporteB() {
        return importeB;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    public void setAñoF(int añoF) {
        this.añoF = añoF;
    }
    
    public void setImporteB(double importeB) {
        this.importeB = importeB;
    }
    
    @Override
    public String toString(){
        return ("propietario: "+propietario.toString()+" año de fabricacion: "+añoF+" importe: "+importeB);
    }
    
    public abstract double calcularImporte();
    
}


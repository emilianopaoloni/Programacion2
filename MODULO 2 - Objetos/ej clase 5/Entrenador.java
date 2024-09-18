public class Entrenador extends Empleado {
    private int cantC;
    
    public Entrenador(String nombre, int dni, int edad, double sueldoB, int cantC ){
        super (nombre, dni, edad, sueldoB);
        this.cantC=cantC;
    }
    
    public Entrenador(){
     
    }

    public int getCantC() {
        return cantC;
    }
    
    public void setCantC(int unCantC) {
        cantC = unCantC;
    }

    public double calcularSueldo() {
        double sueldoAcobrar = getSueldoB();
        if(cantC>=1 & cantC<=4){
            sueldoAcobrar+= 5000;
        }
        else
          if(cantC>=5 & cantC<=10){
             sueldoAcobrar+= 30000;
        }
        else 
          if(cantC>=10){
            sueldoAcobrar+= 50000;
        }
        return sueldoAcobrar;
    }
    
    public String toString() {
        return super.toString()+"sueldo a cobrar: "+calcularSueldo();
    }
}


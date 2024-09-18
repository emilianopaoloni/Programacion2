public class Jugador extends Empleado {
    private int cantP;
    private int cantG;
    
    public Jugador(String nombre, int dni, int edad, double sueldoB, int cantP, int cantG ){
        super (nombre, dni, edad, sueldoB);
        this.cantP=cantP;
        this.cantG=cantG;
    }
    
    public Jugador(){
     
    }

    public int getcantP() {
        return cantP;
    }
    
        public int getcantG() {
        return cantG;
    }
    
    public void setcantP(int uncantP) {
        cantP = uncantP;
    }
    
    public void setcantG(int uncantG) {
        cantG = uncantG;
    }

    public double calcularSueldo() {
        double sueldoAcobrar = getSueldoB();
        double promedio= cantG/cantP;
        if(promedio>0.5){
          sueldoAcobrar+= getSueldoB();
        }
        return sueldoAcobrar;
    }
    
    public String toString() {
        return super.toString()+"sueldo a cobrar: "+calcularSueldo();
    }
}


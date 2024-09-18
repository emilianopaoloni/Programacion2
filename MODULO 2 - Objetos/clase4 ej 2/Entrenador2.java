public class Entrenador2 {
    private String nombre;
    private int cantC;
    private double sueldoB; 
    
    public Entrenador2(String unNombre, int unCantC, double unSueldoB){
        nombre = unNombre;
        cantC = unCantC;
        sueldoB = unSueldoB; 
    }
    
    public Entrenador2(){
     
    }

    public int getCantC() {
        return cantC;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return("el nombre del entrenador es "+nombre+", la cantidad de torneos ganados es de: "+cantC+" y su sueldo basico es: "+sueldoB);
    }

    public void setCantC(int unCantC) {
        cantC = unCantC;
    }

    public void setSueldoB(double unSueldoB) {
        sueldoB = unSueldoB;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public void calcularSueldo() {
        if(cantC>=1 & cantC<=4){
            sueldoB+=5000;
        }
        else
          if(cantC>=5 & cantC<=10){
            sueldoB+=30000;
        }
        else 
          if(cantC>=10){
            sueldoB+=50000;
        }
    }
    
}
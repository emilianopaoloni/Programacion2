public abstract class Empleado {
    private String nombre;
    private int dni;
    private int edad;
    private double sueldoB; 
    
    public Empleado(String nombre, int dni, int edad, double sueldoB){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sueldoB = sueldoB; 
    }
    
    public Empleado(){
     
    }

    public int getedad() {
        return edad;
    }
    
     public int getdni() {
        return dni;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setedad(int unaEdad) {
        edad = unaEdad;
    }
    
    public void setDni(int unDni) {
        dni = unDni;
    }

    public void setSueldoB(double unSueldoB) {
        sueldoB = unSueldoB;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        return ("representacion de empleado: "+"nombre: "+nombre+" ");
    }
    
    public abstract double calcularSueldo() ;
    
}


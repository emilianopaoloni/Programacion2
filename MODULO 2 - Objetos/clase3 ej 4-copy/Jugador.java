public class Jugador {
    private String nombre;
    private int cantG;
    private int partidos; 
    private int DNI;
    private int edad;

    
    public Jugador(String unNombre, int unCantG, int unPartido, int unDNI, int unaEdad){
        nombre = unNombre;
        cantG = unCantG;
        partidos = unPartido; 
        DNI= unDNI;
        edad=unaEdad;
    }
    
    public Jugador (){
     
    }

      public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }
 
    public int getCantG() {
        return cantG;
    }

    public int getPartidos() {
        return partidos;
    }

    public String getNombre() {
        return nombre;
    }

       public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setCantG(int unCantG) {
        cantG = unCantG;
    }

    public void setPartidos(int unPartido) {
        partidos = unPartido;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
}
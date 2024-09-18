public class Revista extends Ejemplar {
    private String nombre;
    private int volumen;
    private int articulos;
    

    public Revista(String resumen, int id, int cantP, int añoP, Responsable resp, String nombre, int volumen, int articulos){
        super( resumen,  id,  cantP,  añoP,  resp);
        this.nombre = nombre;
        this.volumen = volumen; 
        this.articulos = articulos;
    }
    
    public Revista(){
     
    }

    public String getNombre() {
        return nombre;
    }
    
     public int getVolumen() {
        return volumen;
    }
    
    public int getArticulos() {
        return articulos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setvolumen(int volumen) {
        this.volumen = volumen;
    }
    
     public void setArticulos(int articulos) {
        this.articulos = articulos;
    }
    
    public String toString(){
        return ("nombre revista: "+nombre+", nro de volumen: "+volumen);
    }
    
    
}
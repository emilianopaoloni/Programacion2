public class Editorial {
    private String nombre;
    private int premios;
    private Libro [] librosMasVendidos;
    

    public Editorial(String nombre, int premios){
        this.nombre = nombre;
        this.premios = premios;  
        librosMasVendidos= new Libro [5];
        for(int i=0; i<5; i++){
            librosMasVendidos[i]=null;
        }
    }
    
    public Editorial(){
     
    }

    public String getNombre() {
        return nombre;
    }
    
     public int getPremios() {
        return premios;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPremios(int premios) {
        this.premios = premios;
    }
    
    public String informarLibros(Libro [] v){
        String info="";
        for (int i=0; i<5; i++){
            info= info+ v[i].toString();
        }
        return info;
    }
    
    public void agregarLibro (Libro libro){
        int i=0;
         while((i<5)&& (librosMasVendidos==null)){
             i++;
            }
           librosMasVendidos[i]=libro; 
    }
    
    
    
       
    public String toString(){
        return ("Nombre editorial: "+nombre+" premios ganados"+premios+" listado de 5 mejores libros: "+informarLibros(librosMasVendidos));
    }
    
    
}
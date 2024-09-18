public abstract class Libro {
    private String nombre;
    private String isbn;
    private double precio;
    private int paginas;
    private Fecha fechaPublicacion;
    private Autor autor;
    

    public Libro(String nombre, String isbn, double precio, int paginas, Fecha fechaPublicacion, Autor autor){
        this.nombre = nombre;
        this.isbn = isbn;
        this.precio = precio;
        this.paginas = paginas; 
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        
    }
    
    public Libro(){
     
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public double getPrecio() {
        return precio;
    }
    
     public int getPaginas() {
        return paginas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
     public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setpaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public abstract double calcularDescuento();
    

    public String toString(){
        return "nombre libro: "+nombre+" isbn: "+isbn+" precio: "+precio+"cant paginas: "+paginas+fechaPublicacion.toString()+autor.toString();
    }
    
    
}
public  class Literatura extends Libro {
    private String genero;
    private boolean edicionBolsillo;

    public Literatura(String nombre, String isbn, double precio, int paginas, Fecha fechaPublicacion, Autor autor,String genero, boolean edicionBolsillo){
        super( nombre,  isbn,  precio,  paginas,  fechaPublicacion,  autor);
        this.genero = genero;
        this.edicionBolsillo = edicionBolsillo;
       
    }
    
    public Literatura(){
     
    }

    public String getGenero() {
        return genero;
    }
    
    public boolean getEdicionBolsillo() {
        return edicionBolsillo;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setEdicionBolsillo(boolean edicionBolsillo) {
        this.edicionBolsillo = edicionBolsillo;
    }
        
    public  double calcularDescuento(){
        double precio= super.getPrecio(); //asigno precio original sin descuento
        if(edicionBolsillo==true){
            precio= precio*0.15;
        }
        if((genero.equals("novela"))|(genero.equals("cuento"))){
            precio= precio*0.05;
        }
        return precio;
    }
    

    public String toString(){
        return super.toString()+" genero del libro: "+genero+" es edicion de bolsillo: "+edicionBolsillo + "  precio del libro con descuento aplicado por feria del libro: "+ calcularDescuento();
    }
    
    
}
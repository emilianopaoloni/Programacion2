public  class Divulgativo extends Libro {
    private String tipo;

    public Divulgativo(String nombre, String isbn, double precio, int paginas, Fecha fechaPublicacion, Autor autor,String tipo, boolean edicionBolsillo){
        super( nombre,  isbn,  precio,  paginas,  fechaPublicacion,  autor);
        this.tipo = tipo;
       
    }
    
    public Divulgativo(){
     
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
    public  double calcularDescuento(){
        double precio= super.getPrecio(); //asigno precio original sin descuento
         if((super.getAño()>=2020)&&(super.getAño()<=2022)){
             if((super.getMes()>=3)&&(super.getMes()<=12)){
                 //dia??
         }
         precio= precio*0.065;
        
        
        if((tipo.equals("divulgacion cientifica")){
            if((super.getNacionalidad().equals("argentino")|(super.getNacionalidad().equals("argentina")){
            precio= precio*0.10;
        }
    }
    return precio;
    }
    

    public String toString(){
        return super.toString()+" tipo del libro: "+tipo+" es edicion de bolsillo: "+edicionBolsillo + "  precio del libro con descuento aplicado por feria del libro: "+ calcularDescuento();
    }
    
    
}
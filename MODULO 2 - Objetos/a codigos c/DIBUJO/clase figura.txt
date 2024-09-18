public abstract class Figura{
    private String colorR;
    private String colorL;
    private Punto punto;
    
    
    public Figura(){
    }
    
    public Figura( String relleno,String linea, Punto p ){
        colorR= relleno;
        colorL= linea;
        this.setPunto(p);
        
    }
    
   public String getColoR() {
        return colorR;
    }  
   public String getColorL() {
        return colorL;
    } 

    public void setColorR(String relleno) {
        colorR=relleno;
    }
    public void setColorL(String linea) {
        colorL=linea;
    }
    
    
    public void setPunto(Punto nuevoPunto){  
        punto=nuevoPunto; 
    }
     
    public Punto getPunto(){  
        return punto;       
    }
    
    public String dibujar(){
        return ("color de relleno :"+colorR+", color de linea: "+colorL+punto.toString());
    }
    
    public abstract double calcularPer ();
    
    public abstract double calcularA ();
        
    
    
    
    
}

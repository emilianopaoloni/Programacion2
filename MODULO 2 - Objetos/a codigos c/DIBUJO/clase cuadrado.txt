public class Cuadrado extends Figura{
    private double lado;
    
    
    
    public Cuadrado(){
    }
    
    public Cuadrado(double L, String relleno,String linea, Punto p ){
        super(relleno,linea,p);
        lado = L;
        
    }
    
    public double getlado() {
        return lado;
    }

    public void setlado(double l1) {
        lado= l1;
    }

    
    public double calcularPer (){
        return (4*lado);
    }
    
    public double calcularA (){
        return (lado)*(lado); 
    }
    
    public String dibujar(){
        return super.dibujar()+" lado: "+lado;
    }
    
    
    
}




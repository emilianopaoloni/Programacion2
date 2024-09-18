public class Circulo extends Figura{
    private double radio;
    
    
    
    public Circulo(){
    }
    
    public Circulo(double R, String relleno,String linea, Punto p ){
        super(relleno,linea,p);
        radio = R;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double R) {
        radio= R;
    }

    
    public double calcularA (){
        return (Math.PI*radio*radio);
    }
    
    public double calcularPer (){
        return (2*Math.PI*radio);
    }
    
    public String dibujar(){
        return super.dibujar()+" radio: "+radio;
    }
    
    
    
    
    
}




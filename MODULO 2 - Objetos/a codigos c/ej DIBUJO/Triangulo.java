public class Triangulo extends Figura{
    private double lado1;
    private double lado2;
    private double lado3;
    
    
    
    public Triangulo(){
    }
    
    public Triangulo(double L1, double L2, double L3, String relleno,String linea, Punto p ){
        super(relleno,linea,p);
        lado1 = L1;
        lado2 = L2;
        lado3 = L3;
    }
    
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }

    public void setLado1(double l1) {
        lado1= l1;
    }
    public void setLado2(double l2) {
        lado2= l2;
    }
    public void setLado3(double l3) {
        lado3= l3;
    }
    
    public double calcularPer (){
        return (lado1 + lado2 + lado3);
    }
    public double calcularA (){
        double s =0;
        s= calcularPer()/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)); 
    }
    
    public String dibujar(){
        return super.dibujar()+" lado1: "+lado1+" lado2: "+lado2+" lado3: "+lado3;
    }
    
    
    
    
}




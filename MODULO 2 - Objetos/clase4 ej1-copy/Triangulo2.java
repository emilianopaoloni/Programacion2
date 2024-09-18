public class Triangulo2{
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorR;
    private String colorL;
    
    
    public Triangulo2(){
    }
    
    public Triangulo2(double L1, double L2, double L3, String relleno,String linea ){
        lado1 = L1;
        lado2 = L2;
        lado3 = L3;
        colorR= relleno;
        colorL= linea;
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
   public String getColoR() {
        return colorR;
    }  
   public String getColorL() {
        return colorL;
    } 
    
   public String toString(){
       return ("lado1: " +lado1+" lado 2: "+lado2+" lado 3: "+lado3+" color relleno: "+colorR+" color linea: "+colorL);
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
    public void setColorR(String relleno) {
        colorR=relleno;
    }
    public void setColorL(String linea) {
        colorL=linea;
    }
    
    public double calcularPer (){
        return (lado1 + lado2 + lado3);
    }
    public double calcularA (){
        double s =0;
        s= calcularPer()/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)); 
    }
    
    
    
    
}
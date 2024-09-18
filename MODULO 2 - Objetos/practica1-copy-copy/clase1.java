import java.util.Scanner;
public class clase1 {
public static void main (String [] args) {
    double a, b, c, perimetro;
    boolean esTriangulo;
    Scanner in= new Scanner(System.in);
    System.out.print("ingrese lado a");
    a = in.nextDouble();
    System.out.print("ingrese lado b");
    b = in.nextDouble();
    System.out.print("ingrese lado c");
    c = in.nextDouble();
    
    if((a < b + c)  &&  (b < a + c) && (c < a + b)){
      esTriangulo= true;}
    if(esTriangulo=true){ 
      perimetro= a+b+c;
      System.out.println(perimetro);}
}
}
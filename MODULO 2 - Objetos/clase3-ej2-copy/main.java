import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Balanza b= new Balanza();
    Scanner in= new Scanner(System.in);
    System.out.println("ingresar producto:SI/NO");
    String corte = in.next();
    b.inciarCompra();
    while(corte.equals("SI")){
    System.out.println("ingresar peso del producto");
    double peso=in.nextDouble();
    System.out.println("ingresar precio del producto (por kg)");
    double precio=in.nextDouble();
    b.registrarProd(peso,precio);
    System.out.println("ingresar producto:SI/NO");
    corte = in.next();
    }
    System.out.println("el recibo es: "+b.devolverResumenDeCompra());
  }


}
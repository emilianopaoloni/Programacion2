import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Triangulo t= new Triangulo();
    Scanner in= new Scanner(System.in);
    System.out.println("ingresar lado1");
    double l1=in.nextDouble();
    t.setLado1(l1);
    System.out.println("ingresar lado2");
    double l2=in.nextDouble();
    t.setLado2(l2);
    System.out.println("ingresar lado3");
    double l3=in.nextDouble();
    t.setLado3(l3);
    System.out.println("el area es "+t.calcularA()+" y el perimeteo es "+t.calcularPer());
    
    }
    
  }

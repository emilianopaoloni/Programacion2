import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Scanner in= new Scanner(System.in);
    Triangulo2 t1= new Triangulo2(2,2,2, "rojo", "verde");
    System.out.println(t1);
    
    Triangulo2 t2= new Triangulo2();
    t2.setLado1(22);
    System.out.println("el lado 1 del triangulo 2 es: "+t2.getLado1());
    
    
    
    
    }
    
  }

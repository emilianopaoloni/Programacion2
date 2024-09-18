import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Entrenador e= new Entrenador();
    Scanner in= new Scanner(System.in);
    System.out.println("ingresar nombre");
    String nombre=in.next();
    e.setNombre(nombre);
    System.out.println("ingresar sueldo base");
    double sueldo=in.nextDouble();
    e.setSueldoB(sueldo);
    System.out.println("ingresar cant campeonatos");
    int cant=in.nextInt();
    e.setCantC(cant);
    e.calcularSueldo();
    System.out.println("el sueldo actualizado es : "+e.getSueldoB());
    }
    
  }




import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Jugador v[]= new Jugador[50];
    Scanner in= new Scanner(System.in);
    System.out.println("leer jugador SI/NO");
    String corte=in.next();
    int dimL=0;
    while (dimL<50 & corte.equals("SI")){
      System.out.println("ingresar nombre jugador ");
      String nombre=in.next();
      System.out.println("ingresar dni ");
      int dni=in.nextInt();
      System.out.println("ingresar edad ");
      int edad=in.nextInt();
      System.out.println("ingresar goles");
      int goles=in.nextInt();
      System.out.println("ingresar partidos");
      int partidos=in.nextInt();
      v[dimL]= new Jugador (nombre,goles,partidos,dni,edad);
      dimL++;
      System.out.println("leer jugador SI/NO");
      corte=in.next();
      
    }
    System.out.println("la cant de jugadores con mas de 100 partidos es: "+mas100 (v, dimL));
    
    
    }
    
    private static int mas100 (Jugador [] v, int dimL){
        int aux =0;
        for (int i=0;i<dimL;i++){
            if (v[i].getPartidos()>100){
                aux++;
            }
        }
        return aux;
    }
 }

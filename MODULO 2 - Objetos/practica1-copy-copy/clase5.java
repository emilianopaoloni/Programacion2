import java.util.Scanner;
public class clase5 {
public static void main (String [] args) {
    double altura, sumaAlturas, alturaPromedio;
    int jugador, totalJugadores, jugadoresConMayorAltura;
    double [] alturas;
    Scanner in= new Scanner(System.in);
    alturas=new double[5];
    sumaAlturas=0;
    for(jugador=0;jugador<5;jugador++){
        System.out.print("escriba la altura del jugador numero "+jugador);
        altura= in.nextDouble();
        alturas[jugador]=altura;
        sumaAlturas= sumaAlturas+altura;
    }
    jugadoresConMayorAltura=0;
    alturaPromedio= sumaAlturas/5;
    for(jugador=0;jugador<5;jugador++){
        if (alturas[jugador] > alturaPromedio) {
            jugadoresConMayorAltura++;
        }
    }
    
    System.out.println("la altura promedio de jugadores es "+alturaPromedio);
    System.out.println("cantidad de jugadores con altura por encima del promedio: "+jugadoresConMayorAltura);
  }
} 
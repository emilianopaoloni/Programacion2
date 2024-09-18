import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Scanner in= new Scanner(System.in);
    Micro m= new Micro("ABC123", "Mar del Plata", "5:00 AM");
    System.out.println("lea un numero de asiento para comprar (-1 para terminar)");
    int a= in.nextInt();
    while((a!=-1)&&(m.microLleno()==false)){
        if(m.estadoAsiento(a).equals("libre")){
            m.ocuparAsiento(a);
            System.out.println("la operacion fue realizada con exito");
        }
        else {
          System.out.println("El asiento numero "+a+" esta ocupado");
          if(m.primerAsientoLibre()!= -1){
            System.out.println("El primer asiento libre es: "+m.primerAsientoLibre());
          }
          else { //no hace falta este else, nunca va a entrar al while
                 //si el micro ya esta lleno (por condicion del while)
            System.out.println("no hay mas asientos libres");
        }
          }
        System.out.println("lea un numero de asiento para comprar (-1 para terminar)");
        a= in.nextInt();
    }
    System.out.println("no hay mas asientos libres");
    System.out.println("la cantidad de asientos ocupados del micro es: "+m.getAsientosOcupados());
}
}

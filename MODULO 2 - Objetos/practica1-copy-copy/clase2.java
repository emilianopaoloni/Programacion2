import java.util.Scanner;
public class clase2 {
public static void main (String [] args) {
    double porcentaje;
    int patente, autosIngresados, totalAutos;
    Scanner in= new Scanner(System.in);
    totalAutos=0;
    autosIngresados=0;
    System.out.print("ingrese patente de auto");
    patente=in.nextInt();
    while(patente!=0){
       totalAutos++;
       if((patente%2) == 0){
           autosIngresados++;
       }
       System.out.print("ingrese patente de auto");
       patente= in.nextInt(); 
    }
    porcentaje=(autosIngresados/(double)totalAutos)*100;
    System.out.print(porcentaje);
}
}
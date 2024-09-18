import java.util.Scanner;
public class clase4 {
public static void main (String [] args) {
    int factorial,n, numero;
    Scanner in= new Scanner(System.in);
    numero=1;
    while(numero<=9) {
    n=numero;
    factorial=n;
    if(numero%2!=0){  
      while(n!=1){
          factorial= factorial*(n-1);
          n=n-1;
      }
      System.out.println("el factorial de "+numero+" es: "+factorial);
   }
    numero++;
   }
}
} 
 
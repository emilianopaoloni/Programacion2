import java.util.Scanner;
public class clase3 {
public static void main (String [] args) {
    int factorial,n;
    Scanner in= new Scanner(System.in);
    System.out.print("ingrese un numero para calcular su factorial");
    n=in.nextInt();
    factorial=n;
    while(n!=1){
        factorial= factorial*(n-1);
        n=n-1;
    }
    System.out.print("el factorial es: "+factorial);
}
} 
 
import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Palabra v[]= new Palabra[10];
    Scanner in= new Scanner(System.in);
    for (int i=0;i<10;i++){
        System.out.println("ingresar una palabra ");
        String pal=in.next();
        v[i]= new Palabra (pal);
    }
    for (int i=0;i<10;i++){
        System.out.print(v[i].getPalabra().charAt(0));
    }
 }
}   
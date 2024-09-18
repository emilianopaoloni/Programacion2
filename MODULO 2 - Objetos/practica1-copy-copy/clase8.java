import java.util.Scanner;
public class clase8 {
public static void main (String [] args) {
    int [][] puntajes;
    int [] suma;
    int i,j, calificacion;
    Scanner in =  new  Scanner(System.in);
    puntajes= new int [5][4];
    suma= new int [4];
    
      for (i=0; i<5; i++){
        System.out.println("cliente "+i);
        for (j=0; j<4; j++){
          System.out.println("escriba la calificacion de categoria "+j);
          calificacion= in.nextInt();
          puntajes[i][j]= calificacion;
        }
    }
    for (j=0; j<4; j++){
        suma[j]=0;
    }
     for (i=0; i<5; i++){
        for (j=0; j<4; j++){
         suma[j]= suma[j] + puntajes[i][j];
        }
    }
    for (j=0; j<4; j++){
        System.out.println("el promedio para aspecto "+j+" es: "+(suma[j]/5.0));
    }
  }
}  
import java.util.Scanner;
public class clase6 {
public static void main (String [] args) {
    int i, j, numpar, suma, valorEntero, fila, columna;
    boolean encontro;
    int [][] numeros;
    int [] vectorSumaColumnas;
    Scanner in= new Scanner(System.in);
    vectorSumaColumnas = new int [10];
    numpar=2;
    numeros= new int [10][10];
    for (i=0; i<10; i++){
      for (j=0; j<10; j++){
          numeros[i][j]=numpar;
          numpar=numpar*2;
      }
    }
    for (i=0; i<10; i++){
      for (j=0; j<10; j++){
          System.out.println(numeros[i][j]);
      }
    }
    suma=0;
    for (i=2; i<=9; i++){
      for (j=0; j<=3; j++){
          suma= suma + numeros[1][j];      }
    }
    System.out.println("la suma es "+suma);
    for (j=0; j<10; j++) {
        suma=0;
        for(i=0; i<10; i++) {
            suma= suma + numeros[i][j];
        }
        vectorSumaColumnas[j]= suma;
    }
    for (i=0; i<10; i++) {
          System.out.println(vectorSumaColumnas[i]);
        }
    System.out.println("escriba un numero entero para ver si esta en la matriz");
    valorEntero=in.nextInt();
    encontro= false;
    fila=1; columna=1;
    for (i=0; i<10; i++){
      for (j=0; j<10; j++){
          if(numeros[i][j]==valorEntero) {
              encontro=true;
              fila=i;
              columna=j;
          }
      }
    }
    if(encontro=true){
      System.out.println("el numero "+valorEntero+" esta en la posicion:");
      System.out.println("fila: "+ fila);
      System.out.println("columna: "+ columna);
    }
    
  }
}

    
    
    
import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Partido p= new Partido();
    Partido v[]= new Partido[3];
    Scanner in= new Scanner(System.in);
    for (int i=0;i<3;i++){
      System.out.println("ingresar equipo local ");
      String local=in.next();
      p.setLocal(local);
      System.out.println("ingresar goles de equipo local ");
      int golesLocal=in.nextInt();
      p.setGolesLocal(golesLocal);
      System.out.println("ingresar equipo visitante ");
      String visitante=in.next();
      p.setVisitante(visitante);
      System.out.println("ingresar goles de equipo visitante ");
      int golesVisitante=in.nextInt();
      p.setGolesVisitante(golesVisitante);
      v[i]= new Partido (local,visitante,golesLocal,golesVisitante);
    }
    System.out.println("La cantidad de partidos que ganó River es "+partidosRiver(v));
    System.out.println("La cantidad de goles de Boca como local es "+golesBocaLocal(v));
    System.out.println("El porcentaje de empates es de "+porcentajeEmpate(v));  
}

    public static int partidosRiver (Partido[] v){
      int cant=0;
      for (int i = 0;i<3;i++){
        if  (v[i].getLocal().equals( "river") || v[i].getVisitante().equals("river")){
            if (v[i].getGanador().equals("river")){
                cant++;
            }
        }
    }
    return cant;
    }
     
    
    public static int  golesBocaLocal (Partido[] v){
      int cant=0;
      for (int i = 0;i<3;i++){
        if  (v[i].getLocal().equals("boca") ){
            cant= cant + v[i].getGolesLocal();
            }
        }
      return cant;
      }
    
      public static double  porcentajeEmpate (Partido[] v){
      int cant=0;
      for (int i = 0;i<3;i++){
        if  (v[i].hayEmpate() == true ){
             cant++;
            }
        }
      return (cant/(double) 3);
    }
 }

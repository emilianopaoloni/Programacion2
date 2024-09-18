import java.util.Scanner;
public class main {
public static void main (String [] args) {
    Scanner in= new Scanner(System.in);
    Flota f= new Flota(); //creo flota vacia
    
    System.out.println("lea una patente (ZZZ000 para terminar)");
    String patente= in.next();
    
    while((!patente.equals("ZZZ000")  )&&(f.flotaLlena()==false)){
      System.out.println("ingrese destino del micro");
      String destino= in.next();
      System.out.println("ingrese hora de salida del micro");
      String hora= in.next();
      Micro m= new Micro(patente, destino, hora);
      f.agregarMicro(m);
      
     System.out.println("lea una patente (ZZZ000 para terminar)");
     patente= in.next();
    }
    
    System.out.println("lea patente del micro a eliminar");
    String p= in.next();
     if (f.existeMicro(p)==true){
           f.eliminarMicro(p);
     }
     
    System.out.println("lea destino para informar micro");
    String d= in.next(); 
    Micro mic= f.buscarMicroDestino(d);
    if(mic!=null) {
      System.out.println("el micro que va a destino "+d+" tiene patente "+mic.getPatente());
      System.out.println("y hora de salida "+mic.getHoraSalida());
    }
    else{
    System.out.println("el micro que va a destino "+d+" no existe");
    }
    
}
}
import java.util.Scanner; 
    
public class main {
public static void main (String[] args){
    Show s = new Show();
    int dimL = 0;
    Scanner in = new Scanner(System.in);
    s = leerShow( in);
    imprimirShow(s);
    in.close();
}



    private static void imprimirShow(Show s){
        System.out.println("info de show");
        System.out.println(s.toString());
        System.out.println(s.informarLoc());
    }
    
    private static Comprador leerComprador(Scanner in){
        String nomYape; int dni; Comprador comprador;
        in.nextLine();
        System.out.println("nombre y apellido: ");
        nomYape =  in.nextLine(); 
        System.out.println("dni: "); 
        dni = in.nextInt();
        return comprador = new Comprador( nomYape, dni);
    }

    private static Show leerShow(Scanner in){  
        Show s = null; boolean soldOut; int numS;String fecha;String TipoV;
        System.out.println("numero de show: ");
        numS = in.nextInt(); 
        System.out.println("fecha(dd/mm/aaaa): "); 
        fecha = in.next();
        System.out.println("soldOut(true/false): ");  
        soldOut = in.nextBoolean();
        s = new Show ( soldOut, numS, fecha);
        int dimL = 0;
        for (int i=0;i<10;i++){   //lee 10 localidades
        System.out.println(" ingrese una localidad: ");
        Localidad l = leerLocalidad(in);
        s.agregarLoc(l ) ;            
        System.out.println();    
    }
    System.out.println("HA FINALIZADO LA CARGA");
        
            
        return s;  
    }
    
    private static Localidad leerLocalidad(Scanner in){  
        Localidad l = null; int id;int fila; int butaca;String platea; Comprador comprador;String metodoP;String TipoV;
        System.out.println("id: ");
        id = in.nextInt(); 
        System.out.println("fila: "); 
        fila = in.nextInt();
        System.out.println("butaca: "); 
        butaca = in.nextInt();
        System.out.println("platea: "); 
        platea = in.next();
        System.out.println("metodo de pago (credito/debito): "); 
        metodoP = in.next();
        
        
        comprador = leerComprador(in);
        
        System.out.println("que tipo de localidad desea ingresar? (VIP/ COMUNES):");
        TipoV = in.next();
        
        if (TipoV.equals("VIP")){
            System.out.println("INFORMACION DE VIP");
            System.out.print ("ENTRADA ESPECIAL (true/false): "); 
            boolean especial = in.nextBoolean();  
            System.out.println("costo del vip (si no es vip ingrese 0): "); 
            double costoV = in.nextDouble();
            
            l = new Vip (  id, fila,  butaca, platea,  comprador, metodoP, especial,  costoV);
        }
        else
            
            if (TipoV.equals("COMUNES")){
                System.out.println("INFORMACION DE COMUNES");
                System.out.print ("¿ posee entrada fisica? (true/false): "); 
                boolean entradaF = in.nextBoolean(); 
                System.out.print ("costo de impresion (si no es fisica ingrese 0): ");
                double costoImp = in.nextDouble();
                
                l = new Comunes ( id, fila,  butaca, platea,  comprador, metodoP, entradaF,  costoImp);
            
           }
        
            
        return l; 
    }
} 
  
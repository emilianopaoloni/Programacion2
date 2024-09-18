import java.util.Scanner; 
    
public class main {
public static final int DIMF= 1000;            //dim propuesta por mi
public static void main (String[] args){
    Vehiculo [] vecV = new Vehiculo [DIMF];
    int dimL = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Desea ingresar un Vehiculo? (SI/NO): "); 
    String fin= in.next();
    while (fin.equals("SI") && dimL < DIMF){
        vecV[dimL] = leerVehiculo (in);                /*le crago el objeto y aumento la dimL*/   
        dimL++;
        System.out.println();
        System.out.println("Desea ingresar otro Vehiculo? (SI/NO):"); 
        fin = in.next();
    }
    System.out.println("HA FINALIZADO LA CARGA DE Vehiculos");
    imprimirListado(vecV,dimL);
    in.close();
}


    private static void imprimirListado(Vehiculo [] vecV,int diml){
        System.out.println("Lista de todos los empleados");
        for (int i=0; i<diml; i++){
            System.out.println(vecV[i]); 
        }
    }
    
    private static Propietario leerPropietario(Scanner in){
        String nomYape; int CIT; Propietario p;
        in.nextLine();
        System.out.println("nombre y apellido: ");
        nomYape =  in.nextLine(); 
        System.out.println("CIT: "); 
        CIT = in.nextInt();
        return p = new Propietario( nomYape, CIT);
    }

    private static Vehiculo leerVehiculo(Scanner in){  
        Vehiculo v = null; Propietario p; int añoF; double importeB;String TipoV;
        System.out.println("añoF: ");
        añoF = in.nextInt(); 
        System.out.println("importeB: "); 
        importeB = in.nextDouble();
        p = leerPropietario(in);
        
        System.out.println("que tipo de Vehiculo desea ingresar? (EMBARCACION/AUTOMOTOR):");
        TipoV = in.next();
        
        if (TipoV.equals("EMBARCACION")){
            System.out.println("INFORMACION DE LA EMBARCACION");
            System.out.print ("nombre: "); 
            String nombre = in.next();  
            System.out.println("codigo rey: "); 
            int codRey = in.nextInt();
            System.out.println("eslora: "); 
            double eslora = in.nextDouble();
            System.out.println("tonelaje: "); 
            double tonelaje = in.nextDouble();
            System.out.println("valor de la emb: "); 
            double valorD = in.nextDouble();
            
            v = new Embarcacion ( p, añoF,  importeB, nombre,  codRey,  eslora,  tonelaje,  valorD);
        }
        else
            if (TipoV.equals("AUTOMOTOR")){
                System.out.println("INFORMACION DEL AUTOMOTOR");
                System.out.print ("descripcion: "); 
                String descripcion = in.next(); 
                System.out.print ("patente: ");
                String patente = in.next();
                System.out.print ("importe adicional: ");
                double importeA = in.nextDouble();
                
                v = new Automotor ( p,  añoF,  importeB, descripcion,  patente,  importeA);
            }
            
        return v;    /*devuelvo el objeto Empleado*/
    }
}  

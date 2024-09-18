import java.util.Scanner; 
    
public class main {
public static final int DIMF= 4;            //dim propuesta por mi
public static void main (String[] args){
    CuentaBancaria [] vecV = new CuentaBancaria [DIMF];
    int dimL = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Desea ingresar una cta bancaria? (SI/NO): "); 
    String fin= in.next();
    while (fin.equals("SI") && dimL < DIMF){
        vecV[dimL] = leerCuentaBancaria (in);                /*le crago el objeto y aumento la dimL*/   
        dimL++;
        System.out.println();
        System.out.println("Desea ingresar otro Vehiculo? (SI/NO):"); 
        fin = in.next();
    }
    System.out.println("HA FINALIZADO LA CARGA DE cuentas");
    imprimirCuentas(vecV,dimL);
    in.close();
}



    private static void imprimirCuentas(CuentaBancaria [] vecV,int diml){
        System.out.println("Listado de cuentas bancarias");
        for (int i=0; i<diml; i++){
            System.out.println(vecV[i]); 
        }
    }
    
    private static Propietario leerPropietario(Scanner in){
        String nomYape; int cuit; Propietario p;
        in.nextLine();
        System.out.println("nombre y apellido: ");
        nomYape =  in.nextLine(); 
        System.out.println("Cuit: "); 
        cuit = in.nextInt();
        return p = new Propietario( nomYape, cuit);
    }

    private static CuentaBancaria leerCuentaBancaria(Scanner in){  
        CuentaBancaria c = null; Propietario p; int nroCuenta;String alias; int cbu;double dinero;String TipoV;
        System.out.println("numero de cuenta: ");
        nroCuenta = in.nextInt(); 
        System.out.println("alias: "); 
        alias = in.next();
        System.out.println("cbu: "); 
        cbu = in.nextInt();
        System.out.println("dinero disponible: "); 
        dinero = in.nextDouble();
        
        
        p = leerPropietario(in);
        
        System.out.println("que tipo de cuenta bancaria desea ingresar? (CUENTA CORRIENTE/CAJA DE AHORRO):");
        TipoV = in.next();
        //CajaDeAhorro caja= null;
        if (TipoV.equals("CUENTA CORRIENTE")){
            System.out.println("INFORMACION DE CUENTA CORRIENTE");
            System.out.print ("Limite que posee el cliente: "); 
            double limite = in.nextDouble();  
            System.out.println("cantidad de cheques emitidos: "); 
            int cheques = in.nextInt();
            
            c = new CuentaCorriente ( nroCuenta, alias,  cbu, dinero,  p,  limite,  cheques);
        }
        else
            
            if (TipoV.equals("CAJA DE AHORRO")){
                System.out.println("INFORMACION DEL CAJA DE AHORRO");
                System.out.print ("¿posee plazo fijo? (true/false): "); 
                boolean plazoFijo = in.nextBoolean(); 
                System.out.print ("cantidad de tarjetas de credito: ");
                int tarjetasCredito = in.nextInt();
                
                CajaDeAhorro ca = new CajaDeAhorro (nroCuenta, alias,  cbu, dinero,  p, plazoFijo, tarjetasCredito);
                
                System.out.print ("ultimas cinco transacciones: escriba monto y concepto ");
                     for(int i=0; i<5; i++){
                     System.out.print ("transaccion numero"+(i++));
                     System.out.print ("concepto");
                     String concepto= in.nextLine();
                     System.out.print ("monto");
                     double monto= in.nextDouble();
                     ca.agregarTransaccion(concepto,monto); 
            }
            c=ca;
           }
        
            
        return c;    /*devuelvo el objeto cuentaBancaria*/
    }
}  

import java.util.Scanner; 
    
public class main {
public static final int DIMF= 5;            //dim propuesta por mi
public static void main (String[] args){
    MateriaAprobada [] vecV = new MateriaAprobada [DIMF];
    int dimL = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Desea ingresar una materia? (SI/NO): "); 
    String fin= in.next();
    while (fin.equals("SI") && dimL < DIMF){
        vecV[dimL] = leerMateriaAprobada (in);                /*le crago el objeto y aumento la dimL*/   
        dimL++;
        System.out.println();
        System.out.println("Desea ingresar otra materia? (SI/NO):"); 
        fin = in.next();
    }
    System.out.println("HA FINALIZADO LA CARGA DE materias");
    imprimirMaterias(vecV,dimL);
    in.close();
}



    private static void imprimirMaterias(MateriaAprobada [] vecV,int diml){
        System.out.println("Listado :");
        for (int i=0; i<diml; i++){
            System.out.println(vecV[i]); 
        }
    }
    
    private static Alumno leerAlumno(Scanner in){
        String nomYape; String legajo; Alumno a;
        in.nextLine();
        System.out.println("nombre y apellido: ");
        nomYape =  in.nextLine(); 
        System.out.println("legajo: "); 
        legajo = in.next();
        return a = new Alumno( nomYape, legajo);
    }
      
    private static Fecha leerFecha(Scanner in){
        int dia; int mes; int año; Fecha f;
        in.nextLine();
        System.out.println("dia ");
        dia =  in.nextInt();
        System.out.println("mes ");
        mes =  in.nextInt(); 
        System.out.println("año ");
        año =  in.nextInt(); 
        return f = new Fecha(dia, mes, año);
    }
    
    

    private static MateriaAprobada leerMateriaAprobada(Scanner in){  
        MateriaAprobada m = null; Alumno a;  String codigo; String semestre; 
        System.out.println("codigo materia: ");
        codigo = in.next(); 
        System.out.println("semestre (primero/segundo): "); 
        semestre = in.next();
        
        a = leerAlumno(in);
        
        System.out.println("como se aprobo la materia? (CURSADA/FINAL):");
        String TipoV = in.next();
        if (TipoV.equals("CURSADA")){
           
            m = new Cursada ( a, codigo,  semestre);
            //agrego autoevaluaciones:
            System.out.println("autoevaluaciones realizadas por el alumno: ");
            double nota; String fin; int dimL=0;
            System.out.println("Agregar autoevaluacion (SI/NO)");
            fin = in.next();
            while((fin.equals("SI"))&&(dimL<8)){
                System.out.println("autoEVA "+ (dimL+1));
                System.out.println("nota: ");
                nota = in.nextDouble();
                m.agregarAutoevaluacion(nota);
                dimL+=1;
                System.out.println("Agregar autoevaluacion (SI/NO)");
                fin = in.next();
            }
            
        }
        else
            
            if (TipoV.equals("FINAL")){
                System.out.println("INFORMACION DEL FINAL");
                System.out.print ("¿fue por promocion? (true/false): "); 
                boolean promocion = in.nextBoolean(); 
                System.out.print ("nota: ");
                double nota = in.nextInt();
                
                Fecha f= leerFecha(in);
                
                m = new Final ( codigo, semestre,  a,  nota,  promocion,  f);                
              
           }
        
            
        return m;    /*devuelvo el objeto materiaAprobada*/
    }
}  

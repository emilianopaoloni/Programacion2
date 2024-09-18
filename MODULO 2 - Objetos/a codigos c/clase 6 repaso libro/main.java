import java.util.Scanner; 
    
public class main {
public static final int DIMF= 1000;            //dim propuesta por mi
public static void main (String[] args){
    Ejemplar [] vecE = new Ejemplar [DIMF];
    int dimL = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Desea ingresar un Ejemplar? (SI/NO): "); 
    String fin= in.next();
    while (fin.equals("SI") && dimL < DIMF){
        vecE[dimL] = leerEjemplar (in);                /*le cargo el objeto y aumento la dimL*/   
        dimL++;
        System.out.println();
        System.out.println("Desea ingresar otro ejemplar? (SI/NO):"); 
        fin = in.next();
    }
    System.out.println("HA FINALIZADO LA CARGA DE ejemplares");
    imprimirListado(vecE,dimL);
    in.close();
}


    private static void imprimirListado(Ejemplar [] vecE,int diml){
        System.out.println("Lista de todos ejemplares:");
        for (int i=0; i<diml; i++){
            System.out.println(vecE[i]); 
        }
    }
    
    private static Responsable leerResponsable(Scanner in){
        String nomYape; int dni; Responsable r;
        in.nextLine();
        System.out.println("nombre y apellido del responsable ");
        nomYape =  in.nextLine(); 
        System.out.println("dni del responsable"); 
        dni = in.nextInt();
        return r = new Responsable( nomYape, dni);
    }

    private static Ejemplar leerEjemplar(Scanner in){  
        Ejemplar e = null; Responsable r; int añoP; int cantP;int id; String resumen;
        System.out.println("codigo identificatorio del ejemplar");
        id = in.nextInt(); 
        System.out.println("año de Publicacion del ejemplar (0 si todavia no fue publicado)");
        añoP = in.nextInt(); 
        System.out.println("cantidad de Paginas: "); 
        cantP = in.nextInt();
        in.nextLine();
         System.out.println("resumen del ejemplar "); 
        resumen = in.nextLine();
        r = leerResponsable(in);
        
        System.out.println("que tipo de Ejemplar desea ingresar? (LIBRO/REVISTA):");
        String TipoE = in.next();
        
        Libro libro= null;
        
        if (TipoE.equals("LIBRO")){
            System.out.println("INFORMACION DEL LIBRO");
            System.out.print ("titulo: "); 
            String titulo = in.next();  
            System.out.println("cant capitulos: "); 
            int capitulos = in.nextInt();
            System.out.println("¿es una edicion de bolsillo? (true/false)"); 
            boolean edicionBolsillo = in.nextBoolean();
            
            libro = new Libro (resumen,id,cantP,añoP, r,titulo, capitulos, edicionBolsillo);
            
            if (edicionBolsillo==true){          //agregar a cada titulo de libro si es o no edicion de bolsillo
                libro.setTitulo(libro.getTitulo() + " - edicion de bolsillo");
            }
            else{
            libro.setTitulo(libro.getTitulo() + " - edicion no es de bolsillo");
           }
           e= libro;
        }
        else
            if (TipoE.equals("REVISTA")){
                System.out.println("INFORMACION DEL REVISTA");
                System.out.print ("nombre del revista: "); 
                String nombre = in.next(); 
                
                int volumen = Generador.getNroVolumen(); //genero el nro de volumen con la clase generador
                
                System.out.print ("cantidad de articulos ");
                int articulos = in.nextInt();
                
                e = new Revista ( resumen,id,cantP,añoP, r,nombre, volumen, articulos);
            }
            
        return e;    /*devuelvo el objeto Ejemplar*/
    }
}  

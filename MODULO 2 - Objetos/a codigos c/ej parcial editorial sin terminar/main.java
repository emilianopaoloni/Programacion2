import java.util.Scanner; 
    
public class main {
public static final int DIMF= 5;            //dim propuesta por mi
public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("nombre editorial");
    String nombre = in.next();
    System.out.println("cantidad de premios ganados");
    int cant = in.nextInt();
    in.close();
    
    Editoral e= New Editorial(nombre, cant);
    
    System.out.println("cinco libros mas vendidos de la editorial:");
    
    
    Autor a= new Autor(Cortez, 44410527, argentino);
    Fecha f= new Fecha(20,7,2021);
    
    Literatura l1= new Literatura(libro1, a123, 2000, 40, f, a, "cuento", false);
    e.AgregarLibro(l1);
    
    Divulgativo l2= new Divulgativo(libro2, a123, 2000, 40, f, a, "divulgacion cientifica", false);
    e.AgregarLibro(l2);
    
    Literatura l3= new Literatura(libro3, a123, 2000, 40, f, a, novela, true);
    e.AgregarLibro(l3);
    
    Divulgativo l4= new Divulgativo(libro4, a123, 2000, 40, f, a, "biografia", false);
    e.AgregarLibro(l4);
    
    Literatura l5= new Literatura(libro3, a123, 2000, 40, f, a, "poemario", false);
    e.AgregarLibro(l3);
    
    e.toString();
    
    
    
    
    
    Libro l2= new Libro(libro1, a123, 2000, 40, f, a);
     
    
}


   
}  

import java.util.Scanner; 

public class main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
       
       String nombre;int dni; int edad; double sueldoB;
       System.out.println("ingrese cantidad de empleados a leer");
       int  cant= in.nextInt();
       Empleado [] v= new Empleado[cant];
       String tipo;
        for (int i=0;i<cant;i++){
            System.out.println("ingresar nuevo empleado "); 
                System.out.println("nombre empleado: ");
                nombre = in.next(); 
                 System.out.println("edad empleado: ");
                 edad = in.nextInt(); 
                 System.out.println("dni empleado: "); 
                   dni = in.nextInt();
                System.out.println("sueldo basico empleado "); 
                  sueldoB = in.nextDouble();
                  System.out.println("ingrese si es jugador o entrenador");
                  tipo = in.next();
                switch (tipo){
                    case "jugador":
                         System.out.println("ingrese cant partidos "); int p= in.nextInt();
                         System.out.println("ingrese cant goles"); int g= in.nextInt();
                         Jugador j= new Jugador (nombre, dni, edad, sueldoB, p, g);
                         v[i]= j;
                    break;
                    case "entrenador":
                        System.out.println("ingrese campeonatos ganados"); int c= in.nextInt();
                        Entrenador e= new Entrenador(nombre, dni, edad, sueldoB, c);
                        v[i]= e;
                    break;
                } 
            }
    
        for (int i=0;i<cant;i++){ //leer empleados
            System.out.println(v[i].toString());
    }
}
}

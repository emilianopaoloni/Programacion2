import java.util.Scanner; 

public class main {
    public static void main (String[] args){
        Dibujo d = new Dibujo();
        Scanner in = new Scanner(System.in);
        d = leerDibujo (in);
        d.mostrar ();
        in.close();
    }
    
    private static Dibujo leerDibujo(Scanner in){
        Dibujo d = null; String autor;int cantF; String titulo;
        System.out.println("titulo del dibujo: ");
        titulo = in.next(); 
        System.out.println("ingrese autor: "); 
        autor = in.next();
        System.out.println("ingrese cant figuras: "); 
        cantF = in.nextInt(); 
        d = new Dibujo (titulo,autor,cantF);
        for (int i=0;i<cantF;i++){
            System.out.println("Desea ingresar una figura "); 
                System.out.println("ingrese colorRelleno: "); 
                String colorR = in.next();
                System.out.println("ingrese colorLinea: "); 
                String colorL = in.next();
                Punto p = leerPunto(in);
                System.out.println("ingrese tipo de figura: "); 
                String tipo = in.next();
                switch (tipo){
                    case "TRIANGULO":
                         System.out.println("ingrese lado1: "); double l1= in.nextDouble();
                         System.out.println("ingrese lado2: "); double l2= in.nextDouble();
                         System.out.println("ingrese lado3: "); double l3= in.nextDouble();
                         Triangulo t= new Triangulo (l1,l2,l3,colorR,colorL,p);
                         d.agregarFigura(t);
                    break;
                    case "CUADRADO":
                        System.out.println("ingrese lado: "); double l= in.nextDouble();
                        Cuadrado c= new Cuadrado(l,colorR,colorL,p);
                        d.agregarFigura(c);
                    break;
                    case "CIRCULO":
                        System.out.println("ingrese radio: "); double r= in.nextDouble();
                        Circulo ci= new Circulo(r,colorR,colorL,p);
                        d.agregarFigura(ci);
                    break;
                            
                } 

        }
        return d;
    }

    private static Punto leerPunto(Scanner in){
        Punto p = null; int x,y;
        System.out.println("ingrese pos X: ");
        x = in.nextInt(); 
        System.out.println("ingrese pos Y: "); 
        y = in.nextInt(); 
        p = new Punto(x,y);
        return p;
    }
} 
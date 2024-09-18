
   import java.util.Scanner;
public class clase7 {
public static void main (String [] args) {
        int i;
        int operacion;
        int max;
        int opmax;
        int[] vectorCantidadOperaciones;
        String[] vectorNombreOperaciones;
        Scanner in =  new  Scanner(System.in);
        vectorCantidadOperaciones =  new  int[5];
        vectorNombreOperaciones =  new  String[5];
        vectorNombreOperaciones[0] = "cobro de cheque";
        vectorNombreOperaciones[1] = "depósito/ extracción en cuenta";
        vectorNombreOperaciones[2] = "pago de impuestos o servicios";
        vectorNombreOperaciones[3] = "cobro de jubilación";
        vectorNombreOperaciones[4] = "cobro de planes";
        i = 0;
        while (i < 5) {
            vectorCantidadOperaciones[i] = 0;
            i = i + 1;
        }
        System.out.println("seleccione operacion que desea realizar, 999 para terminar");
        operacion = in.nextInt();
        while (operacion != 999) {
            vectorCantidadOperaciones[operacion] = vectorCantidadOperaciones[operacion] + 1;
            System.out.println("seleccione operacion que desea realizar, 999 para terminar");
            operacion = in.nextInt();
        }
        max = -1;
        i = 0;
        opmax= 0;
        while (i < 5) {
            System.out.println("la cantidad de personas atendidas para " + vectorNombreOperaciones[i] + " es de: " + vectorCantidadOperaciones[i]);
            if (vectorCantidadOperaciones[i] > max) {
                max = vectorCantidadOperaciones[i];
                opmax = i;
            }
            i = i + 1;
        }
        System.out.println("la operacion mas solicitada es: " + vectorNombreOperaciones[opmax]);
    }
}

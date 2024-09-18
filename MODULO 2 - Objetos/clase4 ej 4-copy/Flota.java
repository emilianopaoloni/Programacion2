public class Flota {
    private Micro [] f;
    private int cantMicros;
    
    public Flota (){
        f = new Micro [15];
        for(int i=0; i<15; i++){
            f[i]=null; //inicializo vector vacio (flota vacia)
        }
    }
 
 
   //devolver si la flota esta llena (tiene 15 micros)
 public boolean flotaLlena() {
        return (cantMicros==15);
    }
 
    //agregar micro a la flota recibe parametro vector, patente o numero(1-15)??
 public void agregarMicro(Micro m ) {
         int i=0;
         while((i<15)&&(f[i]!=null)) { 
             i++;  
         }
         f[i]=m;
         cantMicros++;
        }
        
    //verifica que existe micro con un parametro patente
public boolean existeMicro(String patente) {
      int i=0;
      while((i<cantMicros)&& !(patente.equals(f[i].getPatente()))){
         i++;
      } 
      if (f[i].getPatente().equals(patente)){
          return true;
      }
      else{ return false;
        }
    }
      
      
      
    //eliminar micro con patente igual a la recibida (recibe parametro patente)
public void eliminarMicro(String patente) {
      int i=0;
      while((i<cantMicros)&& !(patente.equals(f[i].getPatente()))){
         i++;
      }
      if (f[i].getPatente().equals(patente)) { // Si encontraste la patente
        // Mover todos los micros posteriores una posición hacia atrás
        for (int j = i; j < cantMicros - 1; j++) {
            f[j] = f[j + 1];
        }

        f[cantMicros - 1] = null; // Eliminar la última posición
        cantMicros--; // Decrementar la cantidad de micros en la flota
      } 
        }
        
public Micro buscarMicroPatente(String patente ) {
      int i=0;
      while((i<cantMicros)&& !(patente.equals(f[i].getPatente()))){
         i++;
      } 
      if  (i!=15) {//encontro patente
      return f[i];
        }
      else {
          return null;
      } 
    }   
    
public Micro buscarMicroDestino(String destino ) {
      int i=0;
      while((i<15)&& !(destino.equals(f[i].getDestino()))){
         i++;
      } 
      if  (i!=15) {//encontro patente
      return f[i];
        }
      else {
          return null;
      } 
    }   
 
}
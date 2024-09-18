public class Micro {
    private String patente;
    private String destino;
    private String horaSalida;
    private int asientos; 
    private boolean[] v;
    private int asientosOcupados;
    
    public Micro(String unPatente, String unDestino , String unhoraSalida ){
        patente = unPatente;
        destino = unDestino;
        horaSalida = unhoraSalida; 
        asientosOcupados=0;    
        asientos=20;
        v = new boolean [asientos];
        for(int i=0; i<asientos; i++){
            v[i]=false; //inicializo vector en false (asientos desocupados)
        }
        
    }
    
    public Micro(){
     
    }

    public String gethoraSalida() {
        return horaSalida;
    }
    
    public String getpatente() {
        return patente;
    }

    public void setHoraSalida(String unhoraSalida) {
        horaSalida = unhoraSalida;
    }

    public void setpatente(String unpatente) {
        patente = unpatente;
    }

    //devolver cant de asientos ocupados:
    public int getAsientosOcupados() {
        return asientosOcupados;
    }
    
    //devolver si el micro esta lleno:
    public boolean microLleno() {
        return (asientosOcupados==asientos);
    }
    
    //validar un número de asiento recibido como parámetro:
    public boolean asientoExiste(int unAsiento) {
        if(unAsiento<=asientos){
            return true;
        }
        else return false;
        }
        
    //devolver el estado de un nro. de asiento válido recibido como parámetro:
    public String estadoAsiento(int unAsiento) {
        if (asientoExiste(unAsiento)==true){ //primero valido que el num del asiento
                                       //exista para que no busque en el vector
                                       //una posicion incorrecta
           if(v[unAsiento]==true){
               return ("ocupado");
           }
           else
             return  ("libre");
        }
        return("el asiento no existe");
        }
    
        
    //ocupar un nro. de asiento válido recibido como parámetro
    // sumar 1 al atributo "asientosOcupados"
    public void ocuparAsiento(int unAsiento) {
        if (asientoExiste(unAsiento)){
           v[unAsiento]=true;
           asientosOcupados++;
        }
    }
        
    //liberar un nro. de asiento válido recibido como parámetro
    public void liberarAsiento(int unAsiento) {
        if (asientoExiste(unAsiento)){
          v[unAsiento]=false;
        }
    }
    
    //devolver el nro. del primer asiento libre (devuelve -1 si no hay asientos libres)
    public int primerAsientoLibre() {
        boolean libre=false;
        int i=0;
        int num=-1; //retorna -1 si no hya asientos libres
        while((libre==false)&&(i<asientos)){
            if(v[i]==true){ //asiento ocupado
                i++;
            }
            else
              if(i<asientos){ //asiento desocupado
                  num= i;
                  libre=true;
              }
        }
        return num;
        }

   
}
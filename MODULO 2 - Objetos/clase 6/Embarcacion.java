public class Embarcacion extends Vehiculo {
    private String nombre;
    private int codRey;
    private double eslora; 
    private double tonelaje;
    private double valorD;

    
    public Embarcacion(Propietario propietario, int añoF, double importeB,String nombre, int codRey, double eslora, double tonelaje, double valorD){
        super(propietario,añoF,importeB);
        this.nombre = nombre;
        this.codRey = codRey;
        this.eslora = eslora; 
        this.tonelaje= tonelaje;
        this.valorD=valorD;
    }
    
    public Embarcacion (){
     
    }

      public double getTonelaje() {
        return tonelaje;
    }

    public double getValorD() {
        return valorD;
    }
 
    public int getCodRey() {
        return codRey;
    }

    public double getEslora() {
        return eslora;
    }

    public String getNombre() {
        return nombre;
    }

       public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    public void setvalorD(double valorD) {
        this.valorD = valorD;
    }

    public void setcodRey(int codRey) {
        this.codRey = codRey;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public double calcularImporte() {
        double aux = super.getImporteB();
        if (valorD<6000){
            aux+= valorD*0.04;
        }
        else 
        if ((valorD>=6000)&& (valorD<=180000)){
            aux += valorD*0.02;
        }
        else{
            aux+= valorD*0.05;
        }
        return aux;
        
    }
    
    @Override
    public String toString(){
        return super.toString()+",nombre: "+ nombre+ ",eslora: "+eslora+", codigo rey: "+codRey+", valor de la embarcacion: "+valorD+",tonelaje: "+tonelaje+",imoprte mensual final: "+this.calcularImporte();
    }
}

public abstract class Localidad {
    private int id;
    private int butaca; 
    private int fila;
    private String platea;
    private Comprador comprador;
    private String metodoP;

    
    public Localidad( int id,int fila, int butaca,String platea, Comprador comprador,String metodP){
        this.id = id;
        this.butaca = butaca; 
        this.fila= fila; 
        this.platea= platea;
        this.comprador=comprador;
        this.metodoP = metodoP;
    }
    
    public Localidad (){
     
    }

      public int getFila() {
        return fila;
    }

    public Comprador getComprador() {
        return comprador;
    }
 
    public int getId() {
        return id;
    }

    public int getButaca() {
        return butaca;
    }
    
    public String getMetodoP() {
        return metodoP;
    }
    
    public String getPlatea() {
        return platea;
    }
    
    public void setMetodoP(String metodoP) {
        this.metodoP = metodoP;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setButaca(int butaca) {
        this.butaca = butaca;
    }

    public void setPlatea(String platea) {
        this.platea = platea;
    }
    
    public abstract double calcularGasto();
    
    public String toString(){
        return "Comprador: "+comprador.toString()+" , identificatorio: "+id+" butaca: "+butaca+" fila: "+fila+" platea: "+platea+" metodo de pago: "+metodoP;
    }
}
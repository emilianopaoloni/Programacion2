public class Comunes extends Localidad{
    private boolean entradaF;
    private double costoImp;
    

    public Comunes(int id,int fila, int butaca,String platea, Comprador comprador,String metodP,boolean entradaF, double costoImp){
        super(id, fila,  butaca, platea,  comprador, metodP);
        this.entradaF = entradaF;
        this.costoImp = costoImp; 
    }
    
    public Comunes(){
     
    }

    public boolean getentradaF() {
        return entradaF;
    }
    
     public double getcostoImp() {
        return costoImp;
    }

    public void setentradaF(boolean entradaF) {
        this.entradaF = entradaF;
    }
    
    public void setcostoImp(double costoImp) {
        this.costoImp = costoImp;
    }
    
    public double calcularGasto(){
        double tot =0;
        double precioBase = PrecioPorFilayPorPlatea.obtenerPrecioBaseEntrada(super.getFila(), super.getPlatea());
        if (entradaF == true ){    //es fisica
            tot= costoImp + precioBase;
        }
        else{
            tot= 2400 + precioBase;  //entrada digital
        }
        if(super.getMetodoP().equals("tarjeta credito")){
            tot+=tot*0.08;   //recarga
        }
        else{
            tot-=tot*0.025;    //bonificacion
        }
        return tot;
    
    }
    
    public String toString(){
        return super.toString()+"entrada fisica: "+entradaF+", costo de impresion: "+costoImp;
    }
    
    
}
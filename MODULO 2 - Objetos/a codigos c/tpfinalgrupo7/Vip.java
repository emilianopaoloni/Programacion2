public class Vip extends Localidad{
    private boolean especial;
    private double costoV;
    

    public Vip(int id,int fila, int butaca,String platea, Comprador comprador,String metodP,boolean especial, double costoV){
        super(id, fila,  butaca, platea,  comprador, metodP);
        this.especial = especial;
        this.costoV = costoV; 
    }
    
    public Vip(){
     
    }

    public boolean getEspecial() {
        return especial;
    }
    
     public double getcostoV() {
        return costoV;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public void setcostoV(double costoV) {
        this.costoV = costoV;
    }
    
    public double calcularGasto(){
        double tot =0;
        double precioBase = PrecioPorFilayPorPlatea.obtenerPrecioBaseEntrada(super.getFila(), super.getPlatea());
        if (especial == true ){
            tot= costoV + precioBase;
        }
        if (super.getButaca()<=5){
            tot+=precioBase*0.15;
        }
        if(super.getMetodoP().equals("credito")){
            tot+=tot*0.10;   //recarga
        }
        else{
            tot-=tot*0.05;    //bonificacion
        }
        return tot;
    
    }
    
    public String toString(){
        return super.toString()+"compro vip: "+especial+", costoV: "+costoV;
    }
    
    
}
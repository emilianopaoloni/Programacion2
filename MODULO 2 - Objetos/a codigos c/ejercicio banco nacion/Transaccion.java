public class Transaccion  {

    private double monto;
    private String concepto; 
   
    
    
    public Transaccion( double monto, String concepto){
        this.monto = monto;
        this.concepto = concepto; 
    
    }

    
    public Transaccion (){
     
    }
    
    public void setMonto(double monto) {
        this.monto= monto;
    }
    
    public void setConcepto(String concepto) {
        this.concepto= concepto;
    }
    
    public double getMonto() {
        return monto;
    }

    public String getConcepto() {
        return concepto;
    }
    
    public String informarTransaccion() {
        return "concepto: "+concepto+" monto: "+monto;
    }
    
}
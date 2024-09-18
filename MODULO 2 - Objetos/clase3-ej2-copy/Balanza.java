public class Balanza {
    private double monto;
    private int cantI;
    
    
    public Balanza(){
    }
    
    public void setMonto( double unMonto) {
        monto = unMonto;
    }
    public void setCant( int cant) {
        cantI = cant;
    }
    public double getMonto() {
        return monto;
    }
    public int getCant() {
        return cantI;
    }
    
     public void inciarCompra() {
        monto = 0;
        cantI= 0;
    }
    public void registrarProd(double pesokg, double preciokg) {
        monto += (pesokg*preciokg);
        cantI++;
    }
    public String devolverResumenDeCompra() {
        return "Total a pagar "+monto+" por la compra de "+cantI+" productos"; 
    }
    
    
   
    }
    
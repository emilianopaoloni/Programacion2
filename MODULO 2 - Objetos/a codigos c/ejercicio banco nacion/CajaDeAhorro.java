public class CajaDeAhorro extends CuentaBancaria {
    private boolean plazoFijo;
    private int tarjetasCredito; 
    private Transaccion [] transacciones;
    
    
    public CajaDeAhorro( int nroCuenta,String alias, int cbu,double dinero, Propietario propietario, boolean plazoFijo, int tarjetasCredito){
        super(  nroCuenta, alias,  cbu, dinero,  propietario);
        this.plazoFijo = plazoFijo;
        this.tarjetasCredito = tarjetasCredito; 
        transacciones= new Transaccion [5];
        for(int i=0; i<5; i++){
            transacciones[i]= null;
        }
    }

    
    public CajaDeAhorro (){
     
    }

  public void agregarTransaccion(String concepto, double monto) {
      int i=0;
      while ((transacciones[i]!=null)&&(i<5)){
          i++;                //busco primer trnsaccion vacia en el vector
      }
      transacciones[i].setMonto(monto);        //agrego la transaccion
      transacciones[i].setConcepto(concepto);
}  


      public String getTransacciones() {
          
          
          String totTransacciones="";
        for (int i=0; i<5; i++){
                totTransacciones= totTransacciones +" "+ transacciones[i];
        }
    
    return totTransacciones;
}

    public boolean getPlazoFijo() {
        return plazoFijo;
    }

    public int getTarjetasCredito() {
        return tarjetasCredito;
    }


    public void setPlazoFijo(boolean plazoFijo) {
        this.plazoFijo = plazoFijo;
    }

    public void setTarjetasCredito(int tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }

    public double calcularImpuesto(){
        double impuestoTot=0;
        if(plazoFijo==true){ //cliente tiene plazo fijo
        impuestoTot+= super.getDinero()*0.002;
        }
        if(tarjetasCredito==1){
            impuestoTot+=1000;
        }
        else
          if (tarjetasCredito==2){
              impuestoTot+=1800;
          }
        
        //chequear compra de dolares
        for(int i=0; i<5; i++){
            if(transacciones[i].getConcepto().equals("DEB.CPRA.VTA")){
                impuestoTot+= transacciones[i].getMonto()*0.3 + transacciones[i].getMonto()*0.35;
            }
        }
        return impuestoTot;
    }
        
    @Override
    public String toString(){
        return super.toString()+" tiene plazoFijo: "+ plazoFijo+ "cantidad de tarjetas de credito: "+tarjetasCredito+" ultimas 5 transacciones: "+getTransacciones()+" impuestos a pagar: "+calcularImpuesto();
    }
}
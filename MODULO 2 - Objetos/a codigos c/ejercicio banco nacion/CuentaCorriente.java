public class CuentaCorriente extends CuentaBancaria {

    private double limite;
    private int cheques; 
   
    
    
    public CuentaCorriente( int nroCuenta,String alias, int cbu,double dinero, Propietario propietario, double limite, int cheques){
        super(  nroCuenta, alias,  cbu, dinero,  propietario);
        this.limite = limite;
        this.cheques = cheques; 
    
    }

    
    public CuentaCorriente (){
     
    }
    

    
    public double getLimite() {
        return limite;
    }

    public int getcheques() {
        return cheques;
    }


    public void setlimite(double limite) {
        this.limite = limite;
    }

    public void setcheques(int cheques) {
        this.cheques = cheques;
    }

    
    public double calcularImpuesto(){
        double impuestoTot=0;
        if(super.getDinero()<10000){
                 impuestoTot+= limite*0.05;
            if(cheques>10){
                  impuestoTot+= cheques*0.005;
                }
              else 
              if(cheques<10){
                  impuestoTot+= cheques*0.002;
              }
            }
            
            else{ //si el dinero en la cuenta es mayor a 10000
              impuestoTot+= super.getDinero()*0.05;
              if(cheques>10){
                  impuestoTot+= cheques*0.005;
                }
              else {
              if(cheques<10){
                  impuestoTot+= cheques*0.002;
              }
            }
            }
        return impuestoTot;
    }
    
  
    
    @Override
    public String toString(){
        return super.toString()+" tiene un limite de: "+ limite+ "cantidad de cheques emitidos: "+cheques;
    }
}
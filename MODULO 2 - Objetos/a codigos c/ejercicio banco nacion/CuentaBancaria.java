public abstract class CuentaBancaria {
    private int nroCuenta;
    private int cbu; 
    private String alias;
    private double dinero;
    private Propietario propietario;

    
    public CuentaBancaria( int nroCuenta,String alias, int cbu,double dinero, Propietario propietario){
        this.nroCuenta = nroCuenta;
        this.cbu = cbu; 
        this.alias= alias; 
        this.dinero= dinero;
        this.propietario=propietario;
    }
    
    public CuentaBancaria (){
     
    }

      public String getAlias() {
        return alias;
    }

    public Propietario getPropietario() {
        return propietario;
    }
 
    public int getnroCuenta() {
        return nroCuenta;
    }

    public double getCbu() {
        return cbu;
    }
    
    public double getDinero() {
        return dinero;
    }


       public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    public abstract double calcularImpuesto();
    
    @Override
    public String toString(){
        return "nombre del propietario: "+propietario.toString()+" ,codigo nroCuentaentificatorio del CuentaBancaria: "+nroCuenta+" impuestos: "+calcularImpuesto();
    }
}
public class Show {
    private boolean soldOut;
    private int numS;    //0,1,2
    private Localidad [] loc;     //vec de clases dimF 10
    private String fecha;
    private int dimL;
    
    public Show(boolean soldOut, int numS,String fecha){
        this.soldOut = soldOut;
        this.numS = numS;
        this.fecha = fecha;
        loc = new Localidad [10];
        for (int i=0;i<10;i++){
            loc[i] = null;
        }
        dimL = 0;
    }
    
    public Show(){
     
    }

    public int getNumS() {
        return numS;
    }

    public boolean getSoldOut() {
        return soldOut;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setNumS(int numS) {
        this.numS = numS;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
    
    public void agregarLoc(Localidad l) {
         if (dimL < 10){
         loc [dimL] = l;
         dimL++;
    }
    }
    
    public boolean preventa(){
        boolean exito= false;
        if ((fecha.equals("3/8/2023"))||(fecha.equals("4/8/2023"))){
            exito = true;
        }
        return exito;
    }
    
    public double calcularTot (){
        double tot= 0;
        if (preventa()== true){      //es en llos primeros shows
        for (int i=0;i<10;i++){
            tot = loc[i].calcularGasto() - loc[i].calcularGasto()*0.035;
        } //bonificacion por preventa 
    }
    else{
        for (int i=0;i<10;i++){
            tot = loc[i].calcularGasto();
    }
    }   
        return tot;   //retorno el total a cobrar por el banco
    }
    
    public String informarLoc(){
        String tot = " ";
        for (int i=0;i<10;i++){
            tot += loc[i].toString();
        }
        return tot;
    }
    
    public String toString(){
        String aux; 
        aux = "gasto total del show: "+this.calcularTot ()+"soldOut: " + soldOut + ", num Show: " + numS+ "fecha: "+fecha ;
        return aux;
    }
        
}

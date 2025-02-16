public class Ejemplar {
    private String resumen;
    private int id;
    private int cantP; 
    private int añoP;
    private Responsable resp;

    
    public Ejemplar(String resumen, int id,int añoP, int cantP, Responsable resp){
        this.resumen = resumen;
        this.id = id;
        this.cantP = cantP; 
        this.añoP= añoP;  
        this.resp=resp;
    }
    
    public Ejemplar (){
     
    }

      public int getAñoP() {
        return añoP;
    }

    public Responsable getResp() {
        return resp;
    }
 
    public int getId() {
        return id;
    }

    public double getCantP() {
        return cantP;
    }

    public String getResumen() {
        return resumen;
    }

       public void setAñoP(int añoP) {
        this.añoP = añoP;
    }

    public void setResp(Responsable resp) {
        this.resp = resp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setcantP(int cantP) {
        this.cantP = cantP;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    @Override
    public String toString(){
        return "nombre del responable: "+resp.toString()+" ,codigo identificatorio del ejemplar: "+id;
    }
}

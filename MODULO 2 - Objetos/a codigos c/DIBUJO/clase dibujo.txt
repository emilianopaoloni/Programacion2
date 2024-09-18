public class Dibujo {
    private String titulo;
    private String autor;
    private Figura [] vecFigura;
    private int cantF;
    
    
    
    public Dibujo(){
    }
    
    public Dibujo(String titulo,String autor,int cantF){
        this.titulo = titulo;
        this.autor = autor;
        this.cantF = cantF;
        this.vecFigura = new Figura [cantF];
        for (int i=0;i<cantF;i++){
            vecFigura [i] = null;
        }
        
        
    }
    
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getCantF() {
        return cantF;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCantF(int cantF) {
        this.cantF = cantF;
    }
    
    public void agregarFigura( Figura f) {
        int dimL=0;
        while ((vecFigura[dimL]!= null)&&(dimL<cantF)){
            dimL++;
        }
        if (dimL<cantF) {
            vecFigura[dimL]=f;
        }
    }
    
    public boolean estaLleno (){
        int dimL=0;
        while ((vecFigura[dimL]!= null)&&(dimL<cantF)){
            dimL++;
        }
        int aux = cantF -1;
        return (dimL==aux);
    }
    
    public void mostrar (){
        for (int i=0; i<cantF; i++) {
            System.out.println(vecFigura[i].dibujar());
        }
    }
    
   
    
    
    
    
    
    
    
}




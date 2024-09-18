public class Libro extends Ejemplar {
    private String titulo;
    private int capitulos;
    private boolean edicionBolsillo;
    

    public Libro(String resumen, int id, int cantP, int añoP, Responsable resp, String titulo, int capitulos, boolean edicionBolsillo){
        super( resumen,  id,  cantP,  añoP,  resp);
        this.titulo = titulo;
        this.capitulos = capitulos; 
        this.edicionBolsillo = edicionBolsillo;
    }
    
    public Libro(){
     
    }

    public String getTitulo() {
        return titulo;
    }
    
     public int getCapitulos() {
        return capitulos;
    }
    
    public boolean getEdicionBolsillo() {
        return edicionBolsillo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    
     public void setEdicionBolsillo(boolean edicionBolsillo) {
        this.edicionBolsillo = edicionBolsillo;
    }
    
    public String toString(){
        return (super.toString()+"titulo libro: "+titulo);
    }
    
    
}
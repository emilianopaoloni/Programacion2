public  class Punto{
    private int x;
    private int y;
    
    
    
    public Punto(){
        x=0;
        y=0;
    }
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public void desplazar(int dx, int dy){
        x+=dx;
        y+=dy;
    }
     public void cambiarPos(int x, int y){
        this.x=x;
        this.y=y;
    }
     public String toString(){
        return ("Punto: ("+x+","+y+")");
    }
    }
    
    
    
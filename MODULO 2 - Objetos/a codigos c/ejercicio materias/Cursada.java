public  class Cursada extends MateriaAprobada {
    private double autoevaluaciones [] ;
    
    public Cursada( Alumno alumno,String codigo,String semestre){
       super(codigo, semestre, alumno);
       autoevaluaciones= new double [8];
       for(int i=0; i<8; i++){
            autoevaluaciones[i]= -1; //valor -1 (vacio)
        }
    }
     
    
    public Cursada(){
       autoevaluaciones= new double [8];
       for(int i=0; i<8; i++){
            autoevaluaciones[i]= -1; //valor -1 (vacio)
        }
    }
    

      public void agregarAutoevaluacion(double nota) {
         int i=0;
      while ((autoevaluaciones[i]!=-1)&&(i<8)){
          i++;                //busco primer autoev vacia en el vector
      }
      autoevaluaciones[i]= nota;    
    }
    
      public int getCantAutoev() {
          int cant=0;
         for(int i=0; i<8; i++){
           if ( autoevaluaciones[i]!=-1){
               cant+=1;
            }
    }
    return cant;
}

      public double getPromedioNotas() {
          int promedio=0;
         for(int i=0; i<8; i++){
           if ( autoevaluaciones[i]!=-1){
               promedio+=autoevaluaciones[i];
            }
        }  
        promedio= promedio/getCantAutoev();
        
        return promedio;
    }


    public  double calcularPromedio(){
        double promedio=0;
        if(getCantAutoev()<=4) {
            promedio=4;
        }
        else 
          if(getCantAutoev()<4){
              promedio= getPromedioNotas();
          }
        return promedio;
    }
    
    @Override
    public String toString(){
        return super.toString()+" promedio materia: "+calcularPromedio();
    }
}
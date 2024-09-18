public  class Final extends MateriaAprobada {
    private double nota ;
    private boolean promocion ;
    private Fecha fecha ;
    
    
    public Final(String codigo,String semestre, Alumno alumno, double nota, boolean promocion, Fecha fecha){
       super(codigo, semestre, alumno);
       this.nota= nota;
       this.promocion= promocion;
       this.fecha=fecha;
    }
    
    public Final(){
      
    }

     public double getNota() {
        return nota;
    }
    
     public boolean getPromocion() {
        return promocion;
    }
    

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    
    public  double calcularPromedio(){
        double promedio=nota;
        if(promocion==true) {
            promedio+=2;
        }
        else
        if(super.getSemestre().equals("primero")){ //materia del 1° semestre
          if((fecha.getAño()==2022)&&(fecha.getMes()==8)&&(fecha.getDia()==15)){
              promedio+=1;
          }
          else
            if((fecha.getAño()==2022)&&(fecha.getMes()==9)&&(fecha.getDia()==17)){
              promedio+=1;
          }
        }
        if(super.getSemestre().equals("segundo")){
          if((fecha.getAño()==2023)&&(fecha.getMes()==2)&&(fecha.getDia()==15)){
              promedio+=1;
          }
          else
            if((fecha.getAño()==2023)&&(fecha.getMes()==03)&&(fecha.getDia()==17)){
              promedio+=1;
          }  
        }
        return promedio;
    }
    
    public void agregarAutoevaluacion(double nota){
        
    }

    
    @Override
    public String toString(){
        return super.toString()+" nota materia: "+nota+" promociono: "+promocion+" fecha de aprobacion: "+fecha.toString()+"  promedio materia: "+calcularPromedio();
    }
}
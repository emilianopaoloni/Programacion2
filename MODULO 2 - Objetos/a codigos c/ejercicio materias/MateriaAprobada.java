public abstract class MateriaAprobada {
    private String codigo;
    private String semestre;
    private Alumno alumno;

    
    public MateriaAprobada( String codigo,String semestre, Alumno alumno){
        this.codigo = codigo;
        this.semestre= semestre; 
        this.alumno=alumno;
    }
    
    public MateriaAprobada (){
     
    }

      public String getSemestre() {
        return semestre;
    }

    public Alumno getAlumno() {
        return alumno;
    }
 
    public String getCodigo() {
        return codigo;
    }

       

       public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public abstract double calcularPromedio();
    
    public abstract void agregarAutoevaluacion(double nota);
    
    @Override
    public String toString(){
        return NóminaDeMateriasIC.obtenerNombre(codigo)+"("+codigo+")"+" semestre:"+semestre+" informacion alumno: "+alumno.toString();
    }
}
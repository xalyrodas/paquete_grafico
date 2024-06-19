package Estudiantes;

public class cursos {
    private String materia;
    private String categoria;
    private int periodo;

    cursos(String materia, String categoria,int periodo){
        this.materia= materia;
        this.categoria= categoria;
        this.periodo= periodo;
    }
        public String getMateria() {
            return materia;
        }
        public String getCategoria() {
            return categoria;
        }
        public int getPeriodo() {
            return periodo;
        }
    @Override
    public  String toString() {
        return "materia:" +materia +"categoria: " + categoria + "periodo: " + periodo;
    }


}

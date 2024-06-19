package Estudiantes;

public class Escuela {
    private String nombre;
    private String correo;
    private String carrera;
    private int edad;
    private boolean solvencia;

    Escuela(String nombre, String correo, String carrera, int edad, boolean solvencia){
        this.nombre= nombre;
        this.correo= correo;
        this.carrera= carrera;
        this.edad= edad;
        this.solvencia= solvencia;

    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
    public boolean getSolvencia() {
        return solvencia;
    }
    @Override
    public  String toString() {
        return "nombre:" +nombre +"correo: " + correo + "carrera: " + carrera +"edad: "+ edad + "solvencia: "+ solvencia;
    }
}

package Estudiantes;

public class primero_primaria {

    public static void alumnos(){
        //alumnos
        Escuela a1 = new Escuela("pepe", "pepe@gmail.com","",5,true);
        Escuela a2 = new Escuela("lola", "lola@gmail.com","",5,true);
        Escuela a3 = new Escuela("rene", "rene@gmail.com","",5,true);
        Escuela a4 = new Escuela("angela", "angela@gmail.com","",5,true);
        Escuela a5 = new Escuela("miguel", "miguel@gmail.com","",5,true);
        //cursos
        cursos m1 = new cursos("mate","ciencias",1);
        cursos m2 = new cursos("lenguaje","ciencias",1);
        cursos m3 = new cursos("sociales","ciencias",1);
        cursos m4 = new cursos("artes","ciencias",1);
        cursos m5 = new cursos("ciencias naturales","ciencias",1);

        //alumno
        System.out.println("estuidiantes");
        System.out.println("........................");
        System.out.println(a1.getNombre());
        System.out.println(a1.getCorreo());


        System.out.println("........................");
        System.out.println(a2.getNombre());
        System.out.println(a2.getCorreo());


        System.out.println("........................");
        System.out.println(a3.getNombre());
        System.out.println(a3.getCorreo());


        System.out.println("........................");
        System.out.println(a4.getNombre());
        System.out.println(a4.getCorreo());


        System.out.println("........................");
        System.out.println(a5.getNombre());
        System.out.println(a5.getCorreo());

        //curso
        System.out.println("........................");
        System.out.println("cursos");
        System.out.println("........................");
        System.out.println(m1.getCategoria());
        System.out.println(m1.getMateria());
        System.out.println(m1.getPeriodo());


        System.out.println("........................");
        System.out.println(m2.getCategoria());
        System.out.println(m2.getMateria());
        System.out.println(m2.getPeriodo());


        System.out.println("........................");
        System.out.println(m3.getCategoria());
        System.out.println(m3.getMateria());
        System.out.println(m3.getPeriodo());


        System.out.println("........................");
        System.out.println(m4.getPeriodo());
        System.out.println(m4.getMateria());
        System.out.println(m4.getCategoria());


        System.out.println("........................");
        System.out.println(m5.getCategoria());
        System.out.println(m5.getMateria());
        System.out.println(m5.getPeriodo());


    }
}

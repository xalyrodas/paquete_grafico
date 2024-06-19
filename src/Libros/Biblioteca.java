package src.Libros;

public class Biblioteca {

    public static void programa(){
        System.out.println("biblioteca");

    libro libro1 = new libro("libro1","PEPE","1995");
    libro libro2 = new libro("libro 222","LOLA","1987");
    libro libro3 = new libro("DON QUIJOTE DE LA MACHA","Miguel cervantes","1605");
    libro libro4 = new libro("Matar a un ruiseñor","Harper Lee","1960");
    libro libro5 = new libro("Cien años de soledad ","Gabriel García Márquez","1967");
    libro libro6 = new libro("1984","George Orwell","1949");
    libro libro7 = new libro(" Orgullo y prejuicio","Jane Austen","1813");
    libro libro8 = new libro("Crimen y castigo","Fiódor Dostoyevski","1866");
    libro libro9 = new libro("La Odisea","Autor: Homero","el siglo VIII a.C.");
    libro libro10 = new libro("En el camino","Jack Kerouac","1957");


        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());

        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());

        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        System.out.println(libro1.toString());
    }
}

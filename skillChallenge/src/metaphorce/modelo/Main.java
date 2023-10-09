package metaphorce.modelo;

import metaphorce.vista.GestorPelicula;
import metaphorce.vista.Pelicula;

import java.util.List;

/**
 * Main class
 *
 * @author larag
 * @version javaSE 17
 */
public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();
        Pelicula pelicula;
        /*adding some nice movies*/
        pelicula = new Pelicula(1, "Sucker Punch", false);
        gestor.addMovie(pelicula);

        pelicula = new Pelicula(2, "SouthPaw", true);
        gestor.addMovie(pelicula);

        pelicula = new Pelicula(3, "Book Thief", false);
        gestor.addMovie(pelicula);

        pelicula = new Pelicula(4, "Barbie", false);
        gestor.addMovie(pelicula);

        pelicula = new Pelicula(5, "Boogeyman", true);
        gestor.addMovie(pelicula);

        pelicula = new Pelicula(6, "Joy Ride", true);
        gestor.addMovie(pelicula);

        /*printing the whole array*/
        print(gestor.getMovies());

        /*removing the 4th element*/
        gestor.deleteMovie(4);

        /*changing state for the 1st element*/
        gestor.setTrue(1);

        /*consulting the non-available movies*/
        print(gestor.getObtainable());
    }

    public static void print(List<Pelicula> lista){
        for (Pelicula pelicula1 : lista)
        {
            System.out.println(pelicula1.getId());
            System.out.println(pelicula1.getName());
            System.out.println(pelicula1.getState());
        }
    }

}

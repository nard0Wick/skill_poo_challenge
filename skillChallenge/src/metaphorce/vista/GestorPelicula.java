package metaphorce.vista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**Represents a movie administrator
 * @author larag
 * @version javaSE 17
 */
public class GestorPelicula {
    List<Pelicula> movies = new ArrayList();
    List<Pelicula> obtainable = new ArrayList();
    List<Pelicula> unobtainable = new ArrayList();

    /**Add an instance of the pelicula class into an arrayList
     * @param pelicula an instance of pelicula class
    */
    public void addMovie(Pelicula pelicula) {
        movies.add(pelicula);
    }

    /**Delete an object of the array if it matches with the id provided
     * @param id an attribute from pelicula class
     */
    public void deleteMovie(int id) {
        for(Pelicula pelicula : movies) {
            if(pelicula.getId() == id) {
                movies.remove(pelicula);
                break;
            }

        }
    }

    /**Set attribute's state from whatever value to true
     * @param id an attribute from pelicula class
     */
    public void setTrue(int id){
        for(Pelicula pelicula : movies) {
            if(pelicula.getId() == id) {
                pelicula.setState(true);
                break;
            }
        }
    }

    /**Get method
     * @return movies's array
     */
    public List<Pelicula> getMovies() {
        return movies;
    }

    /**Get method
     * @return obtainable's array
     */
    public List<Pelicula> getObtainable() {
        this.setObtainable();
        return obtainable;
    }

    /**Fill obtainable array with all movies that had a non-false state
     */
    public void setObtainable() {
        Iterator<Pelicula> iterator = movies.iterator();
        while(iterator.hasNext()) {
            Pelicula pelicula = iterator.next();
            if(pelicula.getState()) {
                obtainable.add(pelicula);
            }

        }
    }

    /**Get method
     * @return unobtainable's array
     */
    public List<Pelicula> getUnobtainable() {
        this.setUnobtainable();
        return unobtainable;
    }

    /**Fill obtainable array with all movies that had a false state
     */
    public void setUnobtainable() {
        Iterator<Pelicula> iterator = movies.iterator();
        while(iterator.hasNext()) {
            Pelicula pelicula = iterator.next();
            if(!pelicula.getState()) {
                unobtainable.add(pelicula);
            }

        }
    }

}


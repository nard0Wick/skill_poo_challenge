package metaphorce.vista;
/**Represents a generic class
 * @author larag
 * @version javaSE 17
 */
public class Pelicula {
    int id;
    String Name;
    Boolean State;

    public Pelicula(int id, String name, Boolean state) {
        this.id = id;
        Name = name;
        State = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getState() {
        return State;
    }

    public void setState(Boolean state) {
        State = state;
    }
}

import java.util.Comparator;

public class ComparaApellido implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getApellido().compareTo(p2.getApellido());
    }
}

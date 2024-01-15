import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Claudio", "Quinteros"));
        lista.add(new Persona("Aldo", "Guizardi"));
        lista.add(new Persona("Bin", "Valencia"));
        lista.add(new Persona("Claudio", "Marciello"));
        lista.add(new Persona("Ricardo", "Iorio"));

        System.out.println("\t");
        System.out.println("-----------------------------------------------------------------");
        //Lista ordenada por nombre asc
        System.out.println("Lista ordenada por nombres: ");
        Collections.sort(lista, new ComparaNombre() {
        });
        for (Persona pers : lista) {
            System.out.println(pers.getNombre() + " " + pers.getApellido());
        }
        System.out.println("-----------------------------------------------------------------");
        //Lista ordenada por apellido asc
        System.out.println("Lista ordenada por apellidos asc: ");
        Collections.sort(lista, new ComparaApellido() {
        });
        for (Persona pers : lista) {
            System.out.println(pers.getNombre() + " " + pers.getApellido());
        }

        System.out.println("-----------------------------------------------------------------");
        //Lista ordenada por apellido desc
        System.out.println("Lista ordenada por apellidos desc: ");
        Collections.sort(lista, new ComparaApellido().reversed());
        {
        }
        for (Persona pers : lista) {
            System.out.println(pers.getNombre() + " " + pers.getApellido());
        }
        System.out.println("-----------------------------------------------------------------");

            }

    }
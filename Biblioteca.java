import java.util.ArrayList;
import java.util.List;
class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void imprimirInformacionLibros() {
        for (Libro libro : libros) {
            libro.imprimirInformacion();
            System.out.println("------------------------------");
        }
    }
}

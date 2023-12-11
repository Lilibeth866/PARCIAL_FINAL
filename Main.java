public class Main {
    public static void main(String[] args) {
        LibroFisico libroFisico1 = new LibroFisico("La Cenicienta", "Karla Morrinson", 1974, 50);
        LibroElectronico libroElectronico1 = new LibroElectronico("Python Basico", "Jane Smith", 2022, "PDF");

        LibroFisico libroFisico2 = new LibroFisico("Por Amor", "Scarlet wtren", 2020, 400);
        LibroElectronico libroElectronico2 = new LibroElectronico("Tu y Yo", "Bruno XXX", 2018, "EPUB");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroElectronico2);

        biblioteca.imprimirInformacionLibros();
    }
}

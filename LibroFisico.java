class LibroFisico extends Libro {
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, int anoPublicacion, int numeroPaginas) {
        super(titulo, autor, anoPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Numero de Paginas: " + numeroPaginas);
        System.out.println("Tipo: Libro Fisico");
    }
}

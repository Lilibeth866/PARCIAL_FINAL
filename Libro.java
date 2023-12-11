class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public void imprimirInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anoPublicacion);
    }
}

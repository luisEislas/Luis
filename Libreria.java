class Libreria {
    private String nombre;
    private List<Categoria> categorias;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria c) {
        categorias.add(c);
    }

    public void mostrarInventario() {
        System.out.println("\n=== Librería: " + nombre + " ===");
        for (Categoria c : categorias) {
            c.mostrarProductos();
        }
    }
}
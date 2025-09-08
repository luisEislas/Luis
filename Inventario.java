class Inventario<T> {
    private List<T> categorias;

    public Inventario() {
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(T categoria) {
        categorias.add(categoria);
    }

    public void mostrarInventario() {
        System.out.println("\n===== 📚 INVENTARIO DE LIBRERÍA =====");
        for (T categoria : categorias) {
            if (categoria instanceof Categoria) {
                ((Categoria) categoria).mostrarProductos();
            }
        }
    }
}
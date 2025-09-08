class ProductoLibro extends ProductoAbstracto {
    private String autor;
    private int paginas;

    public ProductoLibro(String nombre, double precio, String codigo, String descripcion,
                         String autor, int paginas) {
        super(nombre, precio, codigo, descripcion);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Autor: " + autor + " | Páginas: " + paginas);
    }
}

class ProductoRevista extends ProductoAbstracto {
    private String edicion;
    private String periodicidad;

    public ProductoRevista(String nombre, double precio, String codigo, String descripcion,
                           String edicion, String periodicidad) {
        super(nombre, precio, codigo, descripcion);
        this.edicion = edicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println("Edición: " + edicion + " | Periodicidad: " + periodicidad);
    }
}

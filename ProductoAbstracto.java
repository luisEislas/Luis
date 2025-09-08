abstract class ProductoAbstracto implements Producto {
    protected String nombre;
    protected double precio;
    protected String codigo;
    protected String descripcion;

    public ProductoAbstracto(String nombre, double precio, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    @Override
    public String getCodigo() { return codigo; }

    @Override
    public String getDescription() { return descripcion; }

    @Override
    public void mostrarProducto() {
        System.out.println("Código: " + codigo + " | Nombre: " + nombre +
                " | Precio: $" + precio + " | Descripción: " + descripcion);
    }
}
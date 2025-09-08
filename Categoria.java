public class Categoria {

    private String nombre;
    private List<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarProductos() {
        System.out.println("\n📂 Categoría: " + nombre);
        for (Producto p : productos) {
            p.mostrarProducto();
        }
    }

    public String getNombre() {
        return nombre;
    }
}


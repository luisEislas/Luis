public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto libro1 = new ProductoLibro("El Quijote", 250.0, "L001", "Novela clásica",
                "Miguel de Cervantes", 800);
        Producto revista1 = new ProductoRevista("National Geographic", 120.0, "R001",
                "Ciencia y naturaleza", "Edición 2023", "Mensual");

        // Crear categorías
        Categoria categoriaLibros = new Categoria("Libros");
        Categoria categoriaRevistas = new Categoria("Revistas");

        // Agregar productos a categorías
        categoriaLibros.agregarProducto(libro1);
        categoriaRevistas.agregarProducto(revista1);

        // Crear inventario genérico
        Inventario<Categoria> inventario = new Inventario<>();
        inventario.agregarCategoria(categoriaLibros);
        inventario.agregarCategoria(categoriaRevistas);

        // Crear librería
        Libreria miLibreria = new Libreria("Librería Central");
        miLibreria.agregarCategoria(categoriaLibros);
        miLibreria.agregarCategoria(categoriaRevistas);

        // Mostrar resultados
        inventario.mostrarInventario();
        miLibreria.mostrarInventario();
    }
}
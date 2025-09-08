import java.util.ArrayList;
import java.util.List;

// ------------------- INTERFAZ -------------------
interface Producto {
    String getNombre();
    double getPrecio();
    String getCodigo();
    String getDescription();
    void mostrarProducto();
}
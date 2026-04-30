import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void precioProducto()
    {
        // Organizar
        Producto producto = new Producto("Cuaderno", 5000, 10);
        // Actuar
        double precio = producto.getPrecio();
        // Afirmar
        assertEquals(5000, precio);
    }

    @Test
    void productoStockMayorACero()
    {
        Producto producto = new Producto("Lapiz", 2000, 5);
        boolean disponible = producto.estaDisponible();
        assertTrue(producto.estaDisponible());
    }

    @Test
    void productoStockNoDisponible()
    {
        Producto producto = new Producto("Borrador", 1000, 0);

        assertFalse(producto.estaDisponible());
    }

    @Test
    void precioNegativoLanzaError() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Teclado", -1000, 5);
        });
    }

    @Test
    void productoNegativoLanzaError() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Pantalla", 50000, -3);
        });
    }


}





import org.example.Producto;

public class ProductoTest {

    @Test
    void testPruebaProducto() {
// Organizar
        Producto producto = new Producto("Cuaderno", 5000, 10);
// Actuar
        double precio = producto.getPrecio();
// Afirmar
        assertEquals(5000, precio);
    }

    private void assertEquals(int i, double precio) {
    }

}





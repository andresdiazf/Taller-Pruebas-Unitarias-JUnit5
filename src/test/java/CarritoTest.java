import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    public  void carritoVacio()
    {
        Carrito carrito = new Carrito();
        assertEquals(carrito.estaVacio(), true);

    }

    @Test
    public void agregarUnProducto()
    {
        Carrito carrito = new Carrito();
        Producto p = new Producto("Manzana", 2.50, 10);
        carrito.agregar(p);
        assertEquals(1, carrito.cantidadDeProductos());
    }

    @Test
        public void totalDosProductos()
    {
        Carrito carrito = new Carrito();
        carrito.agregar(new Producto("Leche", 3.00, 10));
        carrito.agregar(new Producto("Pan",   1.50, 10));
        assertEquals(4.50, carrito.calcularTotal(), 0.001);
    }

    @Test
    public void carritoNoVacio() {
        Carrito carrito = new Carrito();
        carrito.agregar(new Producto("Arroz", 5.00, 10));
        assertFalse(carrito.estaVacio());
    }

    @Test
    public void totalCarritoVacioEsCero() {
        Carrito carrito = new Carrito();
        assertEquals(0.0, carrito.calcularTotal(), 0.001);
    }
}

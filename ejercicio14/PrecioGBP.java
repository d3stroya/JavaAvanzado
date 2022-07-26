package creacionales.factory;
/**
 * Clase que implementa la interfaz precio cuando este está en GBP.
 */
public class PrecioGBP implements Precio {
    @Override
    public double getPrecio() {
        return 2.1;
    }
}

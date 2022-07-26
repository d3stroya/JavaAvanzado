package creacionales.factory;
/**
 * Clase que implementa la interfaz precio cuando este está en USD.
 */
public class PrecioUSD implements Precio {
    @Override
    public double getPrecio() {
        return 0.94;
    }
}

package creacionales.factory;

/**
 * Clase que implementa la interfaz precio cuando este está en EUR.
 */
public class PrecioEUR implements Precio {
    /**
     * Recupera el precio
     * @return el precio en euros
     */
    @Override
    public double getPrecio() {
        return 1.3;
    }
}

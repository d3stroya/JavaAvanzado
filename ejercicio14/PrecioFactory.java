package creacionales.factory;

/**
 * 2. PATRÓN FACTORY: crea una jerarquía de clases y usa una u otra de forma transparente. Cohesiona una jerarquía de clases en una sola.
 * La ventaja es que la instanciación es siempre la misma, solo cambia el parámetro.
  */

public class PrecioFactory {
    // TODO: 2.1. Crear una interfaz que cree el método que hay que implementar
    // TODO: 2.2. Crear clase que implemente la interfaz: Una para el precio en USD y otra para el precio en EUR
    // TODO: 2.3. Implementar el patrón:

    /**
     *  2.3.3. ATRIBUTO
     */
    Precio precio;  // Esta interfaz toma una clase u otra dependiendo del parámetro de entrada en PrecioFactory

    //
    /**
     * 2.3.1. CONSTRUCTOR RPIVADO
     * Constructor oculto para que no se pueda usar desde otra clase.
     */
    private PrecioFactory() {}

    /**
     * 2.3.2. CONSTRUCTOR CON PARÁMETROS
     * @param pais Indica el país en el que se muestra el precio. Permite recuperar una divisa u otra (EUR, GBP o USD)
     */
    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("España")) {
            System.out.println("Españita");
            // Añade clase país
            precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("Reino Unido")) {
            System.out.println("Precio de la beer");
            precio = new PrecioGBP();
        } else {
            System.out.println("Otro país");
            // Añadir clase país --> XXX este comentario sobra XXX
            precio = new PrecioUSD();
        }
    }

    /**
     * para reducir el código y dejarlo más limpio, se "maquilla" el método getprecio. sustituye precio.precio.getprecio() por precio.getprecio().
     * @return devuleve el precio en la divisa adecuada.
     */
    // XXX 2.3.4. Para maquillar precio1.precio.getPrecio() y que no quede tan feo y largo: XXX --> este comentario se explica mejor ahora en las líneas anteriores.
    public double getPrecio() {
        return precio.getPrecio();
    }
}

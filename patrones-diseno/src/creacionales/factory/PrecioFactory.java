package creacionales.factory;
// 2. FACTORY: crear una jerarquía de clases y usar una u otra de forma transparente. Cohesiona una jerarquía de clases en una sola.

public class PrecioFactory {
    // 2.1. Crear una interfaz que cree el método que hay que implementar
    // 2.2. Crear clase que implemente la interfaz
    // Una para el precio en USD
    // Otra para el precio en EUR
    // 2.3. Implementar el patrón:

    // 2.3.3. Atributo
    Precio precio;  // Esta interfaz toma una clase u otra dependiendo del parámetro de entrada en PrecioFactory
    // 2.3.1. Ocultar constructor
    private PrecioFactory() {}

    // 2.3.2. Constructor con parámetros
    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("España")) {
            System.out.println("Españita");
            // Añadir clase país
            precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("Reino Unido")) {
            System.out.println("Precio de la beer");
            precio = new PrecioGBP();
        } else {
            System.out.println("Otro país");
            // Añadir clase país
            precio = new PrecioUSD();
        }
    }

    // 2.3.4. Para maquillar precio1.precio.getPrecio() y que no quede tan feo y largo:
    public double getPrecio() {
        return precio.getPrecio();
    }
}

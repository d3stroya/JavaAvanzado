/**
 * Open-close: crear clases derivadas de una más general para no tener que modificar
 * todo el código, sino solo una línea.
 * Coche y Moto derivan de Vehiculo.
 *
 * Liskov: jerarquía de clases fácil de entender, código reutilizable y clases
 * sustituibles unas por otras. Con el princpio anterior lo hemos hecho.
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo [] vehiculos = {
                new Coche(),
                new Moto()

        };

        impimirPotencia(vehiculos);

        // Liskov
//        Coche vehiculo = new Coche();
        Moto vehiculo = new Moto();
        System.out.println(vehiculo.obtenerPotencia());

    }

    public static void impimirPotencia(Vehiculo []vehiculos) {
        for(Vehiculo vehiculo : vehiculos) {
            // Sin open-close principle
//            if(vehiculo.tipo.equalsIgnoreCase("coche")){
//                System.out.println("1000");
//            } else if(vehiculo.tipo.equalsIgnoreCase("moto")) {
//                System.out.println("500");
//            }

            // Con open-close:
            System.out.println(vehiculo.obtenerPotencia());
        }
    }
}

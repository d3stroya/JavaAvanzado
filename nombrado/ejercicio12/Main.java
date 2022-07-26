package ejercicio12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

    }

    // TODO: 1. Siguiendo las normas de nombrado de la sesión 12, diseña dos funciones limpias.

    /**
     * Añade nombres de tipo string al array list aNombres y devuelve ese nombre.
     */
    ArrayList<String> aNombres = new ArrayList<>();
    public String agregarNombre(String sNombre) {
        aNombres.add(sNombre);
        return sNombre;
    }

    /**
     * Multiplica todos los números enteros que pasemos por parámetro.
     * @param aNumeros Array de números enteros
     * @return Devuleve el resultado
     */
    public static OptionalInt multiplica(int []aNumeros) {
        return Arrays.stream(aNumeros).reduce((a, b) -> a * b);
    }

}

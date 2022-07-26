package creacionales.factory;
/**
 * Se crean instancias de la clase PrecioFactory y se pasa por parámetro el país en el que se muestra el precio.
 * Dicho precio aparecerá en EUR si el parámetro es "España", en USD si es "USA" y en GBP si es "Reino Unido".
 * Luego se recupera el precio y se muestra por pantalla.
 */
public class Main {
    public static void main(String[] args) {

        PrecioFactory precio1 = new PrecioFactory("España");
//        System.out.println(precio1.precio.getPrecio());
        System.out.println(precio1.getPrecio());    // 2.3.4.

        PrecioFactory precio2 = new PrecioFactory("USA");
//        System.out.println(precio2.precio.getPrecio());
        System.out.println(precio2.getPrecio());

        PrecioFactory precio3 = new PrecioFactory("Reino Unido");
        System.out.println(precio3.getPrecio());

        // XXX La ventaja es que la instanciación es siempre la misma, solo cambia el parámetro. XXX
        // --> Este comentario ahora se muestra en PrecioFactory, junto a la descripción del patrón.
    }
}

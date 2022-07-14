package creacionales.factory;

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

        // La ventaja es que la instanciación es siempre la misma, solo cambia el parámetro.
    }
}

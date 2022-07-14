package estructurales.adapter;
// ADAPTER: Crea una clase que permite que clases con la misma implementación y clases sin esa implementación funcionen correctamente. Es como un adaptador de enchufes.
public class Main {
    public static void main(String[] args) {
        Nevera nevera = new Nevera();
        Lampara lampara = new Lampara();
        // Instanciar el objeto a través del adaptador
        PowerAdapter lightbulb = new PowerAdapter();

        enciende(nevera);
        enciende(lampara);
        enciende(lightbulb);

        apaga(lampara);

        System.out.println(estaEncendido(nevera));
        System.out.println(estaEncendido(lampara));
    }

    // Crear el envoltorio
    public static void enciende(Enchufable enchufable) {
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable) {
        enchufable.apaga();
    }

    public static boolean estaEncendido(Enchufable enchufable) {
        return enchufable.estaEncendido();
    }
}

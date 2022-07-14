package estructurales.adapter;

public class Lampara implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Lámpara apagada");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}

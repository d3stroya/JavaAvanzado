public class Nevera implements Enchufable {
    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Nevera encendida");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Nevera apagada");
    }

    public boolean estaEncendido() {
        return encendido;
    }
}

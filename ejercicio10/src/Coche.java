package sesion5.conInterfaces.src;

public class Coche {
    String marca;
    String color;
    int potencia;
    int puertas;
    boolean wifi;
    boolean sport;
    String motor;

    public Coche() {}

    public Coche(String color, int potencia, int puertas, boolean wifi, boolean sport, String motor) {
        this.color = color;
        this.potencia = potencia;
        this.puertas = puertas;
        this.wifi = wifi;
        this.sport = sport;
        this.motor = motor;
    }


}

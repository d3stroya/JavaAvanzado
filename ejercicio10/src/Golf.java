package sesion5.conInterfaces.src;

public class Golf {
    Coche coche;

    public Golf(String marca) {
        coche = new Coche();
        coche.marca = marca;
    }

    public Golf setPuertas(int puertas) {
        coche.puertas = puertas;
        return this;
    }

    public Golf setColor(String color) {
        coche.color = color;
        return this;
    }

    public Golf setPotencia(int potencia) {
        coche.potencia = potencia;
        return this;
    }

    public Golf setWifi(boolean wifi) {
        coche.wifi = wifi;
        return this;
    }

    public Golf setSport(boolean sport) {
        coche.sport = sport;
        return this;
    }

    public Golf setMotor(String motor) {
        coche.motor = motor;
        return this;
    }

    public Coche build() {
        return this.coche;
    }
}

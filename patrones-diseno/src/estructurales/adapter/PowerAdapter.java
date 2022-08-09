public class PowerAdapter implements Enchufable {
    // Instanciar clase que hay que adaptar
    public Lightbulb lightbulb = new Lightbulb();

    // Adaptar métodos
    @Override
    public void enciende() {
        // Objeto diferente con métodos de las otras clases
        lightbulb.turnOn(110);
    }

    @Override
    public void apaga() {
        lightbulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightbulb.isPoweredOn();
    }
}

package estructurales.decorator;

public class TelefonoDecorator implements Telefono {
    private Telefono telefono;

    // Constructor con parámetro la interfaz
    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        this.telefono.crear();
    }
}

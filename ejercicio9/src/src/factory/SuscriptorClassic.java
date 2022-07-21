package factory;

public class SuscriptorClassic implements Suscriptor {
    @Override
    public String getCatalogue() {
        return "https://film.catalogue-classic.com";
    }

    public void receive() {
        System.out.println("Vacaciones en Roma ya está disponible");
        System.out.println("El Gran Dictador dejará de estar disponible el 31/08/2022.");
    }
}

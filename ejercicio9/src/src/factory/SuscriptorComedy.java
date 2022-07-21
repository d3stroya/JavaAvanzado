package factory;

public class SuscriptorComedy implements Suscriptor {

    @Override
    public String getCatalogue() {
        return "https://film.catalogue-comedy.com";
    }

    @Override
    public void receive() {
        System.out.println("Padre no hay más que uno 2 ya está disponible.");
    }
}

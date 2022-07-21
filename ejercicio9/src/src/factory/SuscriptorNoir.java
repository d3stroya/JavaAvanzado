package factory;

public class SuscriptorNoir implements Suscriptor {
    @Override
    public String getCatalogue() {
        return "https://film.catalogue-noir.com";
    }

    @Override
    public void receive() {
        System.out.println("La saga completa de El Padrino ya está disponible.");
    }
}

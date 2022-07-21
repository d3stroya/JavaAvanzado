package factory;

public class SuscriptorFactory {
    // ATRIBUTOS
    Suscriptor suscriptor;

    // CONSTRUCTORES
    private SuscriptorFactory() {}

    public SuscriptorFactory(String suscripcion) {
        if(suscripcion.equalsIgnoreCase("comedy")){
            suscriptor = new SuscriptorComedy();
        } else if (suscripcion.equalsIgnoreCase("noir")) {
            suscriptor = new SuscriptorNoir();
        } else {
            suscriptor = new SuscriptorClassic();
        }
    }

    // MÉTODOS
    public String getCatalogue() {
        return suscriptor.getCatalogue();
    }

}

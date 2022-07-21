import factory.Suscriptor;
import factory.SuscriptorFactory;
import observer.Emisor;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        SuscriptorFactory javier = new SuscriptorFactory("comedy");
        SuscriptorFactory eva = new SuscriptorFactory("noir");
        SuscriptorFactory anabel = new SuscriptorFactory("classic");

        // Recuperar catálogo
        System.out.println(javier.getCatalogue());
        System.out.println(eva.getCatalogue());
        System.out.println(anabel.getCatalogue());

        // Crear emisor
        Emisor emisor = new Emisor();

        // Agregarlos a la lista de suscriptores
        emisor.addSubcriber(javier);
        emisor.addSubcriber(eva);
        emisor.addSubcriber(anabel);

        // Envíar notificación
        emisor.emit();
    }
}

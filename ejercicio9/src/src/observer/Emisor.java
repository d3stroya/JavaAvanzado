package observer;

import factory.Suscriptor;

import java.util.ArrayList;

public class Emisor {
    // Lista de suscriptores
    private ArrayList<Suscriptor> listaSuscriptores = new ArrayList<>();

    // Añadir suscriptores
    public void addSubcriber(Suscriptor suscriptor) {
        this.listaSuscriptores.add(suscriptor);
        System.out.println("Se ha añadido " + suscriptor + " a la lista.");
    }

    // Eliminar suscriptores
    public void removeSubscriber(Suscriptor suscriptor) {
        this.listaSuscriptores.remove(suscriptor);
        System.out.println("Se ha eliminado a " + suscriptor + " de la lista.");
    }

    // Notificar a suscriptores
    public void emit() {
        for(Suscriptor suscriptor : listaSuscriptores) {
            suscriptor.receive();
        }
    }
}

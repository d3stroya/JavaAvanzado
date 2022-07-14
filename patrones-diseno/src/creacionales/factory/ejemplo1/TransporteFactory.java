package creacionales.factory.ejemplo1;

public class TransporteFactory {
    // ATRIBUTO: toma un valor u otro dependiendo del número de pedidos
    Transporte transporte;

    // CONSTRUCTORES
    // Privado
    private TransporteFactory() {}

    // Con parámetros
    public TransporteFactory(int pedidos) {
        if(pedidos > 20 && pedidos < 50) {
            System.out.println("El número de pedidos es menor o igual a 20.");
            transporte = new TransporteFurgoneta();
        } else if (pedidos >= 50) {
            System.out.println("El número de pedidos está entre 20 y 50.");
            transporte = new TransporteCamion();
        } else {
            System.out.println("El número de pedidos es menor que 20.");
            transporte = new TransporteDron();
        }
    }

    public String getTransporte() {
        return transporte.getTransporte();
    }
}

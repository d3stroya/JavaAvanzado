package creacionales.factory.ejemplo1;

public class Main {
    public static void main (String [] args) {
        TransporteFactory dia1 = new TransporteFactory(5);
        TransporteFactory dia2 = new TransporteFactory(65);
        TransporteFactory dia3 = new TransporteFactory(28);
        System.out.println("Medio de transporte Lunes: " + dia1.getTransporte());
        System.out.println("Medio de transporte Martes: " + dia2.getTransporte());
        System.out.println("Medio de transporte Miércoles: " + dia3.getTransporte());

    }
}

package creacionales.prototype;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.puertas = 5;
        coche.marca = "Volkswagen";
        coche.modelo = "Golf GTI";

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas + " puertas");

        // Clonar coche
        Coche clonado = coche.clonar();
        // Se pueden modificar valores de atributos
        clonado.puertas = 3;
        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas + " puertas");

        // Clonar moto
        Moto moto = new Moto();
        moto.marca = "Suzuki";
        moto.cc = 500;
        moto.modelo = "GT";
        try {
            Moto clonada = moto.clonar();
            System.out.println(clonada.marca + " " + clonada.modelo + " " + clonada.cc + " centímetros cúbicos");
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar: " + e.getMessage());
        }

    }
}

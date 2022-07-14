package creacionales.builder;

public class Main {
    public static void main(String[] args) {
//        Vehiculo vehiculo = new Vehiculo();
//        vehiculo.setMarca("Volkswagen");
//        vehiculo.setMotor("Diesel");
//        vehiculo.setPuertas(5);
//        vehiculo.setTipo("Combustión");

        // 3.4. Crear instancia
        Vehiculo coche = new CocheBuilder("Volkswagen")
                // 3.5. Configura atributos del objeto
                .setPuertas(5)
                .setMotor("Diesel")
                .build();
        System.out.println("Nuevo coche: " + coche.getMarca() + " | " + coche.getMotor() + " | " + coche.getPuertas());
    }
}

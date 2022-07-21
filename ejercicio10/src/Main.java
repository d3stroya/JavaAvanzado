package sesion5.conInterfaces.src;

public class Main {
    public static void main(String[] args) {
        // Coche golf = new Coche("rojo", 130, 5, true, false, "combustión");

//        Coche golf = new Coche();
//        Coche.setMarca("Volkswagen");
//        Coche.setMotor("Diesel");
//        Coche.setPuertas(5);
//        Coche.setTipo("Combustión");


        // Refactor con patrón builder
        Coche golf = new Golf("Volkswagen")
                .setColor("rojo")
                .setMotor("combustión")
                .setPotencia(130)
                .setPuertas(5)
                .setSport(false)
                .setWifi(false)
                .build();
    }

}

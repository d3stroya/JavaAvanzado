public class Main {
    public static void main(String[] args) {
//        Coche alfaRomeo = new Coche();
        CocheElectrico alfaRomeo = new CocheElectrico();

        alfaRomeo.setColor("Rojo");
        alfaRomeo.setMotor("Combustión");
        alfaRomeo.setPotencia(100);
        alfaRomeo.setMarca("Alfa");
        alfaRomeo.setPuertas(5);

        alfaRomeo.acelerar();
        alfaRomeo.acelerar();

        System.out.println(alfaRomeo);

        // Coche i30 = new Coche();
        CocheHibrido i30 = new CocheHibrido();
        i30.setPuertas(5);
        i30.acelerar();
        i30.cargarBateria();
        i30.acelerar();
        i30.acelerar();
        i30.frenar();
        System.out.println(i30);


        CocheDeportivo audiTT = new CocheDeportivo();

        audiTT.setDiseno("Skyfall");
        audiTT.setLlantas("Diamond");
        audiTT.setTapizado("Dark");

        audiTT.modoCircuito();

        System.out.println(audiTT);
    }


}

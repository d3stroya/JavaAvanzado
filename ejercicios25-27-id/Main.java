public class Main {
    public static void main(String[] args) {
        // Ejercicios 22, 23 y 24: S, O y L de SOLID
        System.out.println();
        System.out.println("EJERCICIOS 22, 23 y 24");

//        Coche alfaRomeo = new Coche();
        CocheElectrico alfaRomeo = new CocheElectrico();

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

        // Ejercicio 25: I de SOLID
        System.out.println();
        System.out.println("EJERCICIO 25");

        PatineteElectrico bongo = new PatineteElectrico();
        bongo.cargarBateria();
        while(bongo.getCargaBateria() > 20 && bongo.velocidad < 30) {
            bongo.acelerar();
        }
        System.out.println(bongo);



        // Ejercicio 26: D de SOLID
        System.out.println();
        System.out.println("EJERCICIO 26");

        // Opción 1
        Vehiculo patinete = new PatineteElectrico();
        guardar("electrico", patinete);

        Vehiculo coche = new CocheDeportivo();
        guardar("deportivo", coche);

        // Opción 2
        DatabaseMySQL dbmysql = new DatabaseMySQL();
        DatabasePostgreSQL dbpostgre = new DatabasePostgreSQL();
        guardarEnBD(dbmysql, patinete);
        guardarEnBD(dbpostgre, patinete);
    }

    // Opción 1
    public static void guardar(String tipo, Vehiculo vehiculo) {
        if(tipo == "electrico") {
            DatabaseMySQL dbmysql = new DatabaseMySQL();
            dbmysql.guardarVehiculo(vehiculo);
        } else {
            DatabasePostgreSQL dbpostgre = new DatabasePostgreSQL();
            dbpostgre.guardarVehiculo(vehiculo);
        }
    }

    // Opción 2
    public static void guardarEnBD(DatabaseStore db, Vehiculo vehiculo) {
        db.guardarVehiculo(vehiculo);
    }

}

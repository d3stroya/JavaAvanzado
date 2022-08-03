/**
 * Dependency inversion:
 */
interface BaseDeDatos {
    void obtenerDatos();
    void enviarDatos();
}

class BBDDMySQL implements BaseDeDatos {}
class BBDDFile implements BaseDeDatos {}

public class SoliD {
    BaseDeDatos bdd;

    public void dameDatos(BaseDeDatos bdd) {}

    public void tomaDatos(BaseDeDatos bdd) {}
}

public static class main {
    public static void main(String []args) {
        SoliD solid = new SoliD();

        // Si cambio de base de datos, solo debo modificar la instanciación
        BBDDMySQL bbdd = new BBDDMySQL();
        BBDDFile otrabbdd = new BBDDFile();

        // También puedo pasar conexiones diferentes a cada método
        solid.dameDatos(bbdd);
        solid.tomaDatos(otrabbdd);
    }
}
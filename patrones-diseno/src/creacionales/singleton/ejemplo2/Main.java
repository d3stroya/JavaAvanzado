package creacionales.singleton.ejemplo2;

public class Main {
    public static void main(String[] args) {
        // Crear objeto único
        Gobierno gobierno = Gobierno.getInstance();

        // Configurar partido
        // 1978
        gobierno.setPartido("UCD");
        System.out.println("1978 - " + gobierno.getPartido());
        gobierno.setPartido("PSOE");
        System.out.println("1982 - " + gobierno.getPartido());
        gobierno.setPartido("PP");
        System.out.println("1996 - " + gobierno.getPartido());
        gobierno.setPartido("PSOE");
        System.out.println("2004 - " + gobierno.getPartido());
        gobierno.setPartido("PP");
        System.out.println("2011 - " + gobierno.getPartido());
        gobierno.setPartido("PSOE/Podemos");
        System.out.println("2018 - " + gobierno.getPartido());
    }
}

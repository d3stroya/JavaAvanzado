package creacionales.singleton.ejemplo1;

public class Main {
    public static void main (String [] args) {
        Arbitro arbitro = Arbitro.getInstance();

        System.out.println("1ª jornada. Rayo Vallecano - Atletico de Madrid");
        arbitro.setNombre("Marta Huerta de Aza");
        System.out.println("Árbitra: " + arbitro.getNombre());

        System.out.println("2ª jornada. Atletico de Madrid - Real Sociedad");
        arbitro.setNombre("Antonio Mateu Lahoz");
        System.out.println("Árbitro: " + arbitro.getNombre());
    }
}

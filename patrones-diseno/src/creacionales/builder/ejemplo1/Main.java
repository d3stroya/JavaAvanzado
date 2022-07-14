package creacionales.builder.ejemplo1;

public class Main {
    public static void main(String[] args) {
        Letras ana = new NombreBuilder("Azul")
                .setAlto(5)
                .setFondo(2)
                .setLetras("Ana")
                .build();

        Letras maria = new NombreBuilder("Blanco")
                .setAlto(7)
                .setFondo(3)
                .setLetras("María")
                .build();

        System.out.println("Pedido 1: " + ana.getNombre() + " | " +  ana.getColor() + " | " + ana.getAlto() + "x" + ana.getFondo());
        System.out.println("Pedido 1: " + maria.getNombre() + " | " +  maria.getColor() + " | " + maria.getAlto() + "x" + maria.getFondo());
    }
}

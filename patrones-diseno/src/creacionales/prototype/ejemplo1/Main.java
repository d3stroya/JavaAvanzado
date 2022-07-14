package creacionales.prototype.ejemplo1;

import creacionales.prototype.Moto;

public class Main {
    public static void main(String[] args) {
        System.out.println("CORAZÓN SONRIENTE");

        Corazon corazon1 = new Corazon();
        corazon1.color = "Rojo";
        corazon1.alto = 5;
        corazon1.cara = true;
        corazon1.grosor = 3;

        System.out.println("Pedido 1: " + corazon1.color
                + " | " + corazon1.alto
                + " cm de alto y " + corazon1.grosor
                + " cm de grosor | Cara: "
                + corazon1.cara);
        try {
            Corazon corazon2 = corazon1.clonar();
            System.out.println("Pedido 2: " + corazon2.color
                    + " | " + corazon2.alto + " cm de alto y "
                    + corazon2.grosor + " cm de grosor | Cara: "
                    + corazon2.cara);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puedo clonar " + e);
        }

        System.out.println("FUNDA PARA MÓVIL");

        Funda funda1 = new Funda();
        funda1.alto = 12;
        funda1.ancho = 7;
        funda1.color = "negro";

        System.out.println("Pedido 1: Funda de color " + funda1.color
                + " con medidas " + funda1.ancho
                + "x" + funda1.alto + "cm");

        try {
            Funda funda2 = funda1.clonar();
            System.out.println("Pedido 2: Funda de color " + funda2.color
                    + " con medidas " + funda2.ancho
                    + "x" + funda2.alto + "cm");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("COHETE A MOTOR");
        Cohete coheteMotor1 = new Cohete();
        coheteMotor1.alto = 10;
        coheteMotor1.motor = true;
        coheteMotor1.diametro = 5;
        coheteMotor1.colorCuerpo = "blanco";
        coheteMotor1.colorTecho = "rojo";

        System.out.println("Pedido 1: Color cuerpo: " + coheteMotor1.colorCuerpo
                + " | Color tejado: " + coheteMotor1.colorTecho
                + " | Alto: " + coheteMotor1.alto
                + " | Diámetro: " + coheteMotor1.diametro
                + " | Motor: " + coheteMotor1.motor);

        try {
            Cohete coheteMotor2 = coheteMotor1.clonar();
            System.out.println("Pedido 2: Color cuerpo: " + coheteMotor2.colorCuerpo
                    + " | Color tejado: " + coheteMotor2.colorTecho
                    + " | Alto: " + coheteMotor2.alto
                    + " | Diámetro: " + coheteMotor2.diametro
                    + " | Motor: " + coheteMotor2.motor);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error" + e);
        }

        System.out.println("COHETE SIN MOTOR");
        try {
            Cohete coheteSinMotor1 = coheteMotor1.clonar();
            coheteSinMotor1.motor = false;
            System.out.println("Pedido 3: Color cuerpo: " + coheteSinMotor1.colorCuerpo
                    + " | Color tejado: " + coheteSinMotor1.colorTecho
                    + " | Alto: " + coheteSinMotor1.alto
                    + " | Diámetro: " + coheteSinMotor1.diametro
                    + " | Motor: " + coheteSinMotor1.motor);
        } catch (CloneNotSupportedException e) {
            System.out.println("Error" + e);
        }

    }
}

/**
 * TODO: Crea una clase coche aplicándole el principio de responsabilidad única (S).
 */

 public abstract class Coche {
    // ATRIBUTOS
    private String marca;
    private String motor;
    private String color;
    int velocidad = 0;
    int puertas;
    int potencia;
    boolean sport;

    // MÉTODOS
    public abstract int acelerar();

    public abstract int frenar();


    // GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
// TO STRING

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", puertas=" + puertas +
                ", potencia=" + potencia +
                ", sport=" + sport +
                '}';
    }
}

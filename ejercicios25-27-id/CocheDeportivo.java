/**
 * TODO: Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo aplicando el principio abierto/cerrado(O).
 */

public class CocheDeportivo extends Coche {

    // ATRIBUTOS
    private int velocidad;
    private String diseno;
    private String tapizado;
    private String llantas;
    private int puertas = 3;
    private boolean sport = true;

    // MÉTODOS
    @Override
    public int acelerar() {
        return velocidad += 80;
    }

    @Override
    public int frenar() {
        return velocidad -= 70;
    }

    public int modoCarretera() {
        return velocidad = 120;
    }

    public int modoCiudad() {
        return velocidad = 50;
    }

    public int modoCircuito() {
        return velocidad = 200;
    }

    // GETERS Y SETTERS
    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getTapizado() {
        return tapizado;
    }

    public void setTapizado(String tapizado) {
        this.tapizado = tapizado;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int getPuertas() {
        return puertas;
    }

    @Override
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public boolean isSport() {
        return sport;
    }

    @Override
    public void setSport(boolean sport) {
        this.sport = sport;
    }

    // TO STRING

    @Override
    public String toString() {
        return "CocheDeportivo{" +
                "velocidad=" + velocidad +
                ", diseno='" + diseno + '\'' +
                ", tapizado='" + tapizado + '\'' +
                ", llantas='" + llantas + '\'' +
                ", puertas=" + puertas +
                ", sport=" + sport +
                '}';
    }
}

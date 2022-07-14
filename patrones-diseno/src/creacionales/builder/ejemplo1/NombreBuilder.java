package creacionales.builder.ejemplo1;

public class NombreBuilder {
    // ATRIBUTO
    Letras letras;

    // CONSTRUCTOR
    public NombreBuilder(String color) {
        letras = new Letras();
        letras.color = color;
    }

    // SETTERS
    public NombreBuilder setLetras(String nombre) {
        letras.nombre = nombre;
        return this;
    }

    public NombreBuilder setAlto(int alto) {
        letras.alto = alto;
        return this;
    }

    public NombreBuilder setFondo(int fondo) {
        letras.fondo = fondo;
        return this;
    }

    public Letras build() {
        return this.letras;
    }
}

public class CocheHibrido extends Coche {
    // ATRIBUTOS
    private int cargaBateria;

    // MÉTODOS

    @Override
    public int acelerar() {
        if(cargaBateria > 0) {
            cargaBateria -= 30;
            return velocidad += 40;
        }

        System.out.println("¡ATENCIÓN! Nivel de batería al 0%. Por favor, carga la batería");
        return velocidad = 0;
    }

    @Override
    public int frenar() {
        cargaBateria += 10;
        return velocidad -= 40;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public int cargarBateria() {
        return cargaBateria = 100;
    }

    // TO STRING

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "cargaBateria=" + cargaBateria +
                ", velocidad=" + velocidad +
                ", puertas=" + puertas +
                ", potencia=" + potencia +
                ", sport=" + sport +
                '}';
    }
}

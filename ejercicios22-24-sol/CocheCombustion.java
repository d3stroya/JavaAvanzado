public class CocheCombustion extends Coche {
    // ATRIBUTOS
    private String motor = "combustión";

    // MÉTODOS

    @Override
    public int acelerar() {
        return velocidad += 50;
    }

    @Override
    public int frenar() {
        return velocidad -= 50;
    }
}

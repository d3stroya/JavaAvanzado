package creacionales.builder;
// 3. BUILDER: Permite mostrar objetos complejos paso a paso
public class Vehiculo {
    public String marca;
    public String motor;
    public int puertas;

    public String getMarca() {
        return marca;
    }

    // 3.6. Los setters no son necesarios
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }


    public String getMotor() {
        return motor;
    }

//    public void setMotor(String motor) {
//        this.motor = motor;
//    }

    public int getPuertas() {
        return puertas;
    }

//    public void setPuertas(int puertas) {
//        this.puertas = puertas;
//    }
}

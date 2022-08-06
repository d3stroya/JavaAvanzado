/**
 * TODO: Si no has creado interfaces ya, créalas siguiendo el principio de segregación de interfaz (I) el cual indica que las interfaces grandes se deben segregar en varias interfaces pequeñas. Si ya las has creado, modifícalas para que cumplan el principio.
 * Creo interfaz Vehiculo,
 * modifico la clase CocheEléctrico para que implemente esta interfaz
 * y creo una clase nueva PatineteEléctrico que también implementa esta interfaz.
 */
public interface Vehiculo {
    int acelerar();
    int frenar();
}

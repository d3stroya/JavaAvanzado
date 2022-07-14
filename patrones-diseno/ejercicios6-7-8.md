# Ejercicios sesiones 6, 7 y 8
1. Identifica las características principales de los patrones de diseño más conocidos, indica para qué valen y un caso de uso para cada uno de ellos.
Los patrones de diseño son soluciones estándar para problemas comunes.
Existen 3 tipos:
* Creacionales: facilitan la creación e instanciación de nuevos objetos.
  * Singleton: Permite una única instanciación del objeto. En lugar de crear diferentes objetos y almacenarlos en diferentes posiciones de memoria, las diversas instancias comparten posición. Esto permite ir "sobreescribiendo" el mismo objeto, con valores diferentes. 
    * Se utiliza para instancias compartidas, por ejemplo, en bases de datos.
  * Factoroy: Este patrón da acceso a una clase u otra dependiendo de algún parámetro. Se utiliza con variantes para una misma clase. 
    * Por ejemplo, para mostrar el precio en distintas monedas dependiendo del país o para activar un método de envío u otro dependiendo del número de pedidos por día a una misma ciudad.
  * Prototype: Crea clones de un objeto. 
    * Por ejemplo, para fabricar un mismo producto con las mismas características, en lugar de repetir una y otra vez el mismo código, se generan clones. Esos clones pueden modificar sus atributos, pero comparten todo el código de su objeto de referencia, por lo que es más rápida esa modificación.
  * Builder: Ayuda a crear objetos complejos de una manera más sencilla a través de la programación fluida / el encadenamiento de métodos. 
    * Se puede usar, por ejemplo, para crear figuras de impresión 3D con distinto nombre y diferentes magnitudes.
* Estructurales: Combina objetos y clases para crear estructuras flexibles y eficientes.
  * Adapter: Hace que clases con distintas implementaciones funcionen correctamente juntas.
    * Ejemplo: una bombilla que cambia de color entre rojo y blanco. Además, se enciende y se apaga. Tenemos un mando a distancia con botones de encender, apagar y una flecha para cambiar el color. Otro mando tiene un botón power on, otro power off, otro red y otro white. A través del adaptador, se modifican los métodos de uno de los mandos para que "coincidan" con la otra clase. De esta manera, podremos acceder a las mismas funcionalidades con los mismos métodos, aunque por debajo la implementación sea distinta.
  * Decordador: Añade funcionalidades a una clase ya existente sin modificarla.
    * Ejemplo: Un sistema de suscripciones a una plataforma streaming, por ejemplo, donde haya una suscripción "básica" con acceso a unas determinadas películas. Otra suscripción "estándar" dará acceso a esas películas más otras más modernas. Y la suscripción "cinéfil@" dará acceso a las películas de estreno más todas las anteriores.
* De comportamiento


2. Crea una pequeña aplicación implementando el patrón Singlenton y demuestra que, efectivamente, no crea instancias nuevas. Puedes tomar la sesión 7 como referencia.
https://github.com/d3stroya/JavaAvanzado/tree/main/patrones-diseno/src/creacionales/singleton/ejemplo1

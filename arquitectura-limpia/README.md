# Arquitectura limpia
La arquitectura es cómo funciona el programa para permitir que se mantenga "en pie".
El tío Bob define la arquitectura limpia con la premisa de basar el código en capas contiguas 
la capa 1 se relaciona con la 2. La capa 2, con la 3 y la 1, pero la 3 no con la 1, y así sucesivamente).

Normalmente usamos 4 capas:
* Entidades: es la capa que está por encima. Define la lógica de negocio.
* Uso: tiene la lógica de la aplicación.
* Controladores o interfaces adaptadoras: (no son interfaces java). Son funciones que implementan los casos de uso (capa Uso).
* Lo demás o frameworks/drivers: se comunican con BBDD, renderizan HTML, piden información a otra web, etc. Es la capa de más abajo.

Otra forma de verlo es por etapas:
1. Entry points: coge la información.
2. Core: procesa la información. Son entidades y casos de uso
3. Proveedores de datos: solicita la información a proveedores externos (BBDD, ficheros, dispositivos remotos...).

## Principios solid
Dicen cómo debe funcionar la aplicación:
* S - Single responsability principle: una clase, componente o servicio se encarga de una sola cosa.
* O - Open-close principle: las entidades del software tienen que estar abiertas para extenderlas pero cerradas a modificaciones.
* L - Liskov Substitution Principle: una clase se tiene que poder sustituir por su clase padre. Jerarquía fácil de entender y código reutilizable.
* I - Interface Segregation Principle: una clase no debe depender de una interfaz que no va a utilizar.
* D - Dependency Inversion Principle: las dependencias se tienen que abstraer. Un módulo de alto nivel no va a usar uno de bajo nivel.

## Ejercicio 20
Identifica las características principales de la arquitectura limpia, indica en que casos se tendría que utilizar la arquitectura limpia y como lo harías.

La arquitectura limpia se basa en organizar el código en capas para que esté poco acoplado, sea reutilizable y fácil de entender. 
Se basa en los principios SOLID:
* Single responsability principle
* Open-close principle
* Liskov substitution principle
* Interface segregation principle
* Dependency inversion principle

La arquitectura limpia debería aplicarse siempre, aunque si se trata de un proyecto individual que no va a ver nadie más, podría hacerse más "sucio" siempre que
quien lo escribe lo entienda. Por otra parte, es fundamental aplicar la arquitectura limpia en códigos colaborativos donde trabajan otras personas, ya sea
para una empresa o para un proyecto open source.
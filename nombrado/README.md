# Nombrado de variables, clases, métodos, etc...

Debe ser un nombre claro que identifique lo que hace ese componente de desarrollo.

## Clases
Nombre sustantivo que revelen claramente cuál es su cometido.
Empiezan por mayúscula. Cada inicial se capitaliza.
Por ejemplo: class ReverseString {}

## Interfaces
Adjetivos acabados en -able en inglés o en -ador en español
Por ejemplo: interface Iterable {} o Iterador {}

## Métodos
Verbos empezados con minúscula y que digan claramente lo que hacen. Cada inicial se capitaliza, salvo la primera.
Por ejemplo: public void createUser() {}

## Constantes
Siempre en mayúscula. Se pueden usar mnemotécnicos. Las palabras van separadas por un guion bajo.
Por ejemplo: public static init final MAX_USERS

## Enumeraciones
Se capitalizan igual que las constantes.

## Variables y propiedad
Tienen que ser autodescriptivos. Se capitaliza la inicial de cada palabra salvo la primera.
Por ejemplos: int [] numeros = {1,2,3,4}, no int [] n

## Excepciones
Se usan temporalmente y en casos concretos. No se usan de forma genérica.
Por ejemplo: 
* temp o tmp.
* En bucles for: for(int i = 0; i < numeros.length; i++){}

## Anotación húngara
Anteponer unas letras al nombre para luego identificarla fácilmente, aunque no sepa el tipo de dato.
Por ejemplo: int [] aNumeros = {1, 2, 3, 4, 5}. 
* a: array
* b: boolean
* c: char
* d: double
* f: funciones (no se suele usar)
* fl: float
* h: hashtable
* i: como mínimo hay un int, pero incluye también long. Denota la cantidad mínima de bits que voy a poder almacenar.
* n: enumeraciones
* o: objetos en general
* s: cadenas de texto
* v: variable (var)
* y/by: byte
* btn: botones
* lbl: label

Se pueden combinar: 
* ai: array de enteros
* as: array de strings
* af: array de flotantes

## Otros principios
Un concepto, una palabra.
Evitar los juegos de palabras. Por ejemplo: salOPimineta, trucoOTrato, iteradorConIterancia
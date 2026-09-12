# Cierre del laboratorio

Nombre: Alejandro Daniel Elia Alarcón
Sección: 012V

## Comparación entre el algoritmo inicial y la solución final

| Aspecto | Algoritmo inicial | Solución implementada |
|---|---|---|
| Recepción | Recibir e identificar al animal. | Main crea cuatro animales y muestra sus nombres. |
| Datos | Consultar o registrar información. | Los constructores reciben datos y los validan; se muestran edad y peso. |
| Clasificación | Reconocer especie y grupo. | La jerarquía representa mascotas, salvajes y especies concretas. |
| Atención | Comprender la necesidad y atenderla. | Se simula una observación inicial mediante emitirSonido(). |
| Resultado | Registrar e informar la atención. | Se muestra un resultado en consola para cada animal. |
| Seguimiento | Evaluar si requiere otra atención. | No está implementado. |

La solución demuestra herencia y polimorfismo. No implementa fichas
persistentes, diagnóstico, tratamientos ni seguimiento. Los animales
se crean con datos de ejemplo y los resultados se muestran en consola.

## Dónde aparece la herencia
Mascota y Salvaje heredan de Animal.
Perro y Gato heredan de Mascota.
Tigre y Leon heredan de Salvaje.

Animal concentra nombre, edad y peso. Mascota agrega responsable
y Salvaje agrega procedencia. Las especies reutilizan esa estructura
sin volver a declarar los mismos atributos.

## Dónde aparece super(...)
Los constructores de Mascota y Salvaje llaman a
super(nombre, edad, peso) para inicializar la parte definida en Animal.

Los constructores de las especies llaman al constructor de su padre
directo y también le entregan responsable o procedencia.

Así, cada nivel inicializa y valida los datos que le corresponden.

## Dónde aparece el polimorfismo
Main guarda las cuatro especies en un arreglo Animal[].
El recorrido utiliza una variable de tipo Animal y llama a
animal.emitirSonido().

Java selecciona la versión del objeto real:
Perro ladra, Gato maúlla, Tigre y Leon muestran sus respectivos rugidos.
No se necesitan condiciones por especie para elegir el sonido.

## Verificación realizada
Se compilaron las clases y se ejecutó Main correctamente.
La consola mostró:
- Rocky ladra: guau.
- Luna maulla: miau.
- Rajah ruge como un tigre.
- Simba ruge como un leon.
- Animales recibidos: 4.

Esta ejecución comprueba el recorrido y las respuestas de las especies.
No demuestra por sí sola todos los casos de validación del constructor.

## Qué evitaría al repetir el ejercicio
- Duplicar atributos que ya pertenecen a una clase padre.
- Crear subclases sin una relación válida de "es un tipo de".
- Elegir cada comportamiento mediante condiciones por especie.
- Concentrar todas las responsabilidades en Main.
- Confundir una compilación correcta con una comprobación completa.
- Presentar funciones propuestas como si ya estuvieran implementadas.

## Aprendizaje
La herencia permite reunir datos y comportamientos comunes.
super(...) permite delegar la inicialización al constructor del padre.
La sobrescritura permite adaptar una operación a cada especie.
El polimorfismo permite utilizar esas versiones mediante referencias
del tipo general Animal.
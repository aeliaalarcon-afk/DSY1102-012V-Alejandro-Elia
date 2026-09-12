# Comparación de animales

Nombre: Alejandro Daniel Elia Alarcón
Sección: 012V

## Datos y acciones propuestos
Los siguientes ejemplos permiten reconocer semejanzas y diferencias.
Deben validarse con los requisitos de las siguientes actividades.

| Animal | Datos comunes | Datos particulares propuestos | Acciones comunes | Acciones particulares |
|---|---|---|---|---|
| Perro | Nombre, edad, peso | Responsable, número de microchip | Alimentarse, desplazarse, emitir sonido | Ladrar |
| Gato | Nombre, edad, peso | Responsable, condición de vida interior o exterior | Alimentarse, desplazarse, emitir sonido | Maullar |
| Tigre | Nombre, edad, peso | Lugar de procedencia, recinto asignado | Alimentarse, desplazarse, emitir sonido | Rugir |
| León | Nombre, edad, peso | Lugar de procedencia, manada de origen | Alimentarse, desplazarse, emitir sonido | Rugir |

## Semejanzas
- Todos son animales y comparten datos como nombre, edad y peso.
- Todos se alimentan, se desplazan y emiten sonidos.
- Emitir sonido es una acción común, pero su realización puede variar.
- Perros y gatos comparten información relacionada con su responsable.
- Tigres y leones comparten información relacionada con su procedencia.

## Diferencias
- Cada especie presenta características propias.
- Perros y gatos emiten sonidos diferentes.
- Una acción particular puede ser compartida por varias especies:
  tanto el tigre como el león pueden rugir.
- Los datos particulares son ejemplos relevantes para esta propuesta,
  no características exclusivas de una especie en todos los contextos.

## Sobrescritura de comportamiento — LAB-VET-11

La operación común es public void emitirSonido(), definida en Animal.
Mascota y Salvaje la heredan. Las especies concretas la sobrescriben
usando @Override y conservando el nombre, los parámetros y el retorno.

| Clase | Respuesta a emitirSonido() |
|---|---|
| Animal | Muestra el nombre y un sonido genérico. |
| Perro | Muestra el nombre y un ladrido: guau. |
| Gato | Muestra el nombre y un maullido: miau. |
| Tigre | Muestra el nombre e indica que ruge como un tigre. |
| Leon | Muestra el nombre e indica que ruge como un león. |

Tigre y Leon comparten la acción de rugir; el mensaje identifica
la especie representada.

Si una referencia de tipo Animal contiene un Perro, al llamar
emitirSonido() se ejecuta la versión de Perro. Lo mismo ocurre
con las demás especies: la respuesta depende del objeto real.

Esto permite usar la misma operación sin elegir manualmente
un método diferente para cada especie.

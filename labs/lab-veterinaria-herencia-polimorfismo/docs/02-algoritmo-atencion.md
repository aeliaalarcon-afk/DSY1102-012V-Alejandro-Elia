# Algoritmo de atención veterinaria

Nombre: Alejandro Daniel Elia Alarcón
Sección: 012V

## Objetivo
Describir la secuencia de atención de un animal desde su llegada
a la veterinaria hasta que se informa el resultado.

## Pasos
1. Recibir al animal que llega a la veterinaria.
2. Identificar al animal y consultar sus datos. Si no está registrado,
   registrar la información necesaria.
3. Reconocer su especie: perro, gato, tigre o león, según corresponda.
4. Determinar si pertenece al grupo de mascotas o de animales salvajes.
5. Comprender el motivo de la visita y la necesidad de atención.
6. Atender al animal considerando su necesidad, su tipo y sus
   comportamientos particulares.
7. Registrar qué atención se realizó y cuál fue su resultado.
8. Mostrar la identificación del animal, su especie, su grupo,
   la atención realizada y el resultado obtenido.
9. Informar el resultado a la persona responsable del animal
   y finalizar la atención.

## Resultado esperado
El animal queda identificado, su necesidad es atendida y el resultado
de la atención queda registrado y disponible para consultar.

## Información de entrada
- Identificación y datos disponibles del animal.
- Especie del animal.
- Antecedentes de atenciones previas, si existen.
- Motivo de la visita y necesidad de atención.
- Información aportada por la persona responsable.

## Resultados de salida
- Animal identificado con su especie y grupo.
- Atención realizada registrada.
- Resultado de la atención disponible para consultar.
- Persona responsable informada del resultado.

## Decisiones del negocio
Estas decisiones describen lo que debe resolverse durante la atención,
sin determinar cómo se programará.

- ¿El animal ya está registrado?
  Si está registrado, consultar sus datos; si no, registrar sus datos.
- ¿Se cuenta con información suficiente para identificarlo?
  Si falta información, solicitarla antes de continuar.
- ¿Es mascota o animal salvaje?
  Reconocer el grupo según su especie. En este problema, perros y gatos
  son mascotas; tigres y leones son animales salvajes.
- ¿Qué atención necesita?
  Determinar la atención según el motivo de la visita y la evaluación
  del personal veterinario.
- ¿La necesidad quedó resuelta o requiere seguimiento?
  Registrar el resultado e informar si se necesita otra atención.

## Alcance y aspectos por confirmar
El registro previo, la solicitud de información y el seguimiento son
propuestas para completar el flujo; no están detallados en el enunciado.
Se deben confirmar los datos obligatorios y los criterios de atención.
Reconocer estas decisiones no obliga a usar una instrucción específica
en el programa.

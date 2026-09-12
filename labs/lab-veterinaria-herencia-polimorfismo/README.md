# Lab Veterinaria - Herencia y Polimorfismo

Nombre: Alejandro Daniel Elia Alarcón
Sección: 012V

Estado: implementación y documentación de cierre completadas.

## Objetivo
Modelar una jerarquía de animales y demostrar constructores,
herencia, sobrescritura y polimorfismo en Java.

## Implementación
- Animal: nombre, edad, peso y comportamiento común.
- Mascota: agrega responsable.
- Salvaje: agrega procedencia.
- Perro, Gato, Tigre y Leon: especializan emitirSonido().
- Main: recorre cuatro objetos mediante un arreglo Animal[].

## Documentación
- [Análisis del problema](docs/01-analisis-problema.md)
- [Algoritmo de atención](docs/02-algoritmo-atencion.md)
- [Comparación de animales](docs/03-modelo-objetos.md)
- [Jerarquía conceptual](docs/diagramas/jerarquia-clases.md)
- [Interacción polimórfica](docs/diagramas/interaccion-objetos.md)
- [Cierre y aprendizaje](evidencias/cierre.md)

## Compilar y ejecutar
Requisito: un JDK con javac y java disponibles en PATH.
Desde la carpeta del laboratorio, ejecutar en PowerShell:

```powershell
$destino = Join-Path $env:TEMP "lab-vet-compilacion"
New-Item -ItemType Directory -Force -Path $destino | Out-Null
$fuentes = @(Get-ChildItem ".\src\*.java" |
    Select-Object -ExpandProperty FullName)
javac -encoding UTF-8 -d $destino $fuentes
if ($LASTEXITCODE -eq 0) {
    java -cp $destino Main
}


public class Main {

    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Rocky", 3, 15.5, "Alejandro"),
            new Gato("Luna", 2, 4.2, "Camila"),
            new Tigre("Rajah", 5, 180.0, "Centro de rescate"),
            new Leon("Simba", 6, 190.0, "Reserva natural")
        };

        System.out.println("=== ATENCION VETERINARIA ===");

        for (Animal animal : animales) {
            System.out.println();
            System.out.println("Recibiendo a: " + animal.getNombre());
            System.out.println("Edad: " + animal.getEdad() + " anios");
            System.out.println("Peso: " + animal.getPeso() + " kg");

            System.out.println("Observando su comportamiento:");
            animal.emitirSonido();

            System.out.println(
                "Resultado: observacion inicial de "
                + animal.getNombre() + " completada."
            );
        }

        System.out.println();
        System.out.println("Animales recibidos: " + animales.length);
    }
}
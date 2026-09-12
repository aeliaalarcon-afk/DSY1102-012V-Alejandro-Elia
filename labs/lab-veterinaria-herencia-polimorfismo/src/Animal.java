public class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal(String nombre, int edad, double peso) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El nombre no puede estar vacio."
            );
        }
        if (edad < 0) {
            throw new IllegalArgumentException(
                "La edad no puede ser negativa."
            );
        }
        if (!Double.isFinite(peso) || peso <= 0) {
            throw new IllegalArgumentException(
                "El peso debe ser un numero positivo."
            );
        }

        this.nombre = nombre.trim();
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public void emitirSonido() {
        System.out.println(nombre + " emite un sonido.");
    }
}
public class Salvaje extends Animal {
    private String procedencia;

    public Salvaje(String nombre, int edad, double peso,
                   String procedencia) {
        super(nombre, edad, peso);

        if (procedencia == null || procedencia.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "La procedencia no puede estar vacia."
            );
        }

        this.procedencia = procedencia.trim();
    }

    public String getProcedencia() {
        return procedencia;
    }
}
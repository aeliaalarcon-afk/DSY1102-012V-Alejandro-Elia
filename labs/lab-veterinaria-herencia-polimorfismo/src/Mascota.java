public class Mascota extends Animal {
    private String responsable;

    public Mascota(String nombre, int edad, double peso,
                   String responsable) {
        super(nombre, edad, peso);

        if (responsable == null || responsable.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "El responsable no puede estar vacio."
            );
        }

        this.responsable = responsable.trim();
    }

    public String getResponsable() {
        return responsable;
    }
}
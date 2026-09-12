public class Perro extends Mascota {

    public Perro(String nombre, int edad, double peso,
                 String responsable) {
        super(nombre, edad, peso, responsable);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ladra: guau.");
    }
}
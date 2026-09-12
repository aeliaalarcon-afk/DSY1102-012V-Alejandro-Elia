public class Gato extends Mascota {

    public Gato(String nombre, int edad, double peso,
                String responsable) {
        super(nombre, edad, peso, responsable);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " maulla: miau.");
    }
}
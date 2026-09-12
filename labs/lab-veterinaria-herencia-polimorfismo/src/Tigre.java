public class Tigre extends Salvaje {

    public Tigre(String nombre, int edad, double peso,
                 String procedencia) {
        super(nombre, edad, peso, procedencia);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ruge como un tigre.");
    }
}
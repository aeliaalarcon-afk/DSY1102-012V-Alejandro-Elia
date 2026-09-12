public class Leon extends Salvaje {

    public Leon(String nombre, int edad, double peso,
                String procedencia) {
        super(nombre, edad, peso, procedencia);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ruge como un leon.");
    }
}
package modelamiento;


public class Gato extends Mascotas {

    public Gato(int edad, int numPatas, String nombre, String marcaComida, String raza, String tipoAmbiente, String juguete) {
        super(edad, numPatas, nombre, marcaComida, raza, tipoAmbiente, juguete);
    }

    @Override
    protected void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    protected void moverse() {
        System.out.println("El gato corrió");
    }

    @Override
    protected void jugar(String juguete) {
        System.out.println("El gato juega con su " + juguete);
    }

    protected void ronronear() {
        System.out.println("Prrrrrrrr");
    }
}

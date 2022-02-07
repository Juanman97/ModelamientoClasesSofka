package modelamiento;

public class Pato extends Mascotas{

    public Pato(int edad, int numPatas, String nombre, String marcaComida, String raza, String tipoAmbiente, String juguete) {
        super(edad, numPatas, nombre, marcaComida, raza, tipoAmbiente, juguete);
    }

    @Override
    protected void hacerRuido() {
        System.out.println("Cuak");
    }

    @Override
    protected void moverse() {
        System.out.println("El pato caminó");
    }

    @Override
    protected void jugar(String juguete) {
        System.out.println("El pato juega con su " + juguete);
    }
}

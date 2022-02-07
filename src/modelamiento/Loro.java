package modelamiento;

public class Loro extends Mascotas {

    boolean imitaSonidos;

    public Loro(int edad, int numPatas, String nombre, String marcaComida, String raza, String tipoAmbiente, String juguete, boolean imitaSonidos) {
        super(edad, numPatas, nombre, marcaComida, raza, tipoAmbiente, juguete);
        this.imitaSonidos = imitaSonidos;
    }

    @Override
    protected void hacerRuido() {
        System.out.println("*sonido de loro (?)*");
    }

    @Override
    protected void moverse() {
        System.out.println("El loro voló");
    }

    @Override
    protected void jugar(String juguete) {
        System.out.println("El loro juega con su " + juguete);
    }
}

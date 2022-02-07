package modelamiento;

public class Perro extends Mascotas{

    String tamañoPelo;

    public Perro(int edad, int numPatas, String nombre, String marcaComida, String raza, String tipoAmbiente, String juguete, String tamañoPelo) {
        super(edad, numPatas, nombre, marcaComida, raza, tipoAmbiente, juguete);
        this.tamañoPelo = tamañoPelo;
    }

    @Override
    protected void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    protected void moverse() {
        System.out.println("El perro corrió");
    }

    @Override
    protected void jugar(String juguete) {
        System.out.println("El perro juega con su " + juguete);
    }

    protected void cavar() {
        System.out.println("El perro ha cavado un hueco");
    }
}

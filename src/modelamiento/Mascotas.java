package modelamiento;

public abstract class Mascotas {

    int edad;
    int numPatas;
    String nombre;
    String marcaComida;
    String raza;
    String tipoAmbiente;
    String juguete;

    public Mascotas(int edad, int numPatas, String nombre, String marcaComida, String raza, String tipoAmbiente, String juguete) {
        this.edad = edad;
        this.numPatas = numPatas;
        this.nombre = nombre;
        this.marcaComida = marcaComida;
        this.raza = raza;
        this.tipoAmbiente = tipoAmbiente;
        this.juguete = juguete;
    }

    protected abstract void hacerRuido();

    protected abstract void moverse();

    protected abstract void jugar(String juguete);
}

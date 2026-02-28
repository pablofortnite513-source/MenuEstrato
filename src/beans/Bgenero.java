package beans;

public class Bgenero {

    private byte codigo;
    private String nombre;

    public Bgenero(byte codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public byte getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return nombre;
    }
}

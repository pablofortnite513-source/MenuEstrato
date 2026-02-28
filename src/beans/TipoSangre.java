package beans;

public class TipoSangre {

    private byte codigo;
    private String descripcion;

    public TipoSangre() {
    }

    public TipoSangre(byte codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
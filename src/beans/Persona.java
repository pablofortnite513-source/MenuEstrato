package beans;

public class Persona {

    private int identificacion;
    private String nombre;
    private byte tipoSangre;
    private byte sexo;
    private byte estrato;
    private String celular;
    private String fijo;
    private String direccion;

    public Persona(int identificacion, String nombre, byte tipoSangre,
                   byte sexo, byte estrato,
                   String celular, String fijo, String direccion) {

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
        this.estrato = estrato;
        this.celular = celular;
        this.fijo = fijo;
        this.direccion = direccion;
    }

    public int getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public byte getTipoSangre() { return tipoSangre; }
    public byte getSexo() { return sexo; }
    public byte getEstrato() { return estrato; }
    public String getCelular() { return celular; }
    public String getFijo() { return fijo; }
    public String getDireccion() { return direccion; }
}

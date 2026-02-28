package beans;

public class Bsexo {

    private byte codeSexo;
    private String nombreSexo;

    public Bsexo() {
        this.codeSexo = 0;
        this.nombreSexo = "";
    }

    public Bsexo(byte codeSexo, String nombreSexo) {
        this.codeSexo = codeSexo;
        this.nombreSexo = nombreSexo;
    }

    public byte getCodeSexo() {
        return codeSexo;
    }

    public void setCodeSexo(byte codeSexo) {
        this.codeSexo = codeSexo;
    }

    public String getNombreSexo() {
        return nombreSexo;
    }

    public void setNombreSexo(String nombreSexo) {
        this.nombreSexo = nombreSexo;
    }
}

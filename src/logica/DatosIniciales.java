package logica;

import java.util.ArrayList;
import beans.*;

public class DatosIniciales {

    public static void cargarSexos(ArrayList<Bsexo> lista) {
        lista.add(new Bsexo((byte)1, "Masculino"));
        lista.add(new Bsexo((byte)2, "Femenino"));
    }

    public static void cargarTiposSangre(ArrayList<TipoSangre> lista) {
        lista.add(new TipoSangre((byte)1, "O+"));
        lista.add(new TipoSangre((byte)2, "O-"));
        lista.add(new TipoSangre((byte)3, "A+"));
        lista.add(new TipoSangre((byte)4, "A-"));
        lista.add(new TipoSangre((byte)5, "B+"));
        lista.add(new TipoSangre((byte)6, "B-"));
        lista.add(new TipoSangre((byte)7, "AB+"));
        lista.add(new TipoSangre((byte)8, "AB-"));
    }

    public static void cargarEstratos(ArrayList<Estrato> lista) {
        lista.add(new Estrato((byte)1, "Bajo-Bajo"));
        lista.add(new Estrato((byte)2, "Bajo"));
        lista.add(new Estrato((byte)3, "Bajo-Medio"));
        lista.add(new Estrato((byte)4, "Medio"));
        lista.add(new Estrato((byte)5, "Medio-Alto"));
        lista.add(new Estrato((byte)6, "Alto"));
    }

    public static void cargarGeneros(ArrayList<Bgenero> lista) {
        lista.add(new Bgenero((byte)1, "Masculino"));
        lista.add(new Bgenero((byte)2, "Femenino"));
        lista.add(new Bgenero((byte)3, "No binario"));
    }
}

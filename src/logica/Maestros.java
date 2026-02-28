package logica;

import java.util.ArrayList;
import beans.*;

public class Maestros {

    public static ArrayList<Bsexo> listaSexos = new ArrayList<>();
    public static ArrayList<TipoSangre> listaTipoSangre = new ArrayList<>();
    public static ArrayList<Estrato> listaEstratos = new ArrayList<>();
    public static ArrayList<Persona> listaPersonas = new ArrayList<>();
    public static ArrayList<Bgenero> listaGeneros = new ArrayList<>();
    
    // Cargar todos los datos maestros
    public static void inicializar() {
        DatosIniciales.cargarSexos(listaSexos);
        DatosIniciales.cargarTiposSangre(listaTipoSangre);
        DatosIniciales.cargarEstratos(listaEstratos);
        DatosIniciales.cargarGeneros(listaGeneros);
    }
    
 // LISTAR SEXOS
    public static ArrayList<Bsexo> listarSexos() {
        return listaSexos;
    }

    // LISTAR TIPOS DE SANGRE
    public static ArrayList<TipoSangre> listarTipoSangre() {
        return listaTipoSangre;
    }

    // LISTAR ESTRATOS
    public static ArrayList<Estrato> listarEstratos() {
        return listaEstratos;
    }

    // LISTAR PERSONAS
    public static ArrayList<Persona> listarPersonas() {
        return listaPersonas;
    }
    
 // LISTAR GENEROS
    public static ArrayList<Bgenero> listarGeneros() {
        return listaGeneros;
    }
}
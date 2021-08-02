/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import archivos.ArchivoPalabras;
import java.util.ArrayList;
import java.util.List;
import modelo.Juego;

/**
 *
 * @author santy
 */
public class ControladorJuego {
    private List<Juego> datos;
    private Juego seleccionado;
    
    public ControladorJuego() {
        datos = new ArrayList<Juego>();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    
    public boolean crear(long id, String nombreJugador, int numIntentos) {
        Juego juego = new Juego(generarId(), nombreJugador, numIntentos); 
        return datos.add(juego); 
    }   
    
    public Juego buscar(String nombre){
        for (Juego juego : datos) { 
            if(juego.getNombreJugador().equals(nombre) == true){ 
                return juego; 
            }
        }
        return null; // Si no encuentra retorna null
    }
    
    public List<String> obtenerPalabras(){
        ArchivoPalabras archivo = new ArchivoPalabras("/Documentos/universidad ups/programacion objetos/examen final/Programa/Ahorcado_Examen/src/archivos/palabras.txt");
        return archivo.leer();
    }
    
    

    public List<Juego> getDatos() {
        return datos;
    }

    public void setDatos(List<Juego> datos) {
        this.datos = datos;
    }

    public Juego getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Juego seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
}

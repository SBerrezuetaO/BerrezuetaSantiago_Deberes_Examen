/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santy
 */
public class Juego {
    private long id;
    private String nombreJugador;
    private String palabra;
    private int numIntentos;
    private int numAciertos;
    private List<String> listaPalabras;
    
    public Juego() {
        this.id = -1;
    }

    public Juego(long id, String nombreJugador, int numIntentos) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.numIntentos = numIntentos;
        this.numAciertos = 0;
    }
    
    public Juego(long id, String nombreJugador, int numIntentos, String palabra) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.palabra = palabra;
        this.numIntentos = numIntentos;
        this.numAciertos = 0;
    }
    
    public Juego(long id, String nombreJugador, int numIntentos, List<String> listaPalabras) {
        this.id = id;
        this.nombreJugador = nombreJugador;
        this.numIntentos = numIntentos;
        this.numAciertos = 0;
        this.listaPalabras = listaPalabras;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getNumIntentos() {
        return numIntentos;
    }

    public void setNumIntentos(int numIntentos) {
        this.numIntentos = numIntentos;
    }

    public List<String> getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(List<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    public int getNumAciertos() {
        return numAciertos;
    }

    public void setNumAciertos(int numAciertos) {
        this.numAciertos = numAciertos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Juego{" + "id=" + id + ", nombreJugador=" + nombreJugador + ", palabra=" + palabra + ", numIntentos=" + numIntentos + ", numAciertos=" + numAciertos + '}';
    }

    
    
}

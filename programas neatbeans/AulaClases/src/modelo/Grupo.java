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
public class Grupo {
    private long id;
    private String nombre;
    private List<Asignatura> listaAsignaturas;
    private Aula aula;
    
    public Grupo(){
        this.id = 0;
        this.nombre = null;
        this.listaAsignaturas = null;
    }
    
    public Grupo(long id, String nombre, Aula aula){
        this.id = id;
        this.nombre = nombre;
        this.aula = aula;
        this.listaAsignaturas = new ArrayList();
    }
    
    public Grupo(long id, String nombre, Aula aula, List<Asignatura> listaAsignaturas){
        this.id = id;
        this.nombre = nombre;
        this.aula = aula;
        this.listaAsignaturas = listaAsignaturas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(List<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    
    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", Lista de Asignaturas= " +listaAsignaturas +'}';
    }
    
}

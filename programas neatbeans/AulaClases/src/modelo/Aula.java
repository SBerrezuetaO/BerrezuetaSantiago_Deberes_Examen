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
public class Aula {
    private long id;
    private String descripcion;
    private List<Grupo> listaGrupos;
    
    public Aula(long id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
        listaGrupos = new ArrayList();
    }
   
    public Aula(){
        this.id = 0;
        this.descripcion = null;
        this.listaGrupos = new ArrayList();
    }
    
    public Aula(long id, String descripcion, List<Grupo> listaGrupos){
        this.id = id;
        this.descripcion = descripcion;
        this.listaGrupos = listaGrupos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(List<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    
    @Override
    public String toString() {
        return "Aula{" + "id= " + id + ", descripcion= " + descripcion + ", Grupos= " +listaGrupos +'}';
    }
    
    
    
}

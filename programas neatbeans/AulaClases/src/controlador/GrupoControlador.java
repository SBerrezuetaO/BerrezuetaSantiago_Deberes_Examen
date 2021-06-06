/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Aula;
import modelo.Grupo;

/**
 *
 * @author santy
 */
public class GrupoControlador {
    private List<Grupo> listagrupos;
    private Grupo seleccionado;
    
    public GrupoControlador() {
        listagrupos = new ArrayList<Grupo>();
        seleccionado = null;
    }
    
    public boolean crear(long id, String nombre, Aula aula ) {
        Grupo grupo = new Grupo(id, nombre, aula); 
        aula.getListaGrupos().add(grupo);
        return listagrupos.add(grupo); 
    }
    
    public Grupo buscar(String nombre){
        for (Grupo grupo : listagrupos) { 
            if(grupo.getNombre().equals(nombre) == true){ 
                return grupo; 
            }
        }
        return null; 
    }
    
    public boolean actualizar(long id, String nombre) {
        Grupo grupo = this.buscar(nombre); 
        if(grupo != null) { 
            int posicion = listagrupos.indexOf(grupo); 
            grupo.setId(id); 
            grupo.setNombre(nombre); 
            listagrupos.set(posicion, grupo); 
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String nombre) {
        Grupo grupo = this.buscar(nombre);
        if(grupo != null){
            
            return listagrupos.remove(grupo);
        }
        return false;
    }
    
    public void imprimir(){
        for (Grupo grupo : listagrupos) {
            System.out.println(grupo);
        }
    }

    public List<Grupo> getListagrupos() {
        return listagrupos;
    }

    public void setListagrupos(List<Grupo> listagrupos) {
        this.listagrupos = listagrupos;
    }

    public Grupo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Grupo seleccionado) {
        this.seleccionado = seleccionado;
    }

    
    
}

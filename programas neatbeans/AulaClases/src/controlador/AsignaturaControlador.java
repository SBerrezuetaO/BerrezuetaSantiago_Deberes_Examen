/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;
import modelo.Grupo;

/**
 *
 * @author santy
 */
public class AsignaturaControlador {
   private List<Asignatura> listaasignaturas;
    private Asignatura asignatura;
    
    public AsignaturaControlador() {
        listaasignaturas = new ArrayList<Asignatura>();
        asignatura = null;
    }
    
    public boolean crear(long id, String nombre, Grupo grupo) {
        Asignatura asignatura = new Asignatura(id, nombre, grupo); 
        grupo.getListaAsignaturas().add(asignatura);
        return listaasignaturas.add(asignatura); 
    }
    
    public Asignatura buscar(String nombre){
        for (Asignatura asignatura : listaasignaturas) { 
            if(asignatura.getNombre().equals(nombre) == true){ 
                return asignatura; 
            }
        }
        return null; 
    }
    
    public boolean actualizar(long id, String nombre) {
        Asignatura asignatura = this.buscar(nombre); 
        if(asignatura != null) { 
            int posicion = listaasignaturas.indexOf(asignatura); 
            asignatura.setId(id); 
            asignatura.setNombre(nombre); 
            listaasignaturas.set(posicion, asignatura); 
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String nombre) {
        Asignatura asignatura = this.buscar(nombre);
        if(asignatura != null){
            
            return listaasignaturas.remove(asignatura);
        }
        return false;
    }
    
    public void imprimir(){
        for (Asignatura asignatura : listaasignaturas) {
            System.out.println(asignatura);
        }
    } 

    public List<Asignatura> getListaasignaturas() {
        return listaasignaturas;
    }

    public void setListaasignaturas(List<Asignatura> listaasignaturas) {
        this.listaasignaturas = listaasignaturas;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    
}

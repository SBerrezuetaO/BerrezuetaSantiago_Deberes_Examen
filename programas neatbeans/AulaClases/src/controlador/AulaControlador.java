/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Aula;

/**
 *
 * @author santy
 */
public class AulaControlador {
    private List<Aula> listaaulas;
    private Aula seleccionado;
    
    public AulaControlador() {
        listaaulas = new ArrayList();
        seleccionado = null;
    }
    
    public boolean crear(long id, String descripcion) {
        Aula aula = new Aula(id, descripcion); 
        return listaaulas.add(aula); 
    }
    
    public Aula buscar(String descripcion){
        for (Aula aula : listaaulas) { 
            if(aula.getDescripcion().equals(descripcion) == true){ 
                return aula; 
            }
        }
        return null; 
    }
    
    public boolean actualizar(long id, String descripcion) {
        Aula aula = this.buscar(descripcion); 
        if(aula != null) { 
            int posicion = listaaulas.indexOf(aula); 
            aula.setId(id); 
            aula.setDescripcion(descripcion); 
            listaaulas.set(posicion, aula); 
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String descripcion) {
        Aula aula = this.buscar(descripcion);
        if(aula != null){
            
            return listaaulas.remove(aula);
        }
        return false;
    }
    
    public void imprimir(){
        for (Aula aula : listaaulas) {
            System.out.println(aula);
        }
    }

    public List<Aula> getListaaulas() {
        return listaaulas;
    }

    public void setListaaulas(List<Aula> listaaulas) {
        this.listaaulas = listaaulas;
    }

    public Aula getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Aula seleccionado) {
        this.seleccionado = seleccionado;
    }

  
    
}

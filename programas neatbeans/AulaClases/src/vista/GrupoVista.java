/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AulaControlador;
import controlador.GrupoControlador;
import java.util.Scanner;
import modelo.Grupo;

/**
 *
 * @author santy
 */
public class GrupoVista {
    private Scanner teclado;
    private GrupoControlador grupoControlador;
    private AulaControlador aulaControlador;
    
    
    public GrupoVista(AulaControlador aulaControlador){
        this.teclado = new Scanner(System.in);
        this.grupoControlador = new GrupoControlador();
        this.aulaControlador = aulaControlador;
        
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Grupos");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: 
                    this.crear(); 
                break;
                case 2: 
                    this.actualizar(); 
                break;
                case 3: 
                    this.buscar(); 
                break;
                case 4: 
                    this.eliminar(); 
                break;
                case 5: 
                    System.out.println("Listado de grupos: ");
                    grupoControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
    public void crear() {
        System.out.println("Ingrese los siguientes datos del grupo:");
        System.out.println("Id: ");
        long id = teclado.nextLong();
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.crear(id, nombre,aulaControlador.getSeleccionado());
        System.out.println("Grupo creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar el grupo: ");
        System.out.println("Nuevo Id: ");
        long id = teclado.nextLong();
        System.out.println("Nuevo Nombre ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.actualizar(id, nombre);
        System.out.println("Grupo actualizado: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Grupo: ");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.eliminar(nombre);
        System.out.println("Grupo eliminado: " + resultado);
    }
    public Grupo buscar(){
        System.out.println("Buscar Grupo");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        Grupo grupo = grupoControlador.buscar(nombre);
        System.out.println(grupo);
        return grupo;
    }

    public GrupoControlador getGrupoControlador() {
        return grupoControlador;
    }

    public void setGrupoControlador(GrupoControlador grupoControlador) {
        this.grupoControlador = grupoControlador;
    }
    
    public void asignarSeleccionado(Grupo grupo) {
        grupoControlador.setSeleccionado(grupo);
    }
    
}

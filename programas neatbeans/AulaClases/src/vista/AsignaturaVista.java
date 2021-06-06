/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AsignaturaControlador;
import controlador.GrupoControlador;
import java.util.Scanner;
import modelo.Asignatura;

/**
 *
 * @author santy
 */
public class AsignaturaVista {
    private Scanner teclado;
    private AsignaturaControlador asignaturaControlador;
    private GrupoControlador grupoControlador;
    
    
    public AsignaturaVista(GrupoControlador grupoControlador){
        this.teclado = new Scanner(System.in);
        this.asignaturaControlador = new AsignaturaControlador();
        this.grupoControlador = grupoControlador;
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Asignaturas");
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
                    System.out.println("Listado de Asignaturas: ");
                    asignaturaControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
    public void crear() {
        System.out.println("Ingrese los siguientes datos de la Asignatura:");
        System.out.println("Id: ");
        long id = teclado.nextLong();
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = asignaturaControlador.crear(id, nombre, grupoControlador.getSeleccionado());
        System.out.println("Asignatura creada: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar la Asignatura: ");
        System.out.println("Nuevo Id: ");
        long id = teclado.nextLong();
        System.out.println("Nuevo Nombre ");
        String nombre = teclado.next();
        boolean resultado = asignaturaControlador.actualizar(id, nombre);
        System.out.println("Asignatura actualizada: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Asignatura: ");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = asignaturaControlador.eliminar(nombre);
        System.out.println("Asignatura eliminada: " + resultado);
    }
    public Asignatura buscar(){
        System.out.println("Buscar Asignatura");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        Asignatura asignatura = asignaturaControlador.buscar(nombre);
        System.out.println(asignatura);
        return asignatura;
    }

    public AsignaturaControlador getAsignaturaControlador() {
        return asignaturaControlador;
    }

    public void setAsignaturaControlador(AsignaturaControlador asignaturaControlador) {
        this.asignaturaControlador = asignaturaControlador;
    }
    
    
}

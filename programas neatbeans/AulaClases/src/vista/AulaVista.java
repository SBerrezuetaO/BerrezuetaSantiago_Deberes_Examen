/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AulaControlador;
import java.util.Scanner;
import modelo.Aula;

/**
 *
 * @author santy
 */
public class AulaVista {
    private Scanner teclado;
    private AulaControlador aulaControlador;
    
    
    public AulaVista(){
        this.teclado = new Scanner(System.in);
        this.aulaControlador = new AulaControlador();
    }
    
    public void menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Aulas");
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
                    System.out.println("Listado de aulas: ");
                    aulaControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
    public void crear() {
        System.out.println("Ingrese los siguientes datos del aula:");
        System.out.println("Id: ");
        long id = teclado.nextLong();
        System.out.println("Descripcion: ");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.crear(id, descripcion);
        System.out.println("Aula creada: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar el cliente: ");
        System.out.println("Nuevo Id: ");
        long id = teclado.nextLong();
        System.out.println("Nueva Descripcion ");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.actualizar(id, descripcion);
        System.out.println("Cliente actualizado: " + resultado);
    }
    public void eliminar(){
        System.out.println("Eliminar Aula: ");
        System.out.println("Descripcion: ");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.eliminar(descripcion);
        System.out.println("Aula eliminada: " + resultado);
    }
    public Aula buscar(){
        System.out.println("Buscar Aula");
        System.out.println("Descripcion: ");
        String descripcion = teclado.next();
        Aula aula = aulaControlador.buscar(descripcion);
        System.out.println(aula);
        return aula;
    }

    public AulaControlador getAulaControlador() {
        return aulaControlador;
    }

    public void setAulaControlador(AulaControlador aulaControlador) {
        this.aulaControlador = aulaControlador;
    }
    
    public void asignarSelecionado(Aula aula){
        aulaControlador.setSeleccionado(aula);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author santy
 */
public class ArchivoPalabras {
    private String ruta;
    private ArrayList<String> lista;

    public ArchivoPalabras(String ruta) {
        this.ruta = ruta;
        this.lista = new ArrayList();
    } 
    
    public List<String> leer() {
        try {
            FileReader archivo = new FileReader(this.ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            String palabra = "";
            while(palabra != null){
                palabra = lectura.readLine();
                this.lista.add(palabra);
            }
            lectura.close();
            archivo.close();
            return this.lista;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return this.lista;
    }
}

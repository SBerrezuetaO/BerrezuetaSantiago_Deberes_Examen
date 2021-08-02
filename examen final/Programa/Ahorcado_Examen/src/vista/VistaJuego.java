/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorJuego;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Juego;


/**
 *
 * @author santy
 */
public class VistaJuego extends javax.swing.JFrame {

    /**
     * Creates new form VistaJuego
     */
    public ControladorJuego controladorJuego;
    /**
     * Creates new form VistaJuego
     */
    

    public VistaJuego(ControladorJuego controladorJuego) {
        initComponents();
        this.controladorJuego = controladorJuego;
        this.setVisible(true);
        palabraRandom();
        cargarValores();
    }

    public void palabraRandom(){
        int num = (int)(Math.random()*10);
        ArrayList datos = new ArrayList();
        int cont=0;
        for (String dato : controladorJuego.obtenerPalabras()) {
            datos.add(dato);
            if (cont==9){
                String palabra=(String) datos.get(num);
                controladorJuego.getSeleccionado().setPalabra(palabra);
            }
            cont=cont+1;
        }
    }
    
    public void adivinar(char letra) throws IOException{
        String oculto = controladorJuego.getSeleccionado().getPalabra();
        String adivinanza = jTextField2.getText();
        int intento = Integer.parseInt(jLabel4.getText());
        int acierto = Integer.parseInt(jLabel7.getText());
        int cont =0;
        char[] tempCharArray2 = adivinanza.toCharArray();
        char[] tempCharArray = oculto.toCharArray();
        for(int x = 0; x <tempCharArray.length ; x = x + 1){
            if(tempCharArray[x] == letra){
                tempCharArray2[x] = letra;
                cont=1;
            }     
        }
        if (cont==0){
            intento = intento - 1;
            if (intento==0){
                controladorJuego.getSeleccionado().setNumAciertos(acierto);
                JOptionPane.showMessageDialog(null, "PERDISTE");
                principal Principal = new principal();
                this.setVisible(false);
                System.out.println(controladorJuego.getDatos());
                String archCSV = "/Documentos/universidad ups/programacion objetos/examen final/Programa/Ahorcado_Examen/src/archivos/resultados.csv";
                crearArchivoCSV(archCSV);
            }
            String numIntento = String.valueOf(intento);
            jLabel4.setText(numIntento);
            jLabel5.setText("EQUIVOCADO");
        } else if(cont==1){
            jLabel5.setText("ACERTASTE");
            acierto=acierto+1;
            String numAcierto = String.valueOf(acierto);
            jLabel7.setText(numAcierto);
        }
        adivinanza = String.valueOf(tempCharArray2);
        oculto = String.valueOf(tempCharArray);
        jTextField2.setText(adivinanza);
        if(adivinanza.equals(oculto)){
            controladorJuego.getSeleccionado().setNumAciertos(acierto);
            JOptionPane.showMessageDialog(null, "GANASTE");
            principal Principal = new principal();
            this.setVisible(false);
            System.out.println(controladorJuego.getDatos());
            String archCSV = "/Documentos/universidad ups/programacion objetos/examen final/Programa/Ahorcado_Examen/src/archivos/resultados.csv";
            crearArchivoCSV(archCSV);
        }
        jTextField1.setText("");
    }
    
    public void cargarValores(){
        String oculto = controladorJuego.getSeleccionado().getPalabra();
        System.out.println(oculto);
        char[] tempCharArray = oculto.toCharArray();
        for(int x = 0; x <tempCharArray.length ; x = x + 1){
            tempCharArray[x] = '*'; 
        }
        oculto = String.valueOf(tempCharArray);
        jTextField2.setText(oculto);
        jLabel4.setText(String.valueOf(controladorJuego.getSeleccionado().getNumIntentos()));
    }
    
    private void crearArchivoCSV(String nombreDeArchivo) {
	crearArchivoCSV(nombreDeArchivo, ",");
    }
    
    private void crearArchivoCSV(String file, String delim) {
	final String NEXT_LINE = "\n";
        List<List<String>> rows = Arrays.asList(
            Arrays.asList(controladorJuego.getSeleccionado().getNombreJugador(), controladorJuego.getSeleccionado().getPalabra(), String.valueOf(controladorJuego.getSeleccionado().getNumIntentos()),String.valueOf(controladorJuego.getSeleccionado().getNumAciertos()))
        );
	try {
            
            FileWriter csvWriter = new FileWriter(file);
            /**
            csvWriter.append("Nombre");
            csvWriter.append(",");
            csvWriter.append("Palabra");
            csvWriter.append(",");
            csvWriter.append("Num Intentos");
            csvWriter.append(",");
            csvWriter.append("Num Aciertos");
            csvWriter.append("\n");
            */

        for (List<String> rowData : rows) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
    
        

        
    /**
    private void crearArchivoCSV(String nombreDeArchivo) {
	crearArchivoCSV(nombreDeArchivo, ",");
    }

    private void crearArchivoCSV(String file, String delim) {
	final String NEXT_LINE = "\n";
	try {
        	FileWriter fw = new FileWriter(file);
		fw.append(controladorJuego.getSeleccionado().getNombreJugador()).append(delim);
                fw.append(controladorJuego.getSeleccionado().getPalabra()).append(delim);
                fw.append(String.valueOf(controladorJuego.getSeleccionado().getNumIntentos())).append(delim);
                fw.append(String.valueOf(controladorJuego.getSeleccionado().getNumAciertos())).append(delim);
                fw.append(NEXT_LINE);

		fw.flush();
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("EL AHORCADO");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("Escriba una letra para adivinar");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("INTENTOS RESTANTES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("0");

        jButton1.setText("ADIVINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel6.setText("ACIERTOS");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(216, 216, 216)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        char letra = jTextField1.getText().charAt(0);
        try {
            adivinar(letra);
        } catch (IOException ex) {
            Logger.getLogger(VistaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "SOLO INGRESE LETRAS");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

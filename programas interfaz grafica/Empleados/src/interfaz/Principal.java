/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
PROFE SON SUS INTERFACES YO NO HICE ESTA PARTE
*/

package interfaz;

import controlador.ControladorEmpresa;
import controlador.ControladorPersona;
import modelo.Cliente;
import modelo.Directivo;
import modelo.Empleado;

/**
 *
 * @author diego
 */
public class Principal extends javax.swing.JFrame {

    public ControladorEmpresa controladorEmpresa = new ControladorEmpresa();
    public ControladorPersona controladorPersona = new ControladorPersona();
    public EmpresaVista empresaVista;
    public VistaPersona vistaPersona;
    public Principal() {
        initComponents();
        controladorEmpresa = new ControladorEmpresa();
        controladorPersona = new ControladorPersona();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuEmpresa = new javax.swing.JMenu();
        mniGestionar = new javax.swing.JMenuItem();
        nmuPersonal = new javax.swing.JMenu();
        mniClientes = new javax.swing.JMenuItem();
        mniDirectivos = new javax.swing.JMenuItem();
        mniEmpleados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("ProgresarEC"); // NOI18N

        dtpPrincipal.setAutoscrolls(true);

        javax.swing.GroupLayout dtpPrincipalLayout = new javax.swing.GroupLayout(dtpPrincipal);
        dtpPrincipal.setLayout(dtpPrincipalLayout);
        dtpPrincipalLayout.setHorizontalGroup(
            dtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        dtpPrincipalLayout.setVerticalGroup(
            dtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        mnuEmpresa.setText("Empresa");

        mniGestionar.setText("Gestionar");
        mniGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGestionarActionPerformed(evt);
            }
        });
        mnuEmpresa.add(mniGestionar);

        jMenuBar1.add(mnuEmpresa);

        nmuPersonal.setText("Personal");

        mniClientes.setText("Clientes");
        mniClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesActionPerformed(evt);
            }
        });
        nmuPersonal.add(mniClientes);

        mniDirectivos.setText("Directivos");
        mniDirectivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDirectivosActionPerformed(evt);
            }
        });
        nmuPersonal.add(mniDirectivos);

        mniEmpleados.setText("Empleados");
        mniEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmpleadosActionPerformed(evt);
            }
        });
        nmuPersonal.add(mniEmpleados);

        jMenuBar1.add(nmuPersonal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dtpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dtpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGestionarActionPerformed
        empresaVista = new EmpresaVista(controladorEmpresa);
        dtpPrincipal.add(empresaVista);
        empresaVista.show();
    }//GEN-LAST:event_mniGestionarActionPerformed

    private void mniClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesActionPerformed
        vistaPersona = new VistaPersona(controladorEmpresa, controladorPersona, Cliente.class);
        dtpPrincipal.add(vistaPersona);
        vistaPersona.show();
    }//GEN-LAST:event_mniClientesActionPerformed

    private void mniDirectivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDirectivosActionPerformed
        vistaPersona = new VistaPersona(controladorEmpresa, controladorPersona, Directivo.class);
        dtpPrincipal.add(vistaPersona);
        vistaPersona.show();
    }//GEN-LAST:event_mniDirectivosActionPerformed

    private void mniEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmpleadosActionPerformed
        vistaPersona = new VistaPersona(controladorEmpresa, controladorPersona, Empleado.class);
        dtpPrincipal.add(vistaPersona);
        vistaPersona.show();
    }//GEN-LAST:event_mniEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtpPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniClientes;
    private javax.swing.JMenuItem mniDirectivos;
    private javax.swing.JMenuItem mniEmpleados;
    private javax.swing.JMenuItem mniGestionar;
    private javax.swing.JMenu mnuEmpresa;
    private javax.swing.JMenu nmuPersonal;
    // End of variables declaration//GEN-END:variables
}
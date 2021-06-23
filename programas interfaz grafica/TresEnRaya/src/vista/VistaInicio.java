/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author santy
 */
public class VistaInicio extends JFrame implements ItemListener{
    //variables
    int i;
    double r,n1,n2;
    String c1="",c2="",c3="",c4="",c5="",c6="",c7="",c8="",c9="";
    char op;
    JComboBox<String> combo1,combo2,combo3,combo4,combo5,combo6,combo7,combo8,combo9;
    JTextField resp;
    JButton boton;
    
    
    public VistaInicio(){
        //creacion de las variables
        super();
        setLayout(new BorderLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3,3));
        setTitle("TRES EN RAYA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creaciones botones operaciones y especiales
        combo1=new JComboBox<String>();
        panelPrincipal.add(combo1);
        combo1.addItem(" ");
        combo1.addItem("X");
        combo1.addItem("O");
        combo1.addItemListener(this);
        combo2=new JComboBox<String>();
        panelPrincipal.add(combo2);
        combo2.addItem(" ");
        combo2.addItem("X");
        combo2.addItem("O");
        combo2.addItemListener(this);
        combo3=new JComboBox<String>();
        panelPrincipal.add(combo3);
        combo3.addItem(" ");
        combo3.addItem("X");
        combo3.addItem("O");
        combo3.addItemListener(this);
        combo4=new JComboBox<String>();
        panelPrincipal.add(combo4);
        combo4.addItem(" ");
        combo4.addItem("X");
        combo4.addItem("O");
        combo4.addItemListener(this);
        combo5=new JComboBox<String>();
        panelPrincipal.add(combo5);
        combo5.addItem(" ");
        combo5.addItem("X");
        combo5.addItem("O");
        combo5.addItemListener(this);
        combo6=new JComboBox<String>();
        panelPrincipal.add(combo6);
        combo6.addItem(" ");
        combo6.addItem("X");
        combo6.addItem("O");
        combo6.addItemListener(this);
        combo7=new JComboBox<String>();
        panelPrincipal.add(combo7);
        combo7.addItem(" ");
        combo7.addItem("X");
        combo7.addItem("O");
        combo7.addItemListener(this);
        combo8=new JComboBox<String>();
        panelPrincipal.add(combo8);
        combo8.addItem(" ");
        combo8.addItem("X");
        combo8.addItem("O");
        combo8.addItemListener(this);
        combo9=new JComboBox<String>();
        panelPrincipal.add(combo9);
        combo9.addItem(" ");
        combo9.addItem("X");
        combo9.addItem("O");
        combo9.addItemListener(this);
        boton=new JButton("Reiniciar");
        //creacion del textbox de los resultados
        add(panelPrincipal,BorderLayout.CENTER);
        resp = new JTextField(10);
        resp.setText("Jugador 1 (X) / Jugador 2 (O)");
        add(resp,BorderLayout.NORTH);
        setVisible(true);
        setSize(200,200);
    }
    
    
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            c1 = seleccionado;
        }
        if (e.getSource()==combo2) {
            String seleccionado=(String)combo2.getSelectedItem();
            c2 = seleccionado;
        }
        if (e.getSource()==combo3) {
            String seleccionado=(String)combo3.getSelectedItem();
            c3 = seleccionado;
        }
        if (e.getSource()==combo4) {
            String seleccionado=(String)combo4.getSelectedItem();
            c4 = seleccionado;
        }
        if (e.getSource()==combo5) {
            String seleccionado=(String)combo5.getSelectedItem();
            c5 = seleccionado;
        }
        if (e.getSource()==combo6) {
            String seleccionado=(String)combo6.getSelectedItem();
            c6 = seleccionado;
        }
        if (e.getSource()==combo7) {
            String seleccionado=(String)combo7.getSelectedItem();
            c7 = seleccionado;
        }
        if (e.getSource()==combo8) {
            String seleccionado=(String)combo8.getSelectedItem();
            c8 = seleccionado;
        }
        if (e.getSource()==combo9) {
            String seleccionado=(String)combo9.getSelectedItem();
            c9 = seleccionado;
        }
        
        if(c1.equals(c2) && c2.equals(c3) ){
           if(c1.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c1.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2"); 
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c4.equals(c5) && c5.equals(c6)){
           if(c4.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c4.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c7.equals(c8) && c8.equals(c9) ){
           if(c7.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c7.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c1.equals(c4) && c4.equals(c7) ){
           if(c1.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c1.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c2.equals(c5) && c5.equals(c8) ){
           if(c2.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1"); 
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c2.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2"); 
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c3.equals(c6) && c6.equals(c9) ){
           if(c3.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c3.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c1.equals(c5) && c5.equals(c9) ){
           if(c1.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c1.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c3.equals(c5) && c5.equals(c7) ){
           if(c3.equals("X")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 1"); 
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           } 
           if(c3.equals("O")){
               JOptionPane.showMessageDialog(this,"GANA EL JUGADOR 2");
               c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
               combo1.setSelectedIndex(0);
               combo2.setSelectedIndex(0);
               combo3.setSelectedIndex(0);
               combo4.setSelectedIndex(0);
               combo5.setSelectedIndex(0);
               combo6.setSelectedIndex(0);
               combo7.setSelectedIndex(0);
               combo8.setSelectedIndex(0);
               combo9.setSelectedIndex(0);
           }
        }
        
        if(c1!="" && c2!="" && c3!="" && c4!="" && c5!="" && c6!="" && c7!="" && c8!="" && c9!=""){
            JOptionPane.showMessageDialog(this,"EMPATE");
            c1="";c2="";c3="";c4="";c5="";c6="";c7="";c8="";c9="";
            combo1.setSelectedIndex(0);
            combo2.setSelectedIndex(0);
            combo3.setSelectedIndex(0);
            combo4.setSelectedIndex(0);
            combo5.setSelectedIndex(0);
            combo6.setSelectedIndex(0);
            combo7.setSelectedIndex(0);
            combo8.setSelectedIndex(0);
            combo9.setSelectedIndex(0);
        }
        
        System.out.println("Actualizado");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
    }
}
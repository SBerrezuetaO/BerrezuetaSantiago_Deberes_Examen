/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


/**
 *
 * @author santy
 */
public class VistaInicio extends JFrame implements ActionListener {
    
    JRadioButton rb1,rb2,rb3,rb4;    
    JButton b;
    SeleccionR seleccionR = new SeleccionR();
    Graphics g = getGraphics();
    
    
    public VistaInicio(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rb1=new JRadioButton("Cuadrado");    
        rb1.setBounds(100,50,100,30);      
        rb2=new JRadioButton("Linea");    
        rb2.setBounds(100,100,100,30); 
        rb3=new JRadioButton("Rectangulo");    
        rb3.setBounds(100,150,100,30);
        rb4=new JRadioButton("Circulo");    
        rb4.setBounds(100,200,100,30);
        ButtonGroup grupo1=new ButtonGroup();    
        grupo1.add(rb1);grupo1.add(rb2);grupo1.add(rb3);grupo1.add(rb4);    
        b=new JButton("Mostrar");    
        b.setBounds(100,250,80,30);    
        b.addActionListener(this);    
        add(rb1);add(rb2);add(rb3);add(rb4);add(b);    
        setSize(500,400);    
        setLayout(null);      
    }
    
    public class SeleccionR extends JFrame {
        @Override
        public void paint (Graphics g){
            System.out.println("funciona");
            super.paint(g);
            g.setColor (Color.blue);
            //g.drawRoundRect (300, 150, 50, 50, 6, 6);
            //g.drawLine(300, 150, 400, 150);
            g.drawRect (300, 150, 50, 70);
            //g.drawOval (300, 150, 50, 70);
        } 
    }
    
    /*
        public void paint (Graphics g){
            super.paint(g);
            g.setColor (Color.blue);
            //g.drawRoundRect (300, 150, 50, 50, 6, 6);
            //g.drawLine(300, 150, 400, 150);
            g.drawRect (300, 150, 50, 70);
            //g.drawOval (300, 150, 50, 70);
        }
    */
    
    public void actionPerformed(ActionEvent e) {
        if(rb1.isSelected()){
            seleccionR.paint(g);
            JOptionPane.showMessageDialog(this,"Es un Cuadrado");  
        }else if(rb2.isSelected()){
            ;
            JOptionPane.showMessageDialog(this,"Es una Linea");
        }else if (rb3.isSelected()){
            
            JOptionPane.showMessageDialog(this,"Es un Rectangulo");
        }else if (rb4.isSelected()){
            
            JOptionPane.showMessageDialog(this,"Es un Circulo");
        }
        
    }

    
}
    
    


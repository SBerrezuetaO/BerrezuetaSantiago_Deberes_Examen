/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author santy
 */
public class VistaInicio extends JFrame implements ActionListener{
    //variables
    int i;
    double r,n1,n2;
    char op;
    JTextField resp;
    JButton boton10,boton11,boton12,boton13,boton14,boton15,boton16;
    JButton boton[]=new JButton[10];
    
    public VistaInicio(){
        //creacion de las variables
        super();
        setLayout(new BorderLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(4,5));
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creaciones botones 0 al 9
        for(int i=0;i<=9;i++){
            boton[i]=new JButton(i+"");
            panelPrincipal.add(boton[i]);
            boton[i].addActionListener(this);
        }
        //creaciones botones operaciones y especiales
        boton10=new JButton("+");
        panelPrincipal.add(boton10);
        boton10.addActionListener(this);
        boton11=new JButton("-");
        panelPrincipal.add(boton11);
        boton11.addActionListener(this);
        boton12=new JButton("*");
        panelPrincipal.add(boton12);
        boton12.addActionListener(this);
        boton13=new JButton("/");
        panelPrincipal.add(boton13);
        boton13.addActionListener(this);
        boton14=new JButton("=");
        panelPrincipal.add(boton14);
        boton14.addActionListener(this);
        boton15=new JButton(".");
        panelPrincipal.add(boton15);
        boton15.addActionListener(this);
        boton16=new JButton("C");
        panelPrincipal.add(boton16);
        boton16.addActionListener(this);
        //creacion del textbox de los resultados
        resp = new JTextField(10);
        add(panelPrincipal,BorderLayout.CENTER);
        add(resp,BorderLayout.NORTH);
        setVisible(true);
        setSize(200,200);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        JButton presionado=(JButton)ae.getSource();
	if(presionado==boton16){
            r=n1=n2=0;
            resp.setText("");
	}
        else if(presionado==boton14){
            n2=Double.parseDouble(resp.getText());
            switch(op) {
                case '+': r=n1+n2; break;
                case '-': r=n1-n2; break;
                case '*': r=n1*n2; break;
                case '/': r=n1/n2; break;
            }
            resp.setText(""+r);
	}else{
            boolean opf=false;
            if(presionado==boton10){ 
                op='+';
		opf=true;
            }
            if(presionado==boton11){ 
                op='-';
                opf=true;
            }
            if(presionado==boton12){ 
                op='*';
                opf=true;
            }
            if(presionado==boton13){ 
                op='/';
                opf=true;
            }
            if(presionado==boton15){
                String h = resp.getText()+".";
                resp.setText(h);
            }
            if(opf==false){
  		for(i=0;i<10;i++){
                    if(presionado == boton[i]){
           	   	String t = resp.getText();
           		t+=i;
            		resp.setText(t);
                    }
		}
            }else{
    		n1=Double.parseDouble(resp.getText());
     		resp.setText("");
            }
		}
    }
    /*
    public void initComponentesBorderLayout(){
        this.panelPrincipal = new JPanel();
        panelPrincipal.setBounds(50, 50, 200, 200);
        panelPrincipal.setBackground(Color.GRAY);
        
    }
    */
}

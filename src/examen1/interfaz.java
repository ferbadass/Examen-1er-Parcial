/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class interfaz extends JFrame implements ActionListener{
    
    public interfaz()
    {
        configurarVentana();
        iniciarComponentes();
    }
	JTextField num;
	JButton convertir;
	
	
	
	public void configurarVentana()
    {

        setTitle("Calculadora");
        setSize(450,450);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public void iniciarComponentes()
    {
		
		convertir=new JButton("Convertir");
		convertir.setBounds(100, 100, 100, 50);
		convertir.addActionListener(this);
		add(convertir);
		
	
	
		num=new JTextField();
		num.setBounds(300, 60, 100, 50);
		num.addKeyListener(new KeyAdapter()
        {
        public void keyTyped(KeyEvent e)
        {
        char caracter = e.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) &&
        (caracter != KeyEvent.VK_BACK_SPACE))
        {
        e.consume();
        }}});
       add(num);
	   
	}
	
	
	@Override
    public void actionPerformed(ActionEvent e) 
    {
		
		double dinero=0;
		double dolar = 0;
		if(e.getActionCommand().equals("Convertir"))
       {
		dinero=Double.parseDouble(num.getText());
		dolar=dinero*18.5;
        JOptionPane.showMessageDialog(this, "Tus pesos equivalen a "+dolar+" dolares");
	   }
		
		
	}
    
}

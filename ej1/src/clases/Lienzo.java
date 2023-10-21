package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements ActionListener// Clase HIJA
{
	JButton boton1;
	JButton boton2;
	JLabel etiqueta1;
	public Lienzo()
	{
		setLayout(null); // ubica elementos donde querramos
		etiqueta1 = new JLabel("Hola Mundo");
		boton1 = new JButton("Alterar");
		boton1.setBounds(100,150,100,30);
		boton1.addActionListener(this);
		add(boton1);
		boton2 = new JButton("Volver");
		boton2.setBounds(100,200,100,30);
		boton2.addActionListener(this); 
		add(boton2);
		etiqueta1.setBounds(10,10,100,30); // en esa posicion pondremos el "hola mundo" en la ventana
		add(etiqueta1);
	}

public void actionPerformed(ActionEvent eventito)
{
	if(eventito.getSource() == boton1)
	{
		etiqueta1.setText("Viva Argentina");
	}
	if(eventito.getSource() == boton2)
	{
		etiqueta1.setText("Hola Mundo");
	}
	
}
}
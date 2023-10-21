package clase;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lienzo extends JPanel implements ActionListener
{
	// DECLARO OBJETOS
	JLabel etiqueta;
	JButton []boton = new JButton[3];
	JTextField []area = new JTextField[3];
	
	// DECLARO VARIABLES
	int color[] = {255,255,255};
	
	public Lienzo() // CONSTRUCTOR
	{
		setLayout(null); // PARA CONTROLAR DISTRIBUCION EN PANTALLA
		setBackground(new Color(255,255,255));
		
		// ETIQUETA COLORES
		etiqueta = new JLabel("Colores");
		etiqueta.setBounds(10, 10, 80, 50);
		etiqueta.setFont(new Font("Andale Mono" , 2 , 19));
		add(etiqueta);
		
		// BOTONES Y CAMPOS DE TEXTO
		for (int i=0 ; i<3 ; i++)
		{
			switch (i)
			{
			case 0:
				boton[0] = new JButton("Rojo");
				break;
			case 1:
				boton[1] = new JButton("Verde");
				break;
			case 2:
				boton[2] = new JButton("Azul");
			}
			boton[i].setBounds(100, (100+(i*60)), 100, 50);
			boton[i].setFont(new Font("Andale Mono" , 1 , 19));
			boton[i].setForeground(new Color(255,0,150));
			boton[i].addActionListener(this);
			add(boton[i]);
			
			area[i] = new JTextField("255");
			area[i].setBounds(10, (100+(i*60)), 75, 50);
			add(area[i]);
		}
	}
	
	public void actionPerformed (ActionEvent eventito)
	{
		if (eventito.getSource() == boton[0]) // ROJO
		{
			color[0] = Integer.parseInt(area[0].getText());
			if (color[0] < 0)
			{
				color[0] = 0;
			}
			if (color[0] > 255)
			{
				color[0] = 255;
			}
		}
		
		if (eventito.getSource() == boton[1]) // VERDE
		{
			color[1] = Integer.parseInt(area[1].getText());
			if (color[1] < 0)
			{
				color[1] = 0;
			}
			if (color[1] > 255)
			{
				color[1] = 255;
			}
		}
		
		if (eventito.getSource() == boton[2]) // AZUL
		{
			color[2] = Integer.parseInt(area[2].getText());
			if (color[2] < 0)
			{
				color[2] = 0;
			}
			if (color[2] > 255)
			{
				color[2] = 255;
			}
		}
		
		setBackground(new Color(color[0],color[1],color[2])); // PINTAR FONDO
	}
}
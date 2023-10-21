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
	JLabel []etiqueta = new JLabel[2];
	JTextField []area = new JTextField[2];
	JButton []boton = new JButton[3];
	JLabel resistencia;
	
	// DECLARO VARIABLES
	float valor[] = {0,0};
	double valorR=0;
	
	public Lienzo() // CONSTRUCTOR
	{
		setLayout(null);
		setBackground(new Color(240,240,240)); // PINTAR FONDO
		
		// ETIQUETA TENSION Y CORRIENTE
		for (int i=0 ; i<3 ; i++)
		{
			switch (i)
			{
			case 0:
				etiqueta[0] = new JLabel("Tension de fuente (V):");
				boton[0] = new JButton("Rojo");
				break;
			case  1:
				etiqueta[1] = new JLabel("Corriente de fuente (mA):");
				boton[1] = new JButton("Verde");
				break;
			case 2:
				boton[2] = new JButton("Azul");
				break;
			}
			if (i<2)
			{
				etiqueta[i].setBounds(10, (10+(i*60)), 200, 50);
				etiqueta[i].setFont(new Font("Andale Mono" , 1 , 15));
				add(etiqueta[i]);
				etiqueta[i].setVisible(true);
				
				// AREA DE TEXTO TENSION Y CORRIENTE
				area[i] = new JTextField();
				area[i].setBounds(210, (10+(i*60)), 100, 50);
				add(area[i]);
			}
			
			// BOTONES LEDS; 0=ROJO ; 1=VERDE ; 2=AZUL
			boton[i].setBounds(210, (140+(i*50)), 100, 40);
			boton[i].setFont(new Font("Andale Mono" , 1 , 19));
			boton[i].setForeground(new Color(10,10,120));
			boton[i].addActionListener(this);
			add(boton[i]);
		}
		
		// ETIQUETA RESISTENCIA
		resistencia = new JLabel("R =");
		resistencia.setBounds(10, 150, 190, 50);
		resistencia.setFont(new Font("Andale Mono" , 1 , 17));
		resistencia.setForeground(new Color(10,10,10));
		add(resistencia);
		resistencia.setVisible(false);
	}
	
	public void actionPerformed (ActionEvent eventito)
	{
		// BOTONES
		if (eventito.getSource() == boton[0]) // ROJO
		{
			valor[0] = Float.parseFloat(area[0].getText()); // TENSION
			valor[1] = Float.parseFloat(area[1].getText()); // CORRIENTE
			// VERIFICACION CORRIENTE
			if (valor[1] < 10)
			{
				valor[1] = 10;
				area[1].setText("10");
			}
			if (valor[1] > 20)
			{
				valor[1] = 20;
				area[1].setText("20");
			}
			
			// CALCULAR RESISTENCIA CON 1,8V
			valorR = (valor[0] - 1.8) / (valor[1] * 0.001);
			resistencia.setText("R (Ohm) = " + valorR);
			resistencia.setVisible(true);
		}
		
		if (eventito.getSource() == boton[1]) // VERDE
		{
			valor[0] = Float.parseFloat(area[0].getText()); // TENSION
			valor[1] = Float.parseFloat(area[1].getText()); // CORRIENTE
			// VERIFICACION CORRIENTE
			if (valor[1] < 10)
			{
				valor[1] = 10;
				area[1].setText("10");
			}
			if (valor[1] > 20)
			{
				valor[1] = 20;
				area[1].setText("20");
			}
			
			// CALCULAR RESISTENCIA CON 2,2V
			valorR = (valor[0] - 2.2) / (valor[1] * 0.001);
			resistencia.setText("R (Ohm) = " + valorR);
			resistencia.setVisible(true);
		}
		
		if (eventito.getSource() == boton[2]) // AZUL
		{
			valor[0] = Float.parseFloat(area[0].getText()); // TENSION
			valor[1] = Float.parseFloat(area[1].getText()); // CORRIENTE
			// VERIFICACION CORRIENTE
			if (valor[1] < 10)
			{
				valor[1] = 10;
				area[1].setText("10");
			}
			if (valor[1] > 20)
			{
				valor[1] = 20;
				area[1].setText("20");
			}
			
			// CALCULAR RESISTENCIA CON 3,4V
			valorR = (valor[0] - 3.4) / (valor[1] * 0.001);
			resistencia.setText("R (Ohm) = " + valorR);
			resistencia.setVisible(true);
		}
		
	}
}
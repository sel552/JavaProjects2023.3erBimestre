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
	JLabel []etiqueta = new JLabel[2];
	JTextField []area = new JTextField[2];
	JButton boton;
	JLabel masaCorporal;
	JLabel rango;
	
	float peso, altura, masa;
	
	public Lienzo()
	{
		setLayout(null);
		setBackground(new Color(191,191,191));
		
		for (int i=0 ; i<2 ; i++) // ETIQUETA Y CAMPO DE TEXTO PESO Y ALTURA
		{
			if (i==0) // 0 = PESO
			{
				etiqueta[i] = new JLabel("Ingrese el peso en kilogramos");
			}
			else // 1 = ALTURA
			{
				etiqueta[i] = new JLabel("Ingrese la altura en metros");
			}
			etiqueta[i].setBounds(100, (i*100), 200, 80);
			add(etiqueta[i]);
			
			area[i] = new JTextField();
			area[i].setBounds(100, (50+i*100), 100, 50);
			add (area[i]);
		}
		
		boton = new JButton ("Calcular indice de masa corporal"); // BOTON CALCULAR
		boton.setBounds(100, 250, 300, 50);
		boton.addActionListener(this);
		add(boton);
		boton.setVisible(true);
		
		masaCorporal = new JLabel(" ");
		masaCorporal.setBounds(100, 300, 300, 80);
		//masaCorporal.setFont(new Font("Andale Mono" , 1, 14));
		add(masaCorporal);
		masaCorporal.setVisible(true);
		
		rango = new JLabel("<html>El indice de masa corporal<br>se encuentra fuera del rango esperado</html>");
		rango.setBounds(100, 350, 300, 80);
		rango.setFont(new Font("Andale Mono" , 1, 14));
		rango.setForeground(new Color(255,255,255));
		add(rango);
		rango.setVisible(false);
	}
	
	public void actionPerformed (ActionEvent eventito)
	{
		if (eventito.getSource() == boton)
		{
			peso = Float.parseFloat(area[0].getText());
			altura = Float.parseFloat(area[1].getText());
			masa = (peso/(altura*altura));
			masaCorporal.setText("El indice de masa corporal es: " + masa);
			masaCorporal.setVisible(true);
			
			if (masa < 18 || masa > 25)
			{
				rango.setVisible(true);
			}
			else
			{
				rango.setVisible(false);
			}
		}
	}
}

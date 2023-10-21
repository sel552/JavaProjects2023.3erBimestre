package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lamina extends JPanel implements ActionListener
{
	JLabel textito1;
	JButton[] botones = new JButton[16];
	char simbolos[] = {'*','/','-','+','C','0','='};
	boolean iniciar = false,operacion = false,validador = false;
	int funcion; // Número identificador de la operación aritmética
	long num1 = 0,num2 = 0;
	public Lamina()
	{
		setLayout(null);
		
		int i,j = 0;
	
		for(i = 0; i < 4;i++)
		{
			for(j = 0; j < 4;j++)
			{
				if (i <= 2 && j <= 2)
				{
					botones[j+i*4] = new JButton(""+(i*3+1+j));
					botones[j+i*4].setBackground(new Color(180,180,180));
				}
				if (j == 3)
				{
					botones[j+i*4] = new JButton(""+simbolos[i]);
					botones[j+i*4].setBackground(new Color(180,180,180));
				}
				if (i == 3)
				{
					if (j == 0)
					{
						botones[j+i*4] = new JButton(""+simbolos[4]);
						botones[j+i*4].setBackground(new Color(255,0,0));
					}
					if (j == 1)
					{
						botones[j+i*4] = new JButton(""+simbolos[5]);
						botones[j+i*4].setBackground(new Color(180,180,180));
					}
					if (j == 2)
					{
						botones[j+i*4] = new JButton(""+simbolos[6]);
						botones[j+i*4].setBackground(new Color(180,180,180));
					}
				}
				botones[j+i*4].setBounds(30+88*j,100+i*88,70,70);
				botones[j+i*4].setFont(new Font("Andale Mono", 1, 14));
				botones[j+i*4].setForeground(new Color(255,255,255));
				botones[j+i*4].addActionListener(this);
				add(botones[j+i*4]);
			}
		}
		textito1 = new JLabel("Escriba su fórmula");
		textito1.setBounds(30,40,300,30);
		textito1.setFont(new Font("Andale Mono", 1, 24));
		textito1.setForeground(new Color(0,0,0));
		add(textito1);

	}
	
	public void actionPerformed(ActionEvent eventito)
	{
		int i;
		if (iniciar == false)
		{
			textito1.setText("");
			iniciar = true;
		}
		
		for(i=0;i<16;i++)
		{
			if (eventito.getSource() == botones[i])
			{
				if (i == 13 || (!((i+1)%4 == 0) && i < 12)) // Números
				{
					textito1.setText(textito1.getText()+botones[i].getText());
					if (validador == false)
					{
						validador = true;
					}
				}
				if (i == 12) // Borrar
				{
					textito1.setText("");
					operacion = false;
					validador = false;
				}
				if ((i+1)%4 == 0) // Operaciones
				{
					if (operacion == false && validador == true)
					{
						num1 = Integer.parseInt(textito1.getText());
						textito1.setText("");
						funcion = (i+1)/4;
						operacion = true;
						validador = false;
					}
				}
				if (i == 14) // Igual
				{
					if (validador == true && operacion == true)
					{
						num2 = Integer.parseInt(textito1.getText());
						switch(funcion)
						{
							case 1:  textito1.setText(""+(num1*num2));break;
							case 2:  textito1.setText(""+(num1/num2));break;
							case 3:  textito1.setText(""+(num1-num2));break;
							case 4:  textito1.setText(""+(num1+num2));break;
						}
						operacion = false;
						iniciar = false;
						validador = false;
					}
				}
			}
		}
	}
}

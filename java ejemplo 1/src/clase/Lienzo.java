package clase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lienzo extends JPanel implements ActionListener
{
	JButton boton1;
	JLabel etiqueta1;
	JButton [][]botones = new JButton[4][4]; // [fila = i][columna = j]
	JTextField campo1;
	
	int ingresar = 0;
	int i, j;
	int numeritoingresado;
	float numero1 = 0;
	float numero2 = 0;
	String operacion;
	float rta;
	
	public Lienzo() // CREAR BOTONCITOS
	{
		setLayout(null);
		etiqueta1 = new JLabel("Introducir el valor");
		etiqueta1.setBounds(100,100,100,30);
		add(etiqueta1);
		//	boton1 = new JButton("Alterar");
		//	boton1.setBounds(100,200,100,30);
		//	boton1.addActionListener(this);
		//	add(boton1);
		
		// BOTONES DEL 1 AL 9 DE NUMEROS
		int num = 1;
		for (j=0 ; j<3 ; j++) // COLUMNAS
		{
			for (i=0 ; i<3 ; i++) // FILAS
			{
				botones[i][j] = new JButton (" " + (num));
				botones[i][j].setBounds((20+(i*60)), 250-(j*50), 50, 40);
				botones[i][j].addActionListener(this);
				add(botones[i][j]);
				num = num+1;
			}
		}
		botones[3][0] = new JButton ("0"); // BOTON NUMERO 0
		botones[3][0].setBounds(20, 300, 50, 40);
		botones[3][0].addActionListener(this);
		add(botones[3][0]);
		
		botones[0][3] = new JButton ("/"); // BOTON DIVIDIR
		botones[0][3].setBounds(200, 150, 50, 40);
		botones[0][3].addActionListener(this);
		add(botones[0][3]);
		
		botones[1][3] = new JButton ("*"); // BOTON MULTIPLICAR
		botones[1][3].setBounds(200, 200, 50, 40);
		botones[1][3].addActionListener(this);
		add(botones[1][3]);
		
		botones[2][3] = new JButton ("-"); // BOTON RESTA
		botones[2][3].setBounds(200, 250, 50, 40);
		botones[2][3].addActionListener(this);
		add(botones[2][3]);
		
		botones[3][3] = new JButton ("+"); // BOTON SUMA
		botones[3][3].setBounds(200, 300, 50, 40);
		botones[3][3].addActionListener(this);
		add(botones[3][3]);
		
		botones[3][2] = new JButton ("="); // BOTON IGUAL
		botones[3][2].setBounds(140, 300, 50, 40);
		botones[3][2].addActionListener(this);
		add(botones[3][2]);
		
		botones[3][1] = new JButton ("C"); // BOTON CANCELAR
		botones[3][1].setBounds(80, 300, 50, 40);
		botones[3][1].addActionListener(this);
		add(botones[3][1]);
		
		//campo1 = new JTextField ();
		//campo1.setBounds(10, 100, 100, 300);
		//add (campo1);
	}
	
public void actionPerformed (ActionEvent eventito) // INTERRUPCION POR BOTON
{
	/* if (eventito.getSource() == boton1)
	{
		etiqueta1.setText("Viva Argentina!");
	} */
	
	if (eventito.getSource() == botones[0][0]) // BOTON 1 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "1");
	}
	if (eventito.getSource() == botones[1][0]) // BOTON 2 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "2");
	}
	if (eventito.getSource() == botones[2][0]) // BOTON 3 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText(" ");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "3");
	}
	if (eventito.getSource() == botones[0][1]) // BOTON 4 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "4");
	}
	if (eventito.getSource() == botones[1][1]) // BOTON 5 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "5");
	}
	if (eventito.getSource() == botones[2][1]) // BOTON 6 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "6");
	}
	if (eventito.getSource() == botones[0][2]) // BOTON 7 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "7");
	}
	if (eventito.getSource() == botones[1][2]) // BOTON 8 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "8");
	}
	if (eventito.getSource() == botones[2][2]) // BOTON 9 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "9");
	}
	if (eventito.getSource() == botones[3][0]) // BOTON 0 DE LA CLACULADORA
	{
		if (ingresar == 0)
		{
			etiqueta1.setText("");
			ingresar = 1;
		}
		etiqueta1.setText(etiqueta1.getText() + "0");
	}
	
	// -----------------------------------------------------------------------------------------------------------------------------
	
	if (eventito.getSource() == botones[3][1]) // CANCELAR
	{
		etiqueta1.setText("");
		numero1 = 0;
		numero2 = 0;
	}
	
	if (eventito.getSource() == botones[0][3]) // DIVIDIR
	{
		numero1 = Float.parseFloat(etiqueta1.getText());
		etiqueta1.setText("");
		operacion = "/";
	}
	
	if (eventito.getSource() == botones[1][3]) // MULTIPLICAR
	{
		numero1 = Float.parseFloat(etiqueta1.getText());
		etiqueta1.setText("");
		operacion = "*";
	}
	
	if (eventito.getSource() == botones[2][3]) // RESTA
	{
		numero1 = Float.parseFloat(etiqueta1.getText());
		etiqueta1.setText("");
		operacion = "-";
	}
	
	if (eventito.getSource() == botones[3][3]) // SUMA
	{
		numero1 = Float.parseFloat(etiqueta1.getText());
		etiqueta1.setText("");
		operacion = "+";
	}
	
	if (eventito.getSource() == botones[3][2]) // IGUAl
	{
		//numero = Float.parseFloat(etiqueta1.getText());
		//etiqueta1.setText("" + rta);
		numero2 = Float.parseFloat(etiqueta1.getText());
		
		if (operacion == "+")
		{
			rta = numero1 + numero2;
			etiqueta1.setText("" + rta);
		}
		if (operacion == "-")
		{
			rta = numero1 - numero2;
			etiqueta1.setText("" + rta);
		}
		if (operacion == "*")
		{
			rta = numero1 * numero2;
			etiqueta1.setText("" + rta);
		}
		if (operacion == "/")
		{
			rta = numero1 / numero2;
			etiqueta1.setText("" + rta);
		}
	}
}
}
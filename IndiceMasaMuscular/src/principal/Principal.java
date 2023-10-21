package principal;

import javax.swing.JFrame;

import clase.Ventana;

public class Principal {

	public static void main(String[] args) 
	{
		Ventana interfaz = new Ventana();
		interfaz.setBounds(0,0,500,500);
		interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
	}
}
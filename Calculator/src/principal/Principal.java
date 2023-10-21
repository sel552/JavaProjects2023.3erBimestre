package principal;

import javax.swing.JFrame;
import clases.Ventana;

public class Principal
{
	public static void main(String args[])
	{
		Ventana interfaz_1 = new Ventana();
		interfaz_1.setBounds(0,0,400,500); 
		interfaz_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		interfaz_1.setVisible(true);
		interfaz_1.setLocationRelativeTo(null);
		interfaz_1.setResizable(false);
	}
}
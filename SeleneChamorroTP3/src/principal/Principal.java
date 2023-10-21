package principal;

import clase.Ventana;

public class Principal
{
	public static void main(String[]args)
	{
		Ventana interfaz = new Ventana();
		interfaz.setBounds(100, 100, 400, 400);
		interfaz.setVisible(true);
		interfaz.setLocationRelativeTo(null);
	}
}
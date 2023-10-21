package clase;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	public Ventana() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Colores");
		setLocationRelativeTo(null);
		
		Lienzo Lienzo = new Lienzo();
		add(Lienzo);
	}
}
package clase;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	public Ventana() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Valores Resistencias de LEDs");
		setLocationRelativeTo(null);
		
		Lienzo Lienzo = new Lienzo();
		add(Lienzo);
	}
}
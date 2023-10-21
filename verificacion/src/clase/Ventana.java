package clase;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	public Ventana()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Vende tu alma");
		setLocationRelativeTo(null);
		
		Lienzo lienzo = new Lienzo();
		add (lienzo);
	}

}

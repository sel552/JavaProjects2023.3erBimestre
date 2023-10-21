package clase;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	public Ventana()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Indice Masa Muscular");
		setLocationRelativeTo(null);
		
		Lienzo lienzo =new Lienzo();
		add(lienzo);
	}
}

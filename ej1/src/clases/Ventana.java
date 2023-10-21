package clases;

import javax.swing.JFrame;

public class Ventana extends JFrame // Clase HIJA
{
	public Ventana()
	{
		setBounds(100,100,400,500); // x, y, ancho, alto
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setTitle("Hola");
	//setLocationRelativeTo(null) // independeintememte de los valores que tengamos, centra 
		Lienzo Lienzo = new Lienzo();
		add(Lienzo); // para que lienzo se agregue a la ventana
	}
}

package principal; // clase MADRE
import clases.Ventana;

public class Principal 
{
	public static void main(String[]args)
	{
		Ventana interfaz = new Ventana(); // reservo memoria = asigno esa memoria
		interfaz.setBounds(100,100,400,500); // interfaz es un objeto y ventana una clase.
		interfaz.setVisible(true); // esto sirve para que se muestre la ventana de windows
	}
}

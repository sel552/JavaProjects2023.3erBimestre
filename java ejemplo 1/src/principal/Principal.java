package principal;

import clase.Ventana;

public class Principal {

	public static void main(String[] args) 
	{
		Ventana interfaz = new Ventana();
		interfaz.setBounds(100,100,400,500); // x , y , ancho , alto
		interfaz.setVisible(true);
	}

}

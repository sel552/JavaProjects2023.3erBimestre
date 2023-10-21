package clase;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

public class Lienzo extends JPanel implements ActionListener, ChangeListener
{
	JLabel etiquetaAceptar;
	JButton continuar;
	JCheckBox casillaAceptar;
	JLabel etiquetaYaAceptado;
	
	public Lienzo() // CONSTRUCTOR
	{
		setLayout(null);
		etiquetaAceptar = new JLabel ("Aceptar terminos y condiciones");
		etiquetaAceptar.setBounds(60, 60, 200, 80);
		add(etiquetaAceptar);
		
		continuar = new JButton ("Continuar");
		continuar.setBounds(50, 150, 100, 50);
		continuar.addActionListener(this);
		add (continuar);
		continuar.setEnabled(false);  // PARA QUE QUEDE DESACTIVADO DESDE UN COMIENZO
		
		casillaAceptar = new JCheckBox();
		casillaAceptar.setBounds(30, 85, 30, 30);
		casillaAceptar.addChangeListener(this);
		add (casillaAceptar);
		
		etiquetaYaAceptado = new JLabel("Los terminos y condiciones han sido aceptados");
		etiquetaYaAceptado.setBounds(50, 200, 300, 100);
		add(etiquetaYaAceptado);
		etiquetaYaAceptado.setVisible(false);
	}
	
	public void stateChanged (ChangeEvent eventito)
	{
		if (casillaAceptar.isSelected())
		{
			continuar.setEnabled(true); // SI SE CHECKEA SE HABILITA EL BOTON CONTINUAR
		}
		else
		{
			continuar.setEnabled(false);
			etiquetaYaAceptado.setVisible(false);
		}
	}
	
	public void actionPerformed(ActionEvent eventito)
	{
		if (eventito.getSource() == continuar)
		{
			etiquetaYaAceptado.setVisible(true); // SI SE APRETA CONTINUAR SE AGREGA LA ETIQUETA
		}
	}
	
}

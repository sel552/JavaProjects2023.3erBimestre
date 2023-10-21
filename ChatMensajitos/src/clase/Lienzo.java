package clase;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;

public class Lienzo extends JPanel implements ActionListener
{
	JTextArea mensajes;
	JScrollPane flechita;
	JTextField escribe;
	JButton enviar;
	int inicio=0;
	
	public Lienzo()
	{
		setLayout(null);
		
		mensajes = new JTextArea();
		mensajes.setEditable (false);
		mensajes.setFont(new Font("Andale Mono", 1, 14));
		flechita = new JScrollPane (mensajes);
		flechita.setBounds(300, 50, 300, 400);
		add (flechita);
		
		enviar = new JButton("Enviar");
		enviar.setBounds(100, 200, 100, 60);
		enviar.setFont(new Font("Andale Mono", 1, 14));
		enviar.setForeground(new Color(255,255,255));
		enviar.addActionListener(this);
		add (enviar);
		
		escribe = new JTextField();
		escribe.setBounds(100, 50, 100, 100);
		add (escribe);
	}
	
	public void actionPerformed(ActionEvent eventito)
	{
		if (eventito.getSource() == enviar)
		{
			if (inicio == 0)
			{
				mensajes.setText(escribe.getText());
				escribe.setText("");
				inicio = 1;
			}
			else
			{
				mensajes.setText(mensajes.getText() + "\n" + escribe.getText());
				escribe.setText("");
			}
		}
	}
}

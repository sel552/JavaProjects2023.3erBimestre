package clase;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lienzo extends JPanel implements ActionListener, ChangeListener
{
	// DECLARO OBJETOS
	JLabel studentRecord;
	JLabel []etiqueta = new JLabel[4];
	JButton transcript;
	JCheckBox cursando;
	JTextField []area = new JTextField[3];
	JLabel []materia = new JLabel[5];
	JTextField []nota = new JTextField[5];
	JTextArea informe;
	JScrollPane flechita;
	
	// DECLARO VARIABLES
	float maths, english, biology, chemistry, business, average=0;
	
	public Lienzo() // CONSTRUCTOR
	{
		setLayout(null);
		
		// ETQIUETA STUDENT RECORD
		studentRecord = new JLabel("Student Record:");
		studentRecord.setBounds(10, 10, 200, 50);
		studentRecord.setFont(new Font("Andale Mono" , 2 , 19));
		add(studentRecord);
		studentRecord.setVisible(true);
		
		// ETIQUETAS Y AREAS DE TEXTO
		for (int i=0; i<5 ; i++)
		{
			switch(i)
			{
			case 0:
				etiqueta[0] = new JLabel("Student ID:");
				materia[0] = new JLabel("Maths:");
				break;
			case 1:
				etiqueta[1] = new JLabel("Firstname:");
				materia[1] = new JLabel("English:");
				break;
			case 2:
				etiqueta[2] = new JLabel("Surname:");
				materia[2] = new JLabel("Biology:");
				break;
			case 3:
				etiqueta[3] = new JLabel("Cursando:");
				materia[3] = new JLabel("Chemistry:");
				break;
			case 4:
				materia[4] = new JLabel("Business:");
				break;
			}
			if (i<4)
			{
				etiqueta[i].setBounds(10, (60+(i*50)), 100, 50);
				add(etiqueta[i]);
				etiqueta[i].setVisible(true);
			}
			
			if (i < 3)
			{
				area[i] = new JTextField();
				area[i].setBounds(115, (60+(i*50)), 100, 40);
				add(area[i]);
			}
			
			materia[i].setBounds(10, (260+(i*50)), 100, 50);
			add(materia[i]);
			materia[i].setVisible(true);
			
			nota[i] = new JTextField();
			nota[i].setBounds(115, (260+(i*50)), 100, 40);
			add(nota[i]);
		}
		// CASILLA VERIFICACION
		cursando = new JCheckBox();
		cursando.setBounds(130, 220, 30, 30);
		cursando.addChangeListener(this);
		add(cursando);
		
		informe = new JTextArea();
		informe.setEditable (false);
		informe.setFont(new Font("Andale Mono", 1, 14));
		flechita = new JScrollPane (informe);
		flechita.setBounds(250, 80, 300, 300);
		add (flechita);
		
		transcript = new JButton("Transcript");
		transcript.setBounds(40, 510, 150, 35);
		transcript.addActionListener(this);
		transcript.setFont(new Font("Andale Mono", 1, 14));
		add(transcript);
		transcript.setEnabled(false);
	}
	
	public void actionPerformed (ActionEvent eventito)
	{
		// BOTONES
		if (eventito.getSource() == transcript)
		{
			maths = Float.parseFloat(nota[0].getText());
			english = Float.parseFloat(nota[1].getText());
			biology = Float.parseFloat(nota[2].getText());
			chemistry = Float.parseFloat(nota[3].getText());
			business = Float.parseFloat(nota[4].getText());
			average = (maths+english+biology+chemistry+business) / 5;
			
			informe.setText("Student Result Recording System" + "\n\n");
			informe.setText(informe.getText() + "Student: " + area[1].getText() + " " + area[2].getText()+ "\n");
			informe.setText(informe.getText() + "Student ID: " + area[0].getText() + "\n\n");
			informe.setText(informe.getText() + "Maths: " + nota[0].getText() + "\n");
			informe.setText(informe.getText() + "English: " + nota[1].getText() + "\n");
			informe.setText(informe.getText() + "Biology: " + nota[2].getText() + "\n");
			informe.setText(informe.getText() + "Chemistry: " + nota[3].getText() + "\n");
			informe.setText(informe.getText() + "Business: " + nota[4].getText() + "\n\n");
			informe.setText(informe.getText() + "Average: " + average);
		}
	}
	
	public void stateChanged (ChangeEvent eventito)
	{
		// CASILLAS
		if (cursando.isSelected())
		{
			transcript.setEnabled(true);
		}
		else
		{
			transcript.setEnabled(false);
		}
	}
}

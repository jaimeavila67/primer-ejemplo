//Es una prueba de Jaime Avila
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class PruebaBoxLayout {
	public static void main(String [] args)
	{
		// Se crea la ventana con el BoxLayout
		JFrame v = new JFrame();
		v.getContentPane().setLayout(new BoxLayout(v.getContentPane(),BoxLayout.Y_AXIS));
		
		// Se crea un bot�n centrado y se a�ade
		JButton boton = new JButton("B");
		boton.setAlignmentX(Component.CENTER_ALIGNMENT);
		v.getContentPane().add(boton);
		
		// Se crea una etiqueta centrada y se a�ade
		JLabel etiqueta = new JLabel("una etiqueta larga");
		etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
		v.getContentPane().add(etiqueta);
		
		// Visualizar la ventana
		v.pack();
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class PruebaGridLayout {
   private static final int COLUMNAS = 10;
   private static final int FILAS = 5;

   public static void main(String [] args)
   {
      JFrame v = new JFrame();
      v.getContentPane().setLayout(new GridLayout(FILAS,COLUMNAS));
		
      JButton [][] boton = new JButton [FILAS][COLUMNAS];
      for (int i=0;i<FILAS;i++)
         for (int j=0;j<COLUMNAS;j++)
         {
            boton[i][j] = new JButton(Integer.toString(i));
            v.getContentPane().add(boton[i][j]);
         }
      v.pack();
      v.setVisible(true);
      v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}
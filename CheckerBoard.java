import javax.swing.JFrame;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.color.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkerBoard {
//fields- creating frame variables 
	public static int rows = 8;
	public static int columns = 8;
	public static Color cl1 = Color.BLACK;
	public static Color cl2 = Color.WHITE;
	
public checkerBoard(){
	
		JFrame checkerBoard = new JFrame();
		checkerBoard.setSize(800,800);
		checkerBoard.setTitle("Single checkerBoard GAME");
		Container pane = checkerBoard.getContentPane();
		pane.setLayout(new GridLayout(rows, columns));
		Color temp;
		for (int i = 0; i < rows; i++){
			if (i%2 == 0){
				temp = cl1;
			}
			else{
				temp = cl2;
			}
			for (int j = 0; j < columns; j++){
				JPanel panel = new JPanel();
				panel.setBackground(temp);
				if (temp.equals(cl1)){
					temp = cl2;
				}
				else{
					temp = cl1;
				}
				pane.add(panel);
			}
		}
		checkerBoard.setVisible(true);
	}	


  public static void main(String[] args) {
	  new checkerBoard();
}

}

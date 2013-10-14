package swing;

import javax.swing.JFrame;


public class BasicFrame extends JFrame {
	
/**
	 * 
	 */
	
BasicFrame(String title) {
		super(title);
		setSize(250, 200);
		setVisible(true);
		}
public static void main(String[] args) {
BasicFrame bf = new BasicFrame ("Tela Simples");
}


}
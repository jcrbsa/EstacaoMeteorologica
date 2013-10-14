package swing;

import javax.swing.*;

public class TesteLabel extends JFrame {

	/**
	 * 
	 */

	public static void main(String[] args)
	{
	JFrame fr = new JFrame();
	JLabel lb = new JLabel("Texto em baixo",new ImageIcon("duke.jpg"),SwingConstants.LEFT);
	lb.setHorizontalTextPosition(SwingConstants.CENTER);
	lb.setVerticalTextPosition(SwingConstants.BOTTOM);
	fr.getContentPane().add(lb);
	fr.pack();
	fr.setVisible(true);
	}
}
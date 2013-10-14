package swing;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	
//	MyFrame(String titulo)
//	{
//	super(titulo);
//	}
	
	//Exemplo 5
//	MyFrame(String titulo)
//	{
//	super(titulo);
//	setSize(200,200);
//	setBackground(Color.blue);
//	setVisible(true);
//	}
	
	/**
	 * 
	 */

	public static void main (String args[]) 
{
//		//Exemplo 2
////	MyFrame tela = new MyFrame(); 
////	tela.setTitle ("Tela Exemplo2");
////	tela.setSize(500,500);
////	tela.setBackground(Color.BLUE);
////	tela.setVisible(true);
//		Exemplo3
//		MyFrame tela = new MyFrame("Tela Exemplo 3");
//		tela.setSize(500,500);
//		tela.setBackground(Color.lightGray);
//		tela.setVisible(true);
//		
//		MyFrame tela = new MyFrame(); 
//		tela.setTitle ("Tela1 Exemplo 5");
//		tela.setSize(500,500);
//		tela.setBackground(Color.green);
//		tela.setVisible(true);
//		MyFrame tela2 = new MyFrame(); 
//		tela2.setTitle ("Tela2 Exemplo 5");
//		tela2.setSize(300,300);
//		tela2.setBackground(Color.white);
//		tela2.setVisible(true);
		
		//Exemplo 6
//		MyFrame tela = new MyFrame(); 
//		tela.setTitle ("Tela1 Exemplo 6");
//		tela.setSize(300,300);
//		tela.setBackground(Color.green);
//		tela.setVisible(true);
//		MyFrame tela2 = new MyFrame(); 
//		tela2.setTitle ("Tela2 Exemplo 6");
//		tela2.setSize(500,500);
//		tela2.setBackground(Color.white);
//		tela2.setVisible(true);
//		tela2.toBack();
		
		//Exemplo 7
		MyFrame tela2 = new MyFrame(); 
		tela2.setTitle ("Tela Exemplo 7");
		tela2.setSize(500,500);
		tela2.setBackground(Color.white);
		tela2.setVisible(true);
		JWindow tela = new JWindow(tela2); 
		tela.setSize(300,300);
		tela.setBackground(Color.green);
		tela.setVisible(true);
		
}

}

//Exemplo 4
// class ChamaMyJFrame
//{
//public static void main(String args[])
//{
//MyFrame tela = new MyFrame("Minha Tela");
//}
//}

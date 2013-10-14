package swing;

import java.awt.*;
import javax.swing.*;
public class PanelDemo {
private JPanel painelAzul;
private JPanel painelVermelho;
private JFrame janelaDemo;
private ImageIcon image;


public PanelDemo() {
painelAzul = new JPanel();
painelVermelho = new JPanel();
janelaDemo = new JFrame();
image = new ImageIcon("C:\\Documents and Settings\\jcrbsa\\Meus documentos\\Minhas imagens\\Revista_Pokemon_Panini");
painelAzul.setBackground(Color.blue);
painelVermelho.setBackground(Color.red);
painelAzul.setSize(50,50);
painelVermelho.setSize(100,100); 
janelaDemo.getContentPane().setLayout(null);
janelaDemo.setSize(200,200);
janelaDemo.getContentPane().add(painelAzul);
janelaDemo.getContentPane().add(painelVermelho);

painelAzul.setLocation(10,10);
painelVermelho.setLocation(10,70);
janelaDemo.setVisible(true);


}


public static void main(String[] args) {
PanelDemo p = new PanelDemo();
}
}
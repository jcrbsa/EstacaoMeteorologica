package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TesteEvento {
public static void main (String args[])
{
JFrame j = new JFrame("Teste de evento");
JButton b = new JButton("Pressione-me!");
b.addActionListener(new ActionDemo());
j.getContentPane().add(b, BorderLayout.CENTER);
j.pack();
j.setVisible(true);
}
}
class ActionDemo implements ActionListener {
public void actionPerformed (ActionEvent e){
System.out.println("Acao executada");
}
}
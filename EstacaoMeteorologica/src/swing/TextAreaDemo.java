package swing;

import java.awt.*;
import javax.swing.*;
public class TextAreaDemo
{
public TextAreaDemo()
{
JLabel lNome = new JLabel("Observação:");
JTextArea tArea = new JTextArea("",5,30);
JScrollPane sp = new JScrollPane(tArea,
JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
JPanel painelLabel = new JPanel();
JFrame janelaDemo = new JFrame();
painelLabel.add(lNome );
painelLabel.add(sp );
janelaDemo.getContentPane().add(painelLabel);
janelaDemo.pack();
janelaDemo.setVisible(true);
}
public static void main(String[] args)
{
TextAreaDemo t = new TextAreaDemo();
}
}
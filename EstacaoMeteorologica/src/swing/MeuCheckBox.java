package swing;

import java.awt.*;
import javax.swing.*;
public class MeuCheckBox extends JFrame
{
public static void main(String args[])
{
MeuCheckBox window = new MeuCheckBox();
JPanel p = new JPanel();
window.getContentPane().add(p);
JCheckBox negrito = new JCheckBox( "Negrito" );
p.add( negrito ); 
JCheckBox italico = new JCheckBox( "Itálico" );
p.add( italico ); 
window.pack();
window.setVisible(true);
}
}

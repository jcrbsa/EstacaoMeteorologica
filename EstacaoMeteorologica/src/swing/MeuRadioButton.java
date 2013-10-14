package swing;

import java.awt.*;
import javax.swing.*;
public class MeuRadioButton extends JFrame
{
public static void main(String args[])
{
MeuRadioButton window = new MeuRadioButton ();
JPanel p = new JPanel();
window.getContentPane().add(p);
JRadioButton masculino = new JRadioButton
( "Masculino" );
p.add( masculino ); 
JRadioButton feminino = new JRadioButton( "Feminino" );
p.add( feminino );
ButtonGroup grupo = new ButtonGroup ();
grupo.add(masculino); 
grupo.add(feminino); 
window.pack();
window.setVisible(true);
}
}
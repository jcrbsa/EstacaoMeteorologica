package swing;

import javax.swing.*;
import java.awt.*;
public class ExemploJComboBoxArray {
public ExemploJComboBoxArray() {
JFrame f = new JFrame("Exemplo com Array");
String[] dados = {"Melancia", "Abacate", "Melão" }; 
JComboBox comboBox = new JComboBox(dados);
comboBox.setBounds(10,10,200,30);
f.getContentPane().setLayout(null); 
f.getContentPane().add(comboBox); 
f.setSize(300,100);
f.setVisible(true); 
}
public static void main(String args[]) {
ExemploJComboBoxArray e = new ExemploJComboBoxArray();
}
}
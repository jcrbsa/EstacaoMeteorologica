package swing;

import java.awt.*;
public class ButtonDemo
{
private Button[] botoes;
private Frame janelaDemo;
public ButtonDemo()
{
janelaDemo = new Frame("Botões");
janelaDemo.setLayout(new FlowLayout());
botoes = new Button[5];
for(int i = 0; i< botoes.length;i++)
{
botoes[i] = new Button("Botão "+i);
janelaDemo.add(botoes[i]);
}
janelaDemo.pack();
}
public void mostraExemplo()
{
janelaDemo.setVisible(true);
}
public static void main(String[] args)
{
ButtonDemo t = new ButtonDemo();
t.mostraExemplo();
}
}

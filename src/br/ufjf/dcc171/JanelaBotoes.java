
package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaBotoes extends JFrame {
    private final JButton botaoEnfeitado = new JButton("Clique-me!");
    private final JButton botaoSimples = new JButton("Clique-me2! ");
            
    public JanelaBotoes() throws HeadlessException{
        super("Botoões");
        setLayout(new FlowLayout());
        add(botaoSimples);
      botaoEnfeitado.setIcon(new ImageIcon("resources/index.png"));
      botaoEnfeitado.setRolloverIcon(new ImageIcon("resources/feliz.jpg"));
        add(botaoEnfeitado);
        
        BotaoClicado bc = new BotaoClicado();
        botaoSimples.addActionListener(bc);
        botaoEnfeitado.addActionListener(bc);
        
       
    }

    private class BotaoClicado implements ActionListener {

        private int simples =0;
        private int enfeitado =0;
        
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==botaoSimples){
               simples++;
               JOptionPane.showMessageDialog(null, "Botão simples clicado!\nsimples:"
                       +simples + "Enfeitado"
                       +enfeitado,"Click!",  JOptionPane.INFORMATION_MESSAGE);
           }else if(e.getSource()==botaoEnfeitado){
               enfeitado++;
               JOptionPane.showMessageDialog(null,String.format( "Botão simples clicado!\nsimples:%d Enfeitado:%d ", simples,enfeitado), "Click!", JOptionPane.INFORMATION_MESSAGE);
               
           }
        }
    }
}

// Autor: Juan Carlos Cardoso de Oliveira
package jogodavelha;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JogoDaVelha {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException e) { } 
        catch (ClassNotFoundException e) { } 
        catch (InstantiationException e) { } 
        catch (UnsupportedLookAndFeelException e) { }
        
        JFrame janelaJogo = new JanelaJogo();
        janelaJogo.setVisible(true);
        janelaJogo.setLocationRelativeTo(null);    
    }    
}

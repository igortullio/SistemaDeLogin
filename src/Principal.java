
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        Login obj = new Login("Login");
        obj.setSize(280, 205);                       // Configura o tamanhi do frame
        obj.setLocationRelativeTo(null);             // Posiciona no centro da tela
        obj.setResizable(false);                     // Não é possível redimensionar
        obj.setVisible(true);                        // Torna o frame visível
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

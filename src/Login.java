
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

    private JLabel lbUsuario;
    private JLabel lbSenha;
    private JTextField tfUsuario;
    private JPasswordField pfSenha;
    private JLabel lbEscolha;
    private JCheckBox cbEscolha1;
    private JCheckBox cbEscolha2;
    private JCheckBox cbEscolha3;
    private JLabel lbEspaco1;
    private JLabel lbEspaco2;
    private JButton btEntrar;
    private JButton btNovoUsua;
    private JButton btSair;

    public Login(String titulo) {
        super(titulo);
        setLayout(new FlowLayout());

        lbUsuario = new JLabel("Usuário:");
        add(lbUsuario);

        tfUsuario = new JTextField(15);
        add(tfUsuario);

        lbSenha = new JLabel("Senha:  ");
        add(lbSenha);

        pfSenha = new JPasswordField(15);
        add(pfSenha);

        lbEscolha = new JLabel("Selecione o(s) jogo(s):    ");
        add(lbEscolha);

        cbEscolha1 = new JCheckBox("Adivinhe o Número");
        add(cbEscolha1);

        cbEscolha2 = new JCheckBox("Jogo da Velha");
        add(cbEscolha2);
        
        lbEspaco1 = new JLabel("                            ");
        add(lbEspaco1);
        
        cbEscolha3 = new JCheckBox("Pintar");
        add(cbEscolha3);
        
        lbEspaco2 = new JLabel("                             ");
        add(lbEspaco2);

        btEntrar = new JButton("Entrar");
        btEntrar.setToolTipText("Entrar na aplicação");
        add(btEntrar);

        btNovoUsua = new JButton("Novo Usuário");
        btNovoUsua.setToolTipText("Cadastrar novo usuário");
        add(btNovoUsua);

        btSair = new JButton("Sair");
        btSair.setToolTipText("Fechar aplicação");
        add(btSair);

        // Cria o objeto da classe interna ButtonHandler e o registra para tratamento de evento de botão.
        ButtonHandler handler = new ButtonHandler();
        // Registra o objeto criado para tratar os ActionEvents dos dois botões.
        btEntrar.addActionListener(handler);
        btNovoUsua.addActionListener(handler);
        btSair.addActionListener(handler);
        pfSenha.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {

        @Override     // Sobrescreve o método actionPerformed da interface ActionListener
        public void actionPerformed(ActionEvent event) { // Trata um ActionEvent.

            if (event.getSource() == btNovoUsua) {
                NovoUsuario objNovoUsuario = new NovoUsuario();
                if (objNovoUsuario.getPosicao() < objNovoUsuario.getNomes().length) {
                    objNovoUsuario.setSize(268, 280);
                    objNovoUsuario.setLocationRelativeTo(null);
                    objNovoUsuario.setResizable(false);
                    objNovoUsuario.setIconImage(new ImageIcon(getClass().getResource("Imagens/icone_cadastro.png")).getImage());
                    objNovoUsuario.setVisible(true);
                    objNovoUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de usuários atingido");
                }

            }

            if (event.getSource() == btEntrar || event.getSource() == pfSenha) {
                NovoUsuario objNovoUsuario = new NovoUsuario();
                boolean veriUsuario = false;
                boolean entrar = false;
                int posicaoDoUsuario = 0;
                for (int ct = 0; ct < objNovoUsuario.getNomes().length; ct++) {
                    if (tfUsuario.getText().equals(objNovoUsuario.getNomes()[ct])) {
                        veriUsuario = true;
                        posicaoDoUsuario = ct;
                        break;
                    }
                }
                if (veriUsuario) {
                    if (pfSenha.getText().equals(objNovoUsuario.getSenhas()[posicaoDoUsuario])) {
                        entrar = true;
                    }
                }

                if (entrar) {
                    if (cbEscolha1.isSelected() == false && cbEscolha2.isSelected() == false && cbEscolha3.isSelected() == false) {
                        JOptionPane.showMessageDialog(null, "Selecione pelo menos um jogo");
                    } else {
                        if (cbEscolha1.isSelected() && cbEscolha2.isSelected() && cbEscolha3.isSelected()) { //Os 3 selecionados
                            AdivinharNum objEntrar = new AdivinharNum();
                            objEntrar.setSize(330, 115);
                            objEntrar.setLocationRelativeTo(null);
                            objEntrar.setResizable(false);                     //Não é possível editar o tamanho
                            objEntrar.setVisible(true);                        // Torna o frame visível.
                            objEntrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            
                            JogoDaVelha objjogoDaVelha = new JogoDaVelha();
                            objjogoDaVelha.setVisible(true);
                            
                            JFrame application = new JFrame("Pintar");
                            Pintar objPintar = new Pintar();
                            application.add(objPintar);
                            application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            application.setSize(600, 400);         
                            application.setVisible(true);
                            application.setLocationRelativeTo(null);  
                            application.setResizable(false);    
                            
                            cbEscolha1.setSelected(false);
                            cbEscolha2.setSelected(false);
                            cbEscolha3.setSelected(false);
                        } else {
                            if (cbEscolha1.isSelected() && cbEscolha2.isSelected()) { 
                                AdivinharNum objEntrar = new AdivinharNum();
                                objEntrar.setSize(330, 115);
                                objEntrar.setLocationRelativeTo(null);
                                objEntrar.setResizable(false);                     //Não é possível editar o tamanho
                                objEntrar.setVisible(true);                        // Torna o frame visível.
                                objEntrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                
                                JogoDaVelha objjogoDaVelha = new JogoDaVelha();
                                objjogoDaVelha.setVisible(true);
                            
                                cbEscolha1.setSelected(false);
                                cbEscolha2.setSelected(false);
                            } else {
                                if (cbEscolha1.isSelected() && cbEscolha3.isSelected()) {
                                    AdivinharNum objEntrar = new AdivinharNum();
                                    objEntrar.setSize(330, 115);
                                    objEntrar.setLocationRelativeTo(null);
                                    objEntrar.setResizable(false);                     //Não é possível editar o tamanho
                                    objEntrar.setVisible(true);                        // Torna o frame visível.
                                    objEntrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                                    JFrame application = new JFrame("Pintar");
                                    Pintar objPintar = new Pintar();
                                    application.add(objPintar);
                                    application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    application.setSize(600, 400);         
                                    application.setVisible(true);
                                    application.setLocationRelativeTo(null);  
                                    application.setResizable(false); 
                                    
                                    cbEscolha1.setSelected(false);
                                    cbEscolha3.setSelected(false);
                                } else {
                                    if (cbEscolha2.isSelected() && cbEscolha3.isSelected()) {
                                        JogoDaVelha objjogoDaVelha = new JogoDaVelha();
                                        objjogoDaVelha.setVisible(true);
                                        
                                        JFrame application = new JFrame("Pintar");
                                        Pintar objPintar = new Pintar();
                                        application.add(objPintar);
                                        application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        application.setSize(600, 400);         
                                        application.setVisible(true);
                                        application.setLocationRelativeTo(null);  
                                        application.setResizable(false); 
                                    
                                        cbEscolha2.setSelected(false);
                                        cbEscolha3.setSelected(false);
                                    } else {
                                        if (cbEscolha1.isSelected()) {
                                            AdivinharNum objEntrar = new AdivinharNum();
                                            objEntrar.setSize(330, 115);
                                            objEntrar.setLocationRelativeTo(null);
                                            objEntrar.setResizable(false);                     //Não é possível editar o tamanho
                                            objEntrar.setVisible(true);                        // Torna o frame visível.
                                            objEntrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                                            cbEscolha1.setSelected(false);
                                        } else {
                                            if (cbEscolha2.isSelected()) {
                                                JogoDaVelha objjogoDaVelha = new JogoDaVelha();
                                                objjogoDaVelha.setVisible(true);

                                                cbEscolha2.setSelected(false);
                                            } else {
                                                if (cbEscolha3.isSelected()) {
                                                    JFrame application = new JFrame("Pintar");
                                                    Pintar objPintar = new Pintar();
                                                    application.add(objPintar);
                                                    application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                                    application.setSize(600, 400);         
                                                    application.setVisible(true);
                                                    application.setLocationRelativeTo(null);  
                                                    application.setResizable(false); 
                                    
                                                    cbEscolha3.setSelected(false);
                                                }                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorreto(s)");
                }

            }

            if (event.getSource() == btSair) {
                dispose();
            }

        }
    }
}

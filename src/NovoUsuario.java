
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class NovoUsuario extends JFrame {

    private JLabel lbUsuario;
    private JTextField tfNomeNovoUsuario;
    private JLabel lbSenha;
    private JPasswordField tfSenhaNovoUsuario;
    private JButton btGravar;
    private JButton btCancelar;
    private JButton btSair;
    private JLabel lbsexo;
    private JRadioButton rbSexoMas;
    private JRadioButton rbSexoFem;
    private JLabel lbNaciona;
    private String[] naciona = {"Brasileiro", "Afegão", "Africano", "Albanês", "Alemão", "Americano", "Angolano", "Argelino", "Argentino", "Armenio", "Asiático", "Australiano", 
        "Austríaco", "Belga", "Bielo-russo", "Boliviano", "Britânico", "Bósnio", "Búlgaro", "Camaronês", "Cambojano", "Canadense", "Checo", "Chileno", "Chinês", "Cipriota", "Colombiano", 
        "Congolês", "Costa-riquenho", "Croata", "Cubano", "Dinamarquês", "Dominicano", "Egípcio", "Emirados Árabes Unidos", "Equatoriano", "Escocês", "Eslovaco", "Esloveno", "Espanhol", 
        "Etíope", "Filipino", "Finlandês", "Francês", "Grego", "Guatemalteco", "Haitiano", "Holandês", "Hondurenho", "Húngaro", "Indiano", "Indonésio", "Inglês", "Ioguslavo", "Iraniano", 
        "Iraquiano", "Irlandês", "Islandês", "Israelense", "Italiano", "Jamaicano", "Japonês", "Kuwaitiano", "Letão", "Libanês", "Lituano", "Líbio", "Malaio", "Mexicano", "Mongol", 
        "Morroquino", "Neozelandês", "Nicaraguense", "Nigeriano", "Norte-coreano", "Norueguês", "Panamenho", "Paquistanês", "Paraguaio", "Peruano", "Polaco", "Polonês", "Porto Riquenho", 
        "Português", "Queniano", "Romeno", "Russo", "Salvadorenho", "Senegalês", "Somali", "Sudanês", "Sueco", "Sul-africano", "Sul-coreano", "Suíço", "Sírio", "Tailandês", "Tanzaniano", 
        "Togolonês", "Turco", "Ucraniano", "Uruguaio", "Venezuelano", "Vietnamita", "Árabe saudita"};
    private JComboBox cxNaciona;
    private static String[] nomes = new String[5];
    private static String[] senhas = new String[5];
    private static int posicao = 0;
    private final ButtonGroup bgSexo;
    private JLabel lbGenero;
    private String[] generoJogo = {"Ação", "Aventura", "Estratégia", "RPG", "Esporte", "Corrida", "Jogo on-line", "Simulação",
        "Tabuleiro", "Casual", "Cartas", "Ritmo", "Plataforma", "Puzzle", "Jogo bishōjo"};
    private JButton btCopiar;
    private JList ltGeneroJogo;
    private JList ltCopyGeneroJogo;
    


    public NovoUsuario() {
        super("Cadastro");
        setLayout(new FlowLayout());

        lbUsuario = new JLabel("Usuário:");
        add(lbUsuario);

        tfNomeNovoUsuario = new JTextField(15);
        add(tfNomeNovoUsuario);

        lbSenha = new JLabel("Senha:  ");
        add(lbSenha);

        tfSenhaNovoUsuario = new JPasswordField(15);
        add(tfSenhaNovoUsuario);

        lbsexo = new JLabel("Sexo: ");
        add(lbsexo);

        rbSexoMas = new JRadioButton("Masculino");
        add(rbSexoMas);

        rbSexoFem = new JRadioButton("Feminino");
        add(rbSexoFem);

        bgSexo = new ButtonGroup();
        bgSexo.add(rbSexoMas);
        bgSexo.add(rbSexoFem);

        lbNaciona = new JLabel("Nacionalidade:");
        add(lbNaciona);

        cxNaciona = new JComboBox(naciona);
        cxNaciona.setMaximumRowCount(5);
        add(cxNaciona);
        
        lbGenero = new JLabel("Gênero(s) favorito(s):");
        add(lbGenero);

        ltGeneroJogo = new JList(generoJogo);
        ltGeneroJogo.setVisibleRowCount(5);
        ltGeneroJogo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(ltGeneroJogo));

        btGravar = new JButton("Gravar");
        btGravar.setToolTipText("Salvar cadastro");
        add(btGravar);

        btCancelar = new JButton("Cancelar");
        btCancelar.setToolTipText("Cancelar cadastro");
        add(btCancelar);

        btSair = new JButton("Sair");
        btSair.setToolTipText("Fechar tela de cadastro");
        add(btSair);

        // Cria o objeto da classe interna ButtonHandler e o registra para tratamento de evento de botão.
        ButtonHandler handler = new ButtonHandler();
        // Registra o objeto criado para tratar os ActionEvents dos dois botões.
        //btCopiar.addActionListener(handler);
        btGravar.addActionListener(handler);
        btCancelar.addActionListener(handler);
        btSair.addActionListener(handler);

    }

    public String[] getNomes() {
        return nomes;
    }

    public String[] getSenhas() {
        return senhas;
    }

    public int getPosicao() {
        return posicao;
    }

    private class ButtonHandler implements ActionListener {

        @Override     // Sobrescreve o método actionPerformed da interface ActionListener
        public void actionPerformed(ActionEvent event) { // Trata um ActionEvent.

            /*if (event.getSource() == btCopiar) {
                ltCopyGeneroJogo.setListData(ltGeneroJogo.getSelectedValues());
               
            }*/
            
            if (event.getSource() == btGravar) {
                if (tfNomeNovoUsuario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Usuário obrigatório");
                } else {
                    if (tfSenhaNovoUsuario.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Senha obrigatória");
                    } else {
                        if (rbSexoMas.isSelected() || rbSexoFem.isSelected()) {
                            if(ltGeneroJogo.isSelectionEmpty() == false){
                                nomes[getPosicao()] = tfNomeNovoUsuario.getText();
                                senhas[getPosicao()] = tfSenhaNovoUsuario.getText();
                                posicao++;
                                JOptionPane.showMessageDialog(null, "Cadastro concluido com sucesso!\n"
                                        + "Usuário: " + tfNomeNovoUsuario.getText() 
                                        + "\nSenha: " + tfSenhaNovoUsuario.getText()
                                        + "\nSexo: " + (rbSexoMas.isSelected() ? "Masculino" : "Feminino")
                                        + "\nNacionalidade: " + naciona[cxNaciona.getSelectedIndex()]
                                        + "\nGênero(s): " +Arrays.toString(ltGeneroJogo.getSelectedValues()));

                                tfNomeNovoUsuario.setText("");
                                tfSenhaNovoUsuario.setText("");
                                dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Selecione pelo menos um gênero");
                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "Sexo obrigatório, selecione uma das opções");

                        }
                    }
                }
            }

            if (event.getSource() == btCancelar) {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                tfNomeNovoUsuario.setText("");
                tfSenhaNovoUsuario.setText("");
                bgSexo.clearSelection();
            }

            if (event.getSource() == btSair) {
                dispose();
            }

        }
    }
}

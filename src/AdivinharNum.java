
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Random;

public class AdivinharNum extends JFrame {

    private JButton btGenerateButton;
    private JButton btGuessButton;
    private JTextField tfTextField;
    private JLabel lbGuess;
    private int number;

    public void generate() {
        Random gen = new Random();
        number = gen.nextInt(1000) + 1;
    }

    public void test(int attemp) {

        if (attemp < 0) {
            JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 1000");
        } else if (attemp > 1000) {
            JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 1000");
        } else if (attemp < number) {
            JOptionPane.showMessageDialog(null, "Vovê errou, o número é maior");
        } else if (attemp > number) {
            JOptionPane.showMessageDialog(null, "Vovê errou, o número é menor");
        } else {
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou o número!");
            tfTextField.setEditable(false);
        }
    }

    public AdivinharNum() {
        super("Adivinhe o Número");
        setLayout(new FlowLayout());
        generate();

        //frase principal, pedindo o numero
        lbGuess = new JLabel();
        lbGuess.setText("Digite um número entre 1 e 1000");
        add(lbGuess);

        //criando e adicionando os handlers
        Handler handler = new Handler();

        tfTextField = new JTextField(27);
        tfTextField.addActionListener(handler);
        add(tfTextField);

        btGuessButton = new JButton("Testar");
        btGuessButton.addActionListener(handler);
        add(btGuessButton);

        btGenerateButton = new JButton("Limpar");
        btGenerateButton.addActionListener(handler);
        add(btGenerateButton);

    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

//se o evento for enter
            try {
                if (event.getSource() == tfTextField) {
                    test(Integer.parseInt(event.getActionCommand()));
                } //se o evento for um click no botoão gerar outro número
                else if (event.getSource() == btGenerateButton) {
                    generate();
                    tfTextField.setEditable(true);
                    tfTextField.setText("");
                } //se o evento for um click no botão testar
                else if (event.getSource() == btGuessButton) {
                    test(Integer.parseInt(tfTextField.getText()));
                }
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número, não é permitido letras ou espaços em branco.", "Erro", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

}

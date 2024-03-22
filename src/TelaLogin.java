import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;

    public TelaLogin() {
        // Configurações básicas da janela
        setTitle("Tela de Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout e componentes
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2));

        JLabel labelUsuario = new JLabel("Usuário:");
        JLabel labelSenha = new JLabel("Senha:");

        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();

        JButton botaoLogin = new JButton("Login");

        // Adiciona componentes ao painel
        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(new JLabel()); // Espaço vazio para alinhar corretamente
        painel.add(botaoLogin);

        // Adiciona ação ao botão de login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });

        // Adiciona o painel à janela
        add(painel);

        // Torna a janela visível
        setVisible(true);
    }

    private void realizarLogin() {
        // Lógica de verificação de login (substitua isso pela sua lógica real)
        String usuario = campoUsuario.getText();
        char[] senha = campoSenha.getPassword();
        String senhaStr = new String(senha);

        if ("usuario".equals(usuario) && "senha123".equals(senhaStr)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

            // Aqui você pode criar e exibir a tela home
            TelaHome telaHome = new TelaHome();
            telaHome.setVisible(true);

            // Fechar a tela de login
            dispose(); // Fecha a janela de login após abrir a tela home
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin();
            }
        });
    }
}

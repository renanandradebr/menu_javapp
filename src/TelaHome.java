import javax.swing.*;
import java.awt.*;

public class TelaHome extends JFrame {
    public TelaHome() {
        // Configurações básicas da janela
        setTitle("Tela Home");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando o menu
        JMenuBar menuBar = new JMenuBar();
        JMenu arquivoMenu = new JMenu("Arquivo");
        JMenuItem sairMenuItem = new JMenuItem("Sair");
        arquivoMenu.add(sairMenuItem);
        menuBar.add(arquivoMenu);
        setJMenuBar(menuBar);

        // Criando a barra de pesquisa
        JTextField campoPesquisa = new JTextField();
        campoPesquisa.setPreferredSize(new Dimension(200, 30));

        // Criando os botões
        JPanel painelBotoes = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            JButton botao = new JButton("Botão " + i);
            painelBotoes.add(botao);
        }

        // Adicionando os componentes à janela
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(campoPesquisa, BorderLayout.NORTH);
        contentPane.add(painelBotoes, BorderLayout.CENTER);
        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaHome telaHome = new TelaHome();
            telaHome.setVisible(true);
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game extends JFrame{
    private JPanel gamePanel;
    private JPanel loadingPanel;
    private JButton startBtn;
    private JTextArea dialogBox;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JPanel p1Panel;

    game(){
        setContentPane(gamePanel);
        battleScreen bs = new battleScreen();
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bs.getBattlePanel().setVisible(true);
                gamePanel.setVisible(false);
                setContentPane(bs.getBattlePanel());
            }
        });
    }
    public static void main(String[] args) {
        game app = new game();
        app.setTitle("UGANG LEGENDS");
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}

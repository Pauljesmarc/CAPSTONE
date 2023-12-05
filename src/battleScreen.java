import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class battleScreen extends JFrame{
    private JPanel battlePanel;
    private JButton SKILLButton;
    private JButton SWITCHButton;
    private JTextArea textArea1;
    private JLabel bossIcon;
    private JLabel playerIcon;
    private JLabel bossName;
    private JLabel playerName;
    private JPanel battleScreen;


    public JPanel getBattlePanel() {
        return battlePanel;
    }

    public JPanel getBattleScreen() {
        return battleScreen;
    }
    public battleScreen(){
        setContentPane(battlePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SKILLButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}


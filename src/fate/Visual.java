package fate;

import javax.swing.*;
import java.awt.*;

public class Visual extends JFrame {

    private JButton attack = new JButton("ATTACK");

    private JPanel buttonPanel = new JPanel();

    public Visual() {
        initComponents();
        initFrameSettings();
    }

    private void initComponents(){
        buttonPanel.add(attack);

        JScrollPane scroll = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
    }

    private void initFrameSettings() {
        setSize(1024, 720);
        setLocation(400, 200);
        setResizable(false);
        setTitle("Notepad");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


}

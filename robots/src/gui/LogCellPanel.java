package gui;

import javax.swing.*;
import java.awt.*;

public class LogCellPanel extends JInternalFrame {
    public LogCellPanel(){
        super("Игровое поле", true, true, true, true);
        GameVisualizer myPanel = new GameVisualizer();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(myPanel, BorderLayout.CENTER);
        getContentPane().add(panel);
        pack();
    }
}
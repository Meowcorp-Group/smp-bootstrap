package net.meowcorp.smp.bootstrap;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {
    List<String> jvmArgs;
    public MainWindow(List<String> jvmArgs) {
        this.setTitle("SMP Bootstrapper");

        JPanel panelArgs = new JPanel();
        panelArgs.setLayout(new FlowLayout());

        for (String jvmArg : jvmArgs) {
            panelArgs.add(new JLabel(jvmArg));
        }

        this.add(panelArgs);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,250);
        this.setVisible(true);
    }
}

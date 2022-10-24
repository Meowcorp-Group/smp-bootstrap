package net.meowcorp.smp.bootstrap;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class MainWindow extends Frame {
    List<String> jvmArgs;
    public MainWindow(List<String> jvmArgs) {
        this.setTitle("SMP Bootstrapper");

        Panel panelArgs = new Panel();
        panelArgs.setLayout(new FlowLayout());

        for (String jvmArg : jvmArgs) {
            panelArgs.add(new Label(jvmArg));
        }

        this.add(panelArgs);
//        this.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        this.setSize(500,250);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        this.setVisible(true);
    }
}

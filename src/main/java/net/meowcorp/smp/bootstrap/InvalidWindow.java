package net.meowcorp.smp.bootstrap;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InvalidWindow extends JFrame {
    public InvalidWindow() {
        this.setTitle("Invalid instance detected!");
        this.setSize(500,250);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        this.setVisible(true);
    }
}

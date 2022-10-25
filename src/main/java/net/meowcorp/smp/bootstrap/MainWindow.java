package net.meowcorp.smp.bootstrap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class MainWindow extends Frame {
    List<String> jvmArgs;
    public MainWindow(List<String> jvmArgs) {
        this.setTitle("SMP Bootstrapper");
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Panel panelArgs = new Panel();
        panelArgs.setLayout(new FlowLayout());

        for (String jvmArg : jvmArgs) {
            panelArgs.add(new Label(jvmArg));
        }

//        this.add(panelArgs);
        this.setSize(500,250);

        ScrollPane paneArgs = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
//        paneArgs.setSize(400, 150);
        paneArgs.add(panelArgs);

        this.add(paneArgs);

        Button buttonLaunchFabric = new Button("Launch Fabric");
        this.add(buttonLaunchFabric);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        this.setVisible(true);
    }
}

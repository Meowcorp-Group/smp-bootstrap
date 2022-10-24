package net.meowcorp.smp.bootstrap;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (Objects.equals(System.getProperty("minecraftInstance"), "smpCompatible.instance")) {
            System.out.println("Detected compatible instance!");

            RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
            List<String> jvmArgs = bean.getInputArguments();

            MainWindow mainWindow = new MainWindow(jvmArgs);
        } else {
            System.out.println("Detected incompatible instance!");
            InvalidWindow invalidWindow = new InvalidWindow();
        }
    }
}
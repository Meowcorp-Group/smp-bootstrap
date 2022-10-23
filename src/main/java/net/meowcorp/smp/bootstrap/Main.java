package net.meowcorp.smp.bootstrap;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (System.getProperty("minecraftInstance").equals("smpCompatible.instance")) {
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
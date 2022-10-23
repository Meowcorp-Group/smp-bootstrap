package net.meowcorp.smp.bootstrap;

public class Main {
    public static void main(String[] args) {
        System.out.print("Picked up -DminecraftInstance=");
        System.out.println(System.getProperty("minecraftInstance"));
        if (System.getProperty("minecraftInstance").equals("smpCompatible.instance")) {
            System.out.println("Detected compatible instance!");
            MainWindow mainWindow = new MainWindow();
        } else {
            System.out.println("Detected incompatible instance!");
            InvalidWindow invalidWindow = new InvalidWindow();
        }
    }
}
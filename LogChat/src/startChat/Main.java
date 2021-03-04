package startChat;

import gui.ServerConfig;

import javax.swing.*;

public class Main {
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("Chat Server");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ServerConfig sc = new ServerConfig();
        frame.getContentPane().add(sc);

       
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}

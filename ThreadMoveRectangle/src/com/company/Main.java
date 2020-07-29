package com.company;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setSize(500, 500);
        setContentPane(new Panel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

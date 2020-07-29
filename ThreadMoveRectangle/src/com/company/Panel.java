package com.company;

import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel {
    ThreadMove nit3;
    public Panel() {
        nit3 = new ThreadMove(this);
        nit3.start();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fillRect(nit3.getX(), nit3.getY(), 50, 50);
    }
}
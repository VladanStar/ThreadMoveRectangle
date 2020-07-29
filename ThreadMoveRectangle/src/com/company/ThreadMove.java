package com.company;

public class ThreadMove extends Thread {

    Integer x = 0, y = 150;
    Panel p = null;

    public ThreadMove(Panel p) {
        this.p = p;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            x += 20;
            p.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

            System.out.println("Povecavam X");
        }
    }
}
package com.javaguiv2;

import java.awt.print.Book;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignFrame().setVisible(true);
            }
        });
    }
}
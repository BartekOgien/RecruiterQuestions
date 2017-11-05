package com.recruiter.creators;

import javax.swing.*;

public class TextCreator {

    public JTextArea createTextArea(JFrame frame) {
        JTextArea text = new JTextArea("Tu wyświetli sie tekst pytania");
        text.setBounds(30, 60, 250, 150);
        frame.add(text);
        return text;
    }
}

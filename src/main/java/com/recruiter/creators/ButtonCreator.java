package com.recruiter.creators;

import javax.swing.*;

public class ButtonCreator {

    public JButton createButton(String name, JFrame frame, int x, int y) {
        JButton button = new JButton(name);
        button.setBounds(x, y, 150, 40);
        frame.add(button);
        return button;
    }
}

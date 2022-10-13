package es.ull.shapes;

import javax.swing.*;

public class MyDialog extends JDialog {

    public MyDialog(String text, int width, int height) {
        setTitle(text);
        setLayout(null);
        setBounds(500, 400, width, height);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}

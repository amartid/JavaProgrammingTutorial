package CheckBox64;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;

public class Gui extends JFrame { //inherits everything from JFrame
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public Gui() {
        super("the title");
        setLayout(new FlowLayout());
        tf = new JTextField("This is a sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);
        boldbox = new JCheckBox("bold");

        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);
        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);
    }

    private class HandlerClass implements ItemListener { //when implement should overwrite all methods !
        public void itemStateChanged(ItemEvent event) {
            Font font = null;
            if (boldbox.isSelected() && italicbox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldbox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicbox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
            tf.setFont(font);
        }
    }
}

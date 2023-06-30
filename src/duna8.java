import java.awt.FlowLayout;
import javax.swing.JFrame; //basic window
import javax.swing.JLabel; //output text and images on the screen

public class duna8 extends JFrame{
        private JLabel item1;

        public duna8(){
            super("The title bar");
            setLayout(new FlowLayout());
            item1 = new JLabel("This is a sentence");
            item1.setToolTipText("This is gonna show up on hover");
            add(item1);
        }
}
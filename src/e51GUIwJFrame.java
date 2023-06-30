import javax.swing.JFrame; //basic window


public class e51GUIwJFrame extends JFrame{
    public static void main(String [] args){
        duna8 bucky = new duna8();
        bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //whenever press X program terminates
        bucky.setSize(278,180);
        bucky.setVisible(true);
    }
}
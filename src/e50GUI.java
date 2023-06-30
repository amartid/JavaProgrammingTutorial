import javax.swing.JOptionPane;

public class e50GUI {
    public static void main(String[] args){
        String fn =JOptionPane.showInputDialog("Enter first number");
        String sn =JOptionPane.showInputDialog("Enter second number");
        //showInputDialog only give a string
        //we need to convert the variable to an integer
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        //show the sum
        int sum = num1 + num2;
        //display the sum on a box
        JOptionPane.showMessageDialog(null,"The answer is: "+sum,"Sum",JOptionPane.PLAIN_MESSAGE);


    }
}
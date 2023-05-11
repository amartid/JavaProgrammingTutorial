import java.util.Scanner;
public class e12UseMethodsWithParameters {
    //works with tuna2
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        //scanning variable called input equal to information from the keyboard
        tuna2 tunaObject = new tuna2();
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        tunaObject.simpleMessage(name);
    }
}

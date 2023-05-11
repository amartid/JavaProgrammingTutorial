import java.sql.SQLOutput;
import java.util.Scanner;
public class e13ManyMethodsandInstances {
    //works with tuna3
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        tuna3 tunaObject = new tuna3();
        System.out.println("Enter name of fist girlfriend here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();

    }
}
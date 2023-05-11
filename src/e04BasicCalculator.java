import java.util.Scanner;

public class e04BasicCalculator {

    //Building a Basic Calculator!
    public static void main(String[] args) throws Exception {
    Scanner bucky = new Scanner(System.in);
    double fnum, snum, answer, answer1;
    System.out.println("Enter first num: ");
    fnum = bucky.nextDouble();
    //give its own method in order to save it
    System.out.println("Enter Second Number");
    snum = bucky.nextDouble();
    answer = fnum + snum;
    answer1 = fnum * snum;
    System.out.println(answer);
    System.out.println(answer1);
	}
}


import java.util.Scanner;

public class e05Integers {

    public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		
		int girls, boys, people, people1;
		girls = 7;
		boys = 3;
		people = girls % boys;
        people1 = girls / boys;
        System.out.println("when %");
		System.out.println(people);
        System.out.println("when /");
        System.out.println(people1);
	}
}


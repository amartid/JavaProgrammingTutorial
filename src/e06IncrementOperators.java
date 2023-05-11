import java.util.Scanner;

public class e06IncrementOperators {
	public static void main(String args[]){
		Scanner bucky = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		System.out.println("add 1 to tuna");
		++tuna;
		System.out.println("print tuna");
		System.out.println(tuna);
		System.out.println("add ont to tuna while i print it");
		System.out.println(++tuna);
		System.out.println("PRINT TUNA !");
		System.out.println(tuna);
		System.out.println("add one t tuna after i print it and print it again !");
		System.out.println(tuna++);
		System.out.println(tuna);
		tuna = tuna +8;
		System.out.println(tuna);
		tuna += 8;
		System.out.println(tuna);
	}
}


package Polymorphism2;

public class pacman extends pacFood {
	public void digest(pacFood x) { //pass a food object
		x.eat(); // i can also pass subclasses objects of pacFood Superclass
	}
}
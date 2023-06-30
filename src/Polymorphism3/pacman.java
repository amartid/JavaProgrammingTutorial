package Polymorphism3;

public class pacman extends pacFood {
	// pacFood pf = new pacFood(); cammot create am object when class is abstract
	public void digest(pacFood x) { //pass a food object
		x.eat(); // i can also pass subclasses objects of pacFood Superclass
	}
}
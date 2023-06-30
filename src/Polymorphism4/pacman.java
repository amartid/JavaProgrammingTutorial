package Polymorphism4;

public class pacman extends pacFood {
	// pacFood pf = new pacFood(); cammot create am object when class is abstract
	// pacFood pf = new pacStrawnerrie(); i can do that !
	public void digest(pacFood x) { //pass a food object
		x.eat(); // i can also pass subclasses objects of pacFood Superclass
	}
}
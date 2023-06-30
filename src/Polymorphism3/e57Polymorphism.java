package Polymorphism3;

import javax.swing.*;

//assume that pacman eats food like cherries, bananas, strawberries
//superclass is Polymorphism1.pacFood
//cherries, bananas, strawberries inherit all methods and variables on food class - subclasses
//overwriting -> same argument as superclass
//same arguments on overwriting - consistency in subclasses
//also cannot change scope-visibility
//overloading is when i change the arguments
public class e57Polymorphism extends JFrame{
    public static void main(String [] args){
        pacman mypacman = new pacman();
        pacFood fo = new pacFood();
        pacFood so = new pacStrawnerrie();
        mypacman.digest(fo);
        mypacman.digest(so);
    }
}
package Polymorphism2;

import javax.swing.*;

//assume that pacman eats food like cherries, bananas, strawberries
//superclass is Polymorphism1.pacFood
//cherries, bananas, strawberries inherit all methods and variables on food class - subclasses
public class e56Polymorphism extends JFrame{
    public static void main(String [] args){
        pacman mypacman = new pacman();
        pacFood fo = new pacFood();
        pacFood so = new pacStrawnerrie();
        mypacman.digest(fo);
        mypacman.digest(so);
    }
}
package Polymorphism1;

import javax.swing.*;

//assume that pacman eats food like cherries, bananas, strawberries
//superclass is Polymorphism1.pacFood
//cherries, bananas, strawberries inherit all methods and variables on food class - subclasses

public class e55Polymorphism extends JFrame{
    public static void main(String [] args){
        //Polymorphism1.pacCherry cherry  =  new Polymorphism1.pacCherry();
        // cherry is reference variable
        // cherry is object of a type Polymorphism1.pacCherry
        //Polymorphism1.pacFood cherry2  =  new Polymorphism1.pacCherry(); // anything that inherits from superclass can be assigned to cherry2
        //polymoprphic array
        pacFood bucky[] = new pacFood[2];
        bucky[0] = new pacCherry();
        bucky[1] = new pacBanana();
        //variables are of Polymorphism1.pacFood class
        for(int x=0; x<2; ++x ){
            bucky[x].eat();
        //no need to create an object of every type
        }
    }
}
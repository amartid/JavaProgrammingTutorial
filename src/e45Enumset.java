import java.util.EnumSet;

public class e45Enumset {
    public static void main(String[] args) {
        for(duna3 people:duna3.values()) //this returns an array of the values of the enum
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        //people is the object that we iterate
        System.out.println("\nAnd now for the range of constants!!!\n");

        for(duna3 people: EnumSet.range(duna3.kelsey,duna3.candy))
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        //get specific set of data,
        // loop in specific range of an array
        }

}
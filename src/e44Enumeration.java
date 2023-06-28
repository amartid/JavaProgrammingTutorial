public class e44Enumeration {
    public static void main(String[] args) {
        for(duna2 people:duna2.values()) //this returns an array of the values of the enum
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        //people is the object that we iterate
    }

}
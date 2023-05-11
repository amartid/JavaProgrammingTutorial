public class e41BuildingObjectsforConstructors {
    // uses tuna9
    public static void main(String[] args) {
         //no arguments will set to 0,0,0 and got to tuna(h,m,s)
        //it will set the time to 0 0 0
        tuna9 tunaObject = new tuna9();
        tuna9 tunaObject2 = new tuna9(5);
        tuna9 tunaObject3 = new tuna9(5,13);
        tuna9 tunaObject4 = new tuna9(5,13,43);
        System.out.printf("%s\n", tunaObject.toMilitary());
        System.out.printf("%s\n", tunaObject2.toMilitary());
        System.out.printf("%s\n", tunaObject3.toMilitary());
        System.out.printf("%s\n", tunaObject4.toMilitary());

    }
}
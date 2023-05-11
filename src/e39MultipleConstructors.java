public class e39MultipleConstructors {
    // uses tuna9
    public static void main(String[] args) {
        tuna9 tunaObject = new tuna9();
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
        tunaObject.setTime(13,27,6);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
    }
}
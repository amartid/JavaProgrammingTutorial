public class e36TimeClass {
    // uses tuna5
    public static void main(String[] args) {
        tuna5 tunaObject = new tuna5();
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13,27,6);
        System.out.println(tunaObject.toMilitary());
    }
}
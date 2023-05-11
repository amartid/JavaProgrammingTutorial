public class e38PublicPrivate {
    // uses tuna7
    public static void main(String[] args) {
        tuna7 tunaObject = new tuna7();
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
        tunaObject.setTime(13,27,6);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
    }
}
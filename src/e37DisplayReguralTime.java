public class e37DisplayReguralTime {
    // uses tuna6
    public static void main(String[] args) {
        tuna6 tunaObject = new tuna6();
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
        tunaObject.setTime(13,27,6);
        System.out.println(tunaObject.toMilitary());
        System.out.println(tunaObject.toString());
    }
}
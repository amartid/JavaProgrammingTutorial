public class e32ArraysInMethods {

    public static void main(String[] args) {
        int bucky[]={3,4,5,6,7};
        change(bucky);
        for (int y:bucky)
            System.out.println(y);
    }
    public static void change(int x[]){
        for (int couter=0; couter<x.length; couter++)
            x[couter]+=5;
    }
}
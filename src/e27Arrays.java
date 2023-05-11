import java.util.Random;

public class e27Arrays {

    public static void main(String[] args) {
        int bucky[] = new int[10];
        int bucky2[]={2,4,6,8,10};
        bucky[0] = 87;

        bucky[1] = 543;

        bucky[9] = 63;

        System.out.println(bucky[1]);
        System.out.println(bucky2[1]);
        System.out.println(bucky2);
        for (int i = 0; i < bucky2.length; i++) {
            System.out.print(bucky2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < bucky2.length; i++) {
            System.out.print(bucky2[i]);
            if (i < bucky2.length - 1) {
                System.out.print(", ");
            }
        }



    }
}
public class e29SummingElementsArray {

    public static void main(String[] args) {

        int bucky[] = {32,12,18,54,2};
        int sum=0;

        for (int counter=0; counter<bucky.length; counter++){
            sum+=bucky[counter];
        }
        System.out.println(sum);
    }
}
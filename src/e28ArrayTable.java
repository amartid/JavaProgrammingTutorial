public class e28ArrayTable {

    public static void main(String[] args) {
        System.out.println("Index\tValue"); //header
        int bucky[] = {32,12,18,54,2};

        for (int counter=0; counter<bucky.length; counter++){
            System.out.println(counter + "\t" + bucky[counter]);
        }
    }
}
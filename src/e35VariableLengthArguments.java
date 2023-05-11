public class e35VariableLengthArguments {

    public static void main(String[] args) {
        System.out.println(average(43,56,53,8));
    }
    //... dont know how many arguments
    public static int average( int ...numbers){
        int total = 0;
        for (int x:numbers)
            total+=x;
        return total/numbers.length;
    }
}
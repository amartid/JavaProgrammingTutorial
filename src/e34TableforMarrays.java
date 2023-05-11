public class e34TableforMarrays {

    public static void main(String[] args) {
        int firstarray[][] = {{3, 4, 5, 6, 7}, {3, 4, 5, 6, 7}, {3, 4, 5, 6, 7}};
        int secondarray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};

        System.out.println("This is the 1rst array");
        display(firstarray);
        System.out.println("This is the 2nd array");
        display(secondarray);
    }
    public static void display (int x[] []){
        for (int row=0; row<x.length;row++){
            for (int column=0;column<x[row].length;column++){
                System.out.println(x[row][column]+"\t");
            }
            System.out.println();
        }
    }

}